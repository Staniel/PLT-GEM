package buildinClass;

public class Skill {
	
		//Effect of this skill.
		public double lifeMod;
		public int chiMod;
		public double attackMod;
		public double defenseMod;
		public String name;
		public int cost;
		
		public Skill(String name, double hMod, int chiMod, double aMod, double dMod, int cost) {
			boolean valid = true;
			
			this.name = name;
			this.lifeMod = hMod;
			this.chiMod = chiMod;
			this.attackMod = aMod;
			this.defenseMod = dMod;
			this.cost = cost;
			
			//Check validity of skill setting.
			if (attackMod <= -1) {
				System.err.printf("Invalid attack modifier.\n");
				valid = false;
			}
			if (cost < 0) {
				System.err.printf("Invalid cost.\n");
				valid = false;
			}
			if (!valid) {
				System.err.println(name + " is not valid.");
				System.exit(1);
			}
		}
		
		//Use this skill.
		public void cast(Unit character) {
			System.out.printf("ACTION:\t%s Used skill %s : ", character.name, this.name);
			if (lifeMod > 0) {
				double lifePlus = Math.min(lifeMod, character.lifeMax - character.life);
				System.out.printf("%s restored %.2f health for %s.", this.name, lifePlus, character.name);
				character.life += lifePlus;
			}
			
			if (chiMod > 0) {
				int chiPlus = Math.min(chiMod, character.chiMax - character.chi);
				System.out.printf("%s restored %d chi for %s. ", this.name, chiPlus, character.name);
				character.chi += chiPlus;
			}
			
			if (attackMod != 0 && this != character.skill) {
				if (attackMod > 0)
					System.out.print("Attack increased temporarily by " + attackMod * 100 + "% for " + character.name + ". ");
				else
					System.out.print("Attack decreased temporarily by " + attackMod * -100 + "% for " + character.name + ". ");
				character.attack *= (1 + attackMod);
			}
			
			if (defenseMod != 0 && this != character.skill) {
				if (defenseMod > 0)
					System.out.print("Defense increased temporarily by " + defenseMod * 100 + "% for " + character.name + ".");
				else
					System.out.print("Defense decreased temporarily by " + defenseMod * 100 + "% for " + character.name + ".");
				character.defense *= (1 + defenseMod);
			}
			character.skill = this;
			character.chi -= this.cost;
			System.out.println("");
			return;
		}
		
		//Cancel skill effect.
		public void cancel(Unit character) {
			if (attackMod != 0) {
				character.attack = character.defaultAttack;
			}
			
			if (defenseMod != 0) {
				character.defense = character.defaultDefense;
			}
			character.skill = null;
			return;
		}
		
		//Description of the skill.
		public String effect() {
			String lifeEffect = (this.lifeMod > 0) ? "Restore " + lifeMod + " life for caster. " :"";
			String chiEffect = (this.chiMod > 0) ? "Restore " + chiMod + " chi for caster. " :"";
			String attackEffect = "";
			String defenseEffect = "";
			if (this.attackMod != 0)
				attackEffect = ((this.attackMod > 0) ? "Increase": "Decrease") + " attack by " + attackMod * 100
					+ "% for this round. ";
			if (this.defenseMod != 0)
				defenseEffect = ((this.defenseMod > 0) ? "Increase": "Decrease") + " defense by " + defenseMod * 100
				+ "% for this round. ";
			
			String costEffect = (this.cost > 0) ? "Costs " + cost + " chi. " :"";
			String totalEffect = lifeEffect + chiEffect + attackEffect + defenseEffect + costEffect;
			
			return totalEffect;
		}

}
