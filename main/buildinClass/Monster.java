package buildinClass;

public class Monster {
	public String name;
	public Integer attack;
	public Integer defend;
	public Integer life;
	public Skill[] skills;
	public Monster(String n, Integer a, Integer d, Integer l, Skill[] sk){
		name = n; attack = a; defend = d; life = l; skills = sk;
	}
	public Monster(Monster m){
		name = m.name;
		attack = m.attack;
		defend = m.defend;
		life = m.life;
		skills = m.skills.clone();
	}
}
