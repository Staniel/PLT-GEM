package buildinClass;
import java.util.Random;

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
	public boolean trigger(Hero h){
//		int turnRandom = Random
//		while (boss.life > 0 && h.life > 0){
//			
//		}
		return true;
	}
}
