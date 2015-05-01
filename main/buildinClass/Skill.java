package buildinClass;

public class Skill {
		public double lifeMod;
		public double attackMod;
		public double defendMod;
		public String name;
		
		public Skill(float hMod, float aMod, float dMod, String name) {
			this.lifeMod = hMod;
			this.attackMod = aMod;
			this.defendMod = dMod;
			this.name = name;
		}
		
		public Hero cast(Hero h) {
			Hero modHero = new Hero(h);
			if (lifeMod > 0) {
				System.out.printf("%s restored %.2f health\n", this.name, modHero.life);
				modHero.life += lifeMod;
			}
			
			if (attackMod > 1) {
				modHero.attack *= attackMod;
			}
			
			if (defendMod > 1) {
				modHero.defend *= defendMod;
			}
			
			return modHero;
		}
		
		public String effect() {
			String lifeEffect = (this.lifeMod > 0) ? "Heal hero for " + lifeMod + "life and" :"";
			String attackEffect = (this.attackMod > 0) ? "Heal hero for " + lifeMod + "life and" :"";
			String defendEffect = (this.defendMod > 0) ? "Heal hero for " + lifeMod + "life" :"";
			String totalEffect = lifeEffect + attackEffect + defendEffect;
			return totalEffect;
		}
		
}
