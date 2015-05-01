package buildinClass;

public class Monster {
	public String name;
	public double attack;
	public double defend;
	public double life;
	public Skill[] skills;
	
	public Monster(String n, double a, double d, double l, Skill[] sk){
		name = n; 
		attack = a; 
		defend = d; 
		life = l; 
		skills = sk;
	}
	
	public Monster(Monster m){
		name = m.name;
		attack = m.attack;
		defend = m.defend;
		life = m.life;
		skills = m.skills.clone();
	}
}
