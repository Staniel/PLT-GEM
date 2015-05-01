package buildinClass;

public class Monster {
	public String name;
	public float attack;
	public float defend;
	public float life;
	public Skill[] skills;
	
	public Monster(String n, float a, float d, float l, Skill[] sk){
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
