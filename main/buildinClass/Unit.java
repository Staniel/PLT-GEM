package buildinClass;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Random;


public class Unit {
	
	//Status of this unit.
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
	
	//Helper variable.
	private String[] effects = {"badly effective", "poorly effective", "somewhat effective", "very effective", "super effective"};
	private double effectRNG;
	private LinkedList<String> achievements;
	private static Random rng = new Random();
	
	public Unit(String n, double a, double d, double l, int c, Skill[] sk){
		boolean valid = true;

		this.name = n;
		this.attack = a;
		this.defaultAttack = a;
		this.defense = d;
		this.defaultDefense = d;
		this.life = l;
		this.lifeMax = life;
		this.chi = c;
		this.chiMax = chi;
		this.skills = sk;
		this.achievements = new LinkedList<String>();
		
		//Check validity of unit setting.
		if (l <= 0 || c < 0) {
			System.err.printf("Negative life or chi.\n");
			valid = false;
		} 
		if (a <= 0 || d < 0) {
			System.err.printf("Negative attack or defense.\n");
			valid = false;
		}
		
		if (!valid) {
			System.err.printf(n + " is not valid.\n");
			System.exit(1);
		}
	}
	
	public Unit(Unit h){
		name = h.name;
		attack = h.attack;
		defense = h.defense;
		life = h.life;
		lifeMax = h.lifeMax;
		chi = h.chi;
		chiMax = h.chiMax;
		skills = h.skills.clone();
	}
	
	//Print out status of this unit.
	public void status() {
		System.out.printf("%s status: %.2f / %.2f life, %d / %d chi, %.2f attack / %.2f defense.\n", 
				this.name, this.life, this.lifeMax, this.chi, this.chiMax, this.attack, this.defense);
	}
	
	//Basic attack.
	public void attack(Unit target) {
		effectRNG =  generateRandom();
		double damage =  Math.max(0, this.attack * effectRNG - target.defense);
		target.life -= damage;
		System.out.printf("%s attacked %s for %.2f damage, %s \n", 
				this.name, target.name, damage, effects[(int) (effectRNG / 0.25 - 2)]);
		System.out.printf("%s has %.2f life left\n",target.name, Math.max(0, target.life));
	}
	
	//Strengthen this unit based on opponent's status.
	public void grow(Unit opponent) {
		double growMod = 0;
		//How much stronger should I grow?
		//If I could grow, grow by at least 10%.
		growMod = (opponent.attack/this.attack 
				+ opponent.defense/this.defense 
				+ opponent.lifeMax/this.lifeMax - 3)
				+ 0.1;
		
		//Beating weaker opponent is not growing my strength.
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
		
		//Restore your health and chi.
		this.life = this.lifeMax;
		this.chi = this.chiMax;
		if (growMod > 0.01) {
			System.out.printf("%s feels stronger from the glorious battle with %s.\n", this.name, opponent.name);
			System.out.printf("%s: %.2f / %.2f life, %d / %d chi, %.2f attack / %.2f defense\n", 
				this.name, this.life, this.lifeMax, this.chi, this.chiMax, this.attack, this.defense);
		}
		
		//Reset monster's status for next encounter.
		opponent.life = opponent.lifeMax;
		opponent.chi = opponent.chiMax;
		
		//Add this victory to unit's record.
		String date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date());
		this.achievements.add("Defeated " + opponent.name + " " + date);
	}
	
	//AI of boss, choosing the relatively good strategy to use.
	public void auto(Unit opponent) {
		if (this.skills != null && this.skills.length > 0) {
			
			//Iterate through lists of skill and choose good ones.
			while (true) {
				int skillNum = rng.nextInt(this.skills.length + 1);
				
				//Basic attack if skillNum is out of range.
				if (skillNum == this.skills.length) {
					break;
				//Skip this skill if not enough chi.
				} else if (this.chi < this.skills[skillNum].cost) {
					continue;
				//Is this a good choice?
				} else if (!goodChoice(opponent, this.skills[skillNum])) {
					continue;
				}
				this.skills[skillNum].cast(this);
				break;
			}
		}
	}
	
	//A very simple AI, not to replace human mind.
	//RNG is used to reduce its effectiveness for making "bad" decision sometime.
	private boolean goodChoice(Unit opponent, Skill chosenSkill) {
		
		//Skip healing ability if at full life.
		if (chosenSkill.lifeMod > 0) {
			if (this.life == this.lifeMax)
				return rng.nextInt(1) == 1;
			
			//Skip effective healing sometimes.
			if (this.life + chosenSkill.lifeMod <= this.lifeMax)
				return rng.nextInt(1) == 1;
		}
			
		//Skip chi restoration ability if at full chi.
		if (chosenSkill.chiMod > 0) {
			if (this.chi == this.chiMax)
				return rng.nextInt(1) == 1;
			
			//Skip effective chi restoration sometimes.
			if (this.chi + chosenSkill.chiMod <= this.chiMax)
				return rng.nextInt(1) == 1;
		}
		
		//Use aggressive skill first, then defensive.
		//Increase attack first, if it's too weak.
		if (chosenSkill.attackMod > 0) {
			double damageTodo = this.attack * (1 + chosenSkill.attackMod) - opponent.defense;
			
			//If next attack might defeat target.
			if (damageTodo >= opponent.life)
				return rng.nextInt(1) == 1;
			
		}
		
		//Increase defense first, if it's too weak.
		if (this.defense <= opponent.attack) {
			double damageToTake = opponent.attack - this.defense * (1 + chosenSkill.defenseMod);
			
			//If next attack might defeat me.
			if (damageToTake >= this.life)
				return rng.nextInt(1) == 1;
		}
		
		return true;
	}
	
	//Normally distributed attack effect.
	public double generateRandom() {
		double d = rng.nextGaussian() / 2 + 1;
		if (d < 0.5)
			d = 0.5;
		if (d > 1.5)
			d = 1.5;
		return d;
	}
	
	public void showSkills() {
		for (int i = 0; i < skills.length; i++) {
			System.out.println((i + 1) + " - " + skills[i].name + ": " + skills[i].effect());
		}
	}
	
	public void showRecords() {
		System.out.println("Below is the battle records of " + this.name);
		for (String s : this.achievements)
			System.out.println(s);
	}
}
