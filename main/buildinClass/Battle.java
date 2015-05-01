package buildinClass;

public class Battle {
	public String display;
	public Monster boss;
	public Battle(String s, Monster m){
		display = s;
		boss = m;
	}
	public Battle(Battle b){
		display = b.display;
		boss = new Monster(b.boss);
	}
}
