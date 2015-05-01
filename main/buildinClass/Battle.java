package buildinClass;
import java.util.Scanner;

public class Battle {
	Scanner sc;
	public String display;
	public Monster boss;
	public String[] effects = {"poorly", "weakly", "effective", "super effective"};
	private int effectLevel;
	private float bossDamage;
	private float heroDamage;
	private int skillNum;
	
	public Battle(String s, Monster m){
		display = s;
		boss = m;
	}
	
	public Battle(Battle b){
		display = b.display;
		boss = new Monster(b.boss);
	}
	
	public boolean trigger(Hero h){
		System.out.printf("Encountered %s\n", boss.name);
		System.out.println(this.display);
		
		sc = new Scanner(System.in);
		while (boss.life > 0 && h.life > 0){
			System.out.println("Please choose your skill to use:\n");
			h.showSkills();
			effectLevel =  (int) (Math.random() * 4);
			skillNum = sc.nextInt();
			
			System.out.println("Used skill :" + h.skills[skillNum].name);
			Hero modHero = h.skills[skillNum].cast(h);

			bossDamage = Math.max(0, modHero.attack - boss.defend);
			if (bossDamage >= boss.life) {
				System.out.printf("%s was defeated!\n", boss.name);
				return true;
			}
			boss.life -= bossDamage;
			System.out.printf("%s attacked %s for %.2f damage, %s \n", 
					h.name, boss.name, bossDamage, effects[effectLevel]);
			
			effectLevel =  (int) (Math.random() * 4);
			heroDamage = Math.max(0, boss.attack - modHero.defend);
			if (bossDamage >= boss.life) {
				System.out.printf("%s was defeated!\n", h.name);
				return false;
			}
			h.life -= heroDamage;
			System.out.printf("%s attacked %s for %.2f damage, %s \n", 
					boss.name, h.name, bossDamage, effects[effectLevel]);;
		}
		
		return true;
	}
}
