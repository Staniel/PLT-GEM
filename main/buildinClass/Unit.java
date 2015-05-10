package buildinClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;

public class Unit {

  // Status of this unit.
  public String name;
  public double attack;
  public double defaultAttack;
  public double defense;
  public double defaultDefense;
  public double life;
  public double lifeMax;
  public int chi;
  public int chiMax;
  public Skill[] skills;
  public Skill skill;

  /*
   * Helper variable.
   */
  private String[] effects = {"badly effective", "poorly effective", "somewhat effective",
      "very effective", "super effective"};
  private LinkedList<String> achievements;
  private static Random rng = new Random();

  /**
   * 
   * @param name name of unit.
   * @param attack attack of unit.
   * @param defense defense of unit.
   * @param life life of unit.
   * @param chi chi of unit.
   * @param sk skill of unit.
   */
  public Unit(String name, double attack, double defense, double life, int chi, Skill[] sk) {
    boolean valid = true;

    this.name = name;
    this.attack = attack;
    this.defaultAttack = attack;
    this.defense = defense;
    this.defaultDefense = life;
    this.life = life;
    this.lifeMax = life;
    this.chi = chi;
    this.chiMax = chi;
    this.skills = sk;
    this.achievements = new LinkedList<String>();

    // Check validity of unit setting.
    if (life <= 0 || chi < 0) {
      System.err.printf("Negative life or chi.\n");
      valid = false;
    }
    if (attack <= 0 || defense < 0) {
      System.err.printf("Negative attack or defense.\n");
      valid = false;
    }

    if (!valid) {
      System.err.printf(name + " is not valid.\n");
      System.exit(1);
    }
  }

  /**
   * @param target target unit to copy.
   */
  public Unit(Unit target) {
    name = target.name;
    attack = target.attack;
    defense = target.defense;
    life = target.life;
    lifeMax = target.lifeMax;
    chi = target.chi;
    chiMax = target.chiMax;
    skills = target.skills.clone();
  }

  /**
   * Print out status of this unit.
   */
  public void status() {
    System.out.printf("%s status: %.2f / %.2f life, %d / %d chi, %.2f attack / %.2f defense.\n",
        this.name, this.life, this.lifeMax, this.chi, this.chiMax, this.attack, this.defense);
  }

  /**
   * Basic attack.
   * 
   * @param target target of the attack.
   */
  public void attack(Unit target) {
    double effectRng = generateRandom();
    double damage = Math.max(0, this.attack * effectRng - target.defense);
    
    target.life -= damage;
    System.out.printf("%s attacked %s for %.2f damage, %s \n", this.name, target.name, damage,
        effects[(int) (effectRng / 0.25 - 2)]);
    System.out.printf("%s has %.2f life left\n", target.name, Math.max(0, target.life));
  }

