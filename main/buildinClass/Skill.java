package buildinClass;

public class Skill {
		public double lifeMod;
		public double attackMod;
		public double defendMod;
		public String name;
		
		public Skill(String name, double hMod, double aMod, double dMod) {
			this.lifeMod = hMod;
			this.attackMod = aMod;
			this.defendMod = dMod;
			this.name = name;
		}
		
		public Hero cast(Hero h) {
			Hero modHero = new Hero(h);
			if (lifeMod > 0) {
				System.out.printf("%s restored %.2f health for %s.\n", this.name, this.lifeMod, modHero.name);
				modHero.life += lifeMod;
			}
			
			if (attackMod > 0) {
				System.out.println("Attack increased temporarily by " + attackMod * 100 + "% for " + modHero.name + ".");
				modHero.attack *= (1 + attackMod);
			}
			
			if (defendMod > 0) {
				System.out.println("Defense increased temporarily by " + defendMod * 100 + "% for " + modHero.name + ".");
				modHero.defend *= (1 + defendMod);
			}
			
			return modHero;
		}
		
		public String effect() {
			String lifeEffect = (this.lifeMod > 0) ? "Heal caster for " + lifeMod + ". " :"";
			String attackEffect = (this.attackMod > 0) ? "Increase attack by " + attackMod * 100
					+ "% for this round. " :"";
			String defendEffect = (this.defendMod > 0) ? "Increase defense by " + defendMod * 100
					+ "% for this round." :"";
			String totalEffect = lifeEffect + attackEffect + defendEffect;
			return totalEffect;
		}
}
