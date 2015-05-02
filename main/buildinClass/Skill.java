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
		
		public void cast(Unit character) {	
			if (lifeMod > 0) {
				System.out.printf("%s restored %.2f health for %s.\n", this.name, this.lifeMod, character.name);
				character.life += lifeMod;
			}
			
			if (chiMod > 0) {
				System.out.printf("%s restored %d chi for %s.\n", this.name, this.chiMod, character.name);
				character.chi += chiMod;
			}
			
			if (attackMod > 0 && this != character.skill) {
				System.out.println("Attack increased temporarily by " + attackMod * 100 + "% for " + character.name + ".");
				character.attack *= (1 + attackMod);
			}
			
			if (defendMod > 0 && this != character.skill) {
				System.out.println("Defense increased temporarily by " + defendMod * 100 + "% for " + character.name + ".");
				character.defend *= (1 + defendMod);
			}
			character.skill = this;
		
			return;
		}
		
		public void cancel(Unit character) {
			if (lifeMod > 0) {
				System.out.printf("%s restored %.2f health for %s.\n", this.name, this.lifeMod, character.name);
				character.life += lifeMod;
			}
			
			if (chiMod > 0) {
				System.out.printf("%s restored %d chi for %s.\n", this.name, this.chiMod, character.name);
				character.chi += chiMod;
			}
			
			if (attackMod > 0 && this != character.skill) {
				System.out.println("Attack increased temporarily by " + attackMod * 100 + "% for " + character.name + ".");
				character.attack *= (1 + attackMod);
			}
			
			if (defendMod > 0 && this != character.skill) {
				System.out.println("Defense increased temporarily by " + defendMod * 100 + "% for " + character.name + ".");
				character.defend *= (1 + defendMod);
			}
			character.skill = this;
		
			return;
		}
		
		public String effect() {
			String lifeEffect = (this.lifeMod > 0) ? "Restore " + lifeMod + " life for caster. " :"";
			String chiEffect = (this.chiMod > 0) ? "Restore " + chiMod + " chi for caster. " :"";
			String attackEffect = (this.attackMod > 0) ? "Increase attack by " + attackMod * 100
					+ "% for this round. " :"";
			String defendEffect = (this.defendMod > 0) ? "Increase defend by " + defendMod * 100
					+ "% for this round. " :"";
			String totalEffect = lifeEffect + chiEffect + attackEffect + defendEffect;
			return totalEffect;
		}
}
