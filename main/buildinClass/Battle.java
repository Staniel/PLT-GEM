package buildinClass;
import java.util.Scanner;

public class Battle {
	Scanner sc;
	public String display;
	public Monster boss;
	public String[] effects = {"poorly effective", "effective", "super effective"};
	public double[] effectivens = {0.5f, 0.75f, 1.25f, 1.5f};
	private int effectLevel;
	private double bossDamage;
	private double heroDamage;
	private Skill[] heroSkills;
	private int skillNum;
	
	//Initiate a battle with battle message and monster.
	public Battle(String s, Monster m){
		display = s;
		boss = m;
	}
	
	//Copy constructor.
	public Battle(Battle b){
		display = b.display;
		boss = new Monster(b.boss);
	}
	
	//Return true or false of victory or defeat.
	public boolean trigger(Hero h){
		System.out.printf("Encountered %s\n", boss.name);
		System.out.println(this.display);
		
		sc = new Scanner(System.in);
		heroSkills = h.skills;
		
		while (boss.life > 0 && h.life > 0){
			Hero modHero = h;
			
			//use skill, if any.
			if (heroSkills != null && heroSkills.length > 0) {
				System.out.println("Please choose your skill to use:\n");
				h.showSkills();
				skillNum = sc.nextInt();
				System.out.println("Used skill :" + h.skills[skillNum].name);
				modHero = h.skills[skillNum].cast(h);
			}
			
			//hero round.
			effectLevel =  (int) (Math.random() * 4);
			bossDamage = Math.max(0, modHero.attack - boss.defend);
			if (bossDamage >= boss.life) {
				System.out.printf("%s was defeated!\n", boss.name);
				return true;
			}
			boss.life -= bossDamage;
			System.out.printf("%s attacked %s for %.2f damage, %s \n", 
					h.name, boss.name, bossDamage, effects[effectLevel]);
			
			//boss round.
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