  /**
   * Strengthen this unit based on opponent's status.
   * 
   * @param opponent grow the unit based on opponent.
   */
  public void grow(Unit opponent) {
    double growMod = 0;
    
    // How much stronger should I grow?
    // If I could grow, grow by at least 10%.
    growMod =
        (opponent.attack / this.attack + opponent.defense / this.defense + opponent.lifeMax
            / this.lifeMax - 3) + 0.1;

    // Beating weaker opponent is not growing my strength.
    if (growMod > 0.1) {
      if (this.attack <= 2 * opponent.attack) {
        this.defaultAttack *= 1 + growMod;
        this.attack = this.defaultAttack;
      }
      if (this.defense <= 2 * opponent.defense) {
        this.defaultDefense *= 1 + growMod;
        this.defense = this.defaultDefense;
      }
      if (this.lifeMax <= 2 * opponent.lifeMax) {
        this.lifeMax *= 1 + growMod;
      }
    }

    // Restore your health and chi.
    this.life = this.lifeMax;
    this.chi = this.chiMax;
    if (growMod > 0.01) {
      System.out.printf("%s feels stronger from the glorious battle with %s.\n", this.name,
          opponent.name);
      System.out.printf("%s: %.2f / %.2f life, %d / %d chi, %.2f attack / %.2f defense\n",
          this.name, this.life, this.lifeMax, this.chi, this.chiMax, this.attack, this.defense);
    }

    // Reset monster's status for next encounter.
    opponent.life = opponent.lifeMax;
    opponent.chi = opponent.chiMax;

    // Add this victory to unit's record.
    String date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date());
    this.achievements.add("Defeated " + opponent.name + " " + date);
  }

  /**
   * AI of boss, choosing the relatively good strategy to use.
   * 
   * @param opponent Target of the auto act.
   */
  public void auto(Unit opponent) {
    if (this.skills != null && this.skills.length > 0) {

      // Iterate through lists of skill and choose good ones.
      while (true) {
        int skillNum = rng.nextInt(this.skills.length + 1);

        // Basic attack if skillNum is out of range.
        if (skillNum == this.skills.length) {
          break;
          // Skip this skill if not enough chi.
        } else if (this.chi < this.skills[skillNum].cost) {
          continue;
          // Is this a good choice?
        } else if (!goodChoice(opponent, this.skills[skillNum])) {
          continue;
        }
        this.skills[skillNum].cast(this);
        break;
      }
    }
  }

  /**
   * A very simple AI, not to replace human mind. RNG is used to reduce its effectiveness for making
   * "bad" decision sometime.
   * 
   * @param opponent Target of this skill.
   * @param chosenSkill Skill to be checked.
   * @return If this skill is good.
   */
  private boolean goodChoice(Unit opponent, Skill chosenSkill) {

    // Skip healing ability if at full life.
    if (chosenSkill.lifeMod > 0) {
      if (this.life == this.lifeMax) {
        return rng.nextInt(1) == 1;
      }

      // Skip effective healing sometimes.
      if (this.life + chosenSkill.lifeMod <= this.lifeMax) {
        return rng.nextInt(1) == 1;
      }
    }

    // Skip chi restoration ability if at full chi.
    if (chosenSkill.chiMod > 0) {
      if (this.chi == this.chiMax) {
        return rng.nextInt(1) == 1;
      }

      // Skip effective chi restoration sometimes.
      if (this.chi + chosenSkill.chiMod <= this.chiMax) {
        return rng.nextInt(1) == 1;
      }
    }

    // Use aggressive skill first, then defensive.
    // Increase attack first, if it's too weak.
    if (chosenSkill.attackMod > 0) {
      double damageTodo = this.attack * (1 + chosenSkill.attackMod) - opponent.defense;

      // If next attack might defeat target.
      if (damageTodo >= opponent.life) {
        return rng.nextInt(1) == 1;
      }

    }

    // Increase defense first, if it's too weak.
    if (this.defense <= opponent.attack) {
      double damageToTake = opponent.attack - this.defense * (1 + chosenSkill.defenseMod);

      // If next attack might defeat me.
      if (damageToTake >= this.life) {
        return rng.nextInt(1) == 1;
      }
    }

    return true;
  }

  /**
   * Normally distributed attack effect.
   * 
   * @return a normally distributed number between 0.5 and 1.5.
   */
  public double generateRandom() {
    double num = rng.nextGaussian() / 2 + 1;
    
    if (num < 0.5) {
      num = 0.5;
    }
    if (num > 1.5) {
      num = 1.5;
    }
    return num;
  }

  /**
   * Print skills of this unit.
   */
  public void showSkills() {
    for (int i = 0; i < skills.length; i++) {
      System.out.println((i + 1) + " - " + skills[i].name + ": " + skills[i].effect());
    }
  }

  /**
   * Print history records of the unit.
   */
  public void showRecords() {
    System.out.println("Below is the battle records of " + this.name);
    for (String s : this.achievements) {
      System.out.println(s);
    }
  }
}
