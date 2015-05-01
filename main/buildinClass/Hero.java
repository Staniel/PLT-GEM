package buildinClass;

public class Hero {
	public String name;
	public Integer attack;
	public Integer defend;
	public Item[] items;
	public Hero(String n, Integer a, Integer d, Item[] i){
		name = n;
		attack = a;
		defend = d;
		items = i;
	}
	public Hero(Hero h){
		name = h.name;
		attack = h.attack;
		defend = h.defend;
		items = h.items.clone();
	}
}
