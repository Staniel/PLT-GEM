package buildinClass;

public class Skill {
		public double lifeMod;
		public int chiMod;
		public double attackMod;
		public double defendMod;
		public String name;
		public int cost;
		
		public Skill(String name, double hMod, int chiMod, double aMod, double dMod, int cost) {
			this.name = name;
			this.lifeMod = hMod;
			this.chiMod = chiMod;
			this.attackMod = aMod;
			this.defendMod = dMod;
			this.cost = cost;
		}
		
		//Use this skill.
		public void cast(Unit character) {
			System.out.printf("%s Used skill %s : ", character.name, this.name);
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
			
			if (attackMod > 0 && this != character.skill) {
				System.out.print("Attack increased temporarily by " + attackMod * 100 + "% for " + character.name + ". ");
				character.attack *= (1 + attackMod);
			}
			
			if (defendMod > 0 && this != character.skill) {
				System.out.print("Defense increased temporarily by " + defendMod * 100 + "% for " + character.name + ".");
				character.defend *= (1 + defendMod);
			}
			character.skill = this;
			System.out.println("");
			return;
		}
		
		//Cancel skill effect.
		public void cancel(Unit character) {
			if (attackMod > 0) {
				character.attack /= (1 + attackMod);
			}
			
			if (defendMod > 0) {
				character.defend /= (1 + defendMod);
			}
			
			return;
		}
		
		//Description of the skill.
		public String effect() {
			String lifeEffect = (this.lifeMod > 0) ? "Restore " + lifeMod + " life for caster. " :"";
			String chiEffect = (this.chiMod > 0) ? "Restore " + chiMod + " chi for caster. " :"";
			String attackEffect = (this.attackMod > 0) ? "Increase attack by " + attackMod * 100
					+ "% for this round. " :"";
			String defendEffect = (this.defendMod > 0) ? "Increase defend by " + defendMod * 100
					+ "% for this round. " :"";
			String costEffect = (this.cost > 0) ? "Costs " + cost + " chi. " :"";
			String totalEffect = lifeEffect + chiEffect + attackEffect + defendEffect + costEffect;
			
			return totalEffect;
		}
}
