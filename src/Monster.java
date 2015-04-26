
public class Monster {
	public String name;
	public Integer attack;
	public Integer defend;
	public Integer life;
	public Monster(String n, Integer a, Integer d, Integer l){
		name = n; attack = a; defend = d; life = l;
	}
	public Monster(Monster m){
		name = m.name;
		attack = m.attack;
		defend = m.defend;
		life = m.life;
	}
}
