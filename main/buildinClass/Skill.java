package buildinClass;

public class Skill {
		public double lifeMod;
		public int chiMod;
		public double attackMod;
		public double defendMod;
		public String name;
		public int duration;
		
		public Skill(String name, double hMod, int chiMod, double aMod, double dMod, int duration) {
			this.name = name;
			this.lifeMod = hMod;
			this.chiMod = chiMod;
			this.attackMod = aMod;
			this.defendMod = dMod;
			this.duration = duration;
		}
		
		public Hero cast(Hero h) {
			Hero modHero = new Hero(h);
			if (lifeMod > 0) {
				System.out.printf("%s restored %.2f health for %s.\n", this.name, this.lifeMod, modHero.name);
				modHero.life += lifeMod;
			}
			
			if (chiMod > 0) {
				System.out.printf("%s restored %d chi for %s.\n", this.name, this.chiMod, modHero.name);
				modHero.chi += chiMod;
			}
			
			if (attackMod > 0 && this != h.skill) {
				System.out.println("Attack increased temporarily by " + attackMod * 100 + "% for " + modHero.name + ".");
				modHero.attack *= (1 + attackMod);
			}
			
			if (defendMod > 0 && this != h.skill) {
				System.out.println("Defense increased temporarily by " + defendMod * 100 + "% for " + modHero.name + ".");
				modHero.defend *= (1 + defendMod);
			}
			
			modHero.skill = this;
			
			return modHero;
		}
		
		public String effect() {
			String lifeEffect = (this.lifeMod > 0) ? "Restore " + lifeMod + " life for caster. " :"";
			String chiEffect = (this.chiMod > 0) ? "Restore " + chiMod + " chi for caster. " :"";
			String attackEffect = (this.attackMod > 0) ? "Increase attack by " + attackMod * 100
					+ "% for " + this.duration + " round. " :"";
			String defendEffect = (this.defendMod > 0) ? "Increase defend by " + defendMod * 100
					+ "% for " + this.duration + " round. " :"";
			String totalEffect = lifeEffect + chiEffect + attackEffect + defendEffect;
			return totalEffect;
		}
}
