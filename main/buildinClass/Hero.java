package buildinClass;

public class Hero {
	public String name;
	public Integer attack;
	public Integer defend;
	public Integer life;
	public Skill[] skills;
	public Hero(String n, Integer a, Integer d, Integer l, Skill[] sk){
		name = n;
		attack = a;
		defend = d;
		life = l;
		Skill = sk;
	}
	public Hero(Hero h){
		name = h.name;
		attack = h.attack;
		defend = h.defend;
		life = h.life;
		items = h.items.clone();
	}
}
