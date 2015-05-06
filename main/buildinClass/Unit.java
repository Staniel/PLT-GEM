package buildinClass;


public class Unit {
	public String name;
	public double attack;
	public double defense;
	public double life;
	public double lifeMax;
	public int chi;
	public int chiMax;
	public Skill[] skills;
	public Skill skill;
	
	public Unit(String n, double a, double d, double l, int c, Skill[] sk){
		name = n;
		attack = a;
		defense = d;
		life = l;
		lifeMax = life;
		chi = c;
		chiMax = chi;
		skills = sk;
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
		System.out.printf("%s: %.2f / %.2f life, %d / %d chi, %.2f attack / %.2f defense\n", 
				this.name, this.life, this.lifeMax, this.chi, this.chiMax, this.attack, this.defense);
	}
	
	//Strengthen this unit based on opponent's level.
	public void grow(Unit opponent) {
		this.attack *= 1.05;
		this.defense *= 1.05;
		this.lifeMax *= 1.05;
		this.life = this.lifeMax;
		System.out.printf("%s: %.2f / %.2f life, %d / %d chi, %.2f attack / %.2f defense\n", 
				this.name, this.life, this.lifeMax, this.chi, this.chiMax, this.attack, this.defense);
	}
	
	//AI of boss, choosing the relatively good strategy to use.
	public void choose(Unit boss) {
		
	}
	
	public void showSkills() {
		for (int i = 0; i < skills.length; i++) {
			System.out.println((i + 1) + " - " + skills[i].name + ":" + skills[i].effect());
		}
	}
}
