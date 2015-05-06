package buildinClass;

public class Unit {
	public String name;
	public double attack;
	public double defend;
	public double life;
	public double lifeMax;
	public int chi;
	public int chiMax;
	public Skill[] skills;
	public Skill skill;
	public int duration;
	
	public Unit(String n, double a, double d, double l, int c, Skill[] sk){
		name = n;
		attack = a;
		defend = d;
		life = l;
		chi = c;
		skills = sk;
	}
	public Unit(Unit h){
		name = h.name;
		attack = h.attack;
		defend = h.defend;
		life = h.life;
		chi = h.chi;
		skills = h.skills.clone();
	}
	
	public void showSkills() {
		for (int i = 0; i < skills.length; i++) {
			System.out.println((i + 1) + " - " + skills[i].name + ":" + skills[i].effect());
		}
	}
}
