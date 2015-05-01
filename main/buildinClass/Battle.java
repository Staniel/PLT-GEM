package buildinClass;

import java.util.Random;
import java.util.Scanner;

public class Battle {
	Scanner sc;
	Random rng;
	public String display;
	public Monster myBoss;
	public String[] effects = {"badly effective", "poorly effective", "normally effective", "somewhat effective", "super effective"};
	private double effectRNG;
	private double bossDamage;
	private double heroDamage;
	private Skill[] heroSkills;
	private Skill[] bossSkills;
	private int skillNum;
	
	//Initiate a battle with battle message and monster.
	public Battle(String s, Monster m){
		display = s;
		myBoss = m;
	}
	
	//Copy constructor.
	public Battle(Battle b){
		display = b.display;
		myBoss = new Monster(b.myBoss);
	}
	
	//Return true or false of victory or defeat.
	public boolean trigger(Hero myHero){
		System.out.printf("Encountered %s\n", myBoss.name);
		System.out.println(this.display);
		
		sc = new Scanner(System.in);
		rng = new Random();
		heroSkills = myHero.skills;
		bossSkills = myBoss.skills;
		
		while (myBoss.life > 0 && myHero.life > 0){
			Hero modHero = myHero;
			
			//Manually use skill for hero, if any.
			if (heroSkills != null && heroSkills.length > 0) {
				System.out.println("Please choose your skill to use:");
				myHero.showSkills();
				skillNum = sc.nextInt() - 1;
				System.out.printf("%s Used skill : %s\n", myHero.name, heroSkills[skillNum].name);
				modHero = myHero.skills[skillNum].cast(myHero);
				System.out.println("");
				myHero.life = modHero.life;
			}
			
			//Automatically use skill for boss, if any.
			if (bossSkills != null && bossSkills.length > 0) {
				skillNum = rng.nextInt(bossSkills.length);
				System.out.printf("%s Used skill : %s\n", myBoss.name, bossSkills[skillNum].name);
				System.out.println("");
			}
			
			//Hero round.
			effectRNG =  generateRandom();
			bossDamage = effectRNG * Math.max(0, modHero.attack - myBoss.defend);
			if (bossDamage >= myBoss.life) {
				System.out.printf("%s was defeated!\n", myBoss.name);
				return true;
			}
			myBoss.life -= bossDamage;
			System.out.printf("%s attacked %s for %.2f damage, %s \n", 
					myHero.name, myBoss.name, bossDamage, effects[(int) (effectRNG / 0.25 - 2)]);
			System.out.printf("%s has %.2f life left\n",myBoss.name, myBoss.life);
			
			//Boss round.
			effectRNG =  generateRandom();
			heroDamage = effectRNG * Math.max(0, myBoss.attack - modHero.defend);
			if (bossDamage >= myHero.life) {
				System.out.printf("%s was defeated!\n", myHero.name);
				return false;
			}
			myHero.life -= heroDamage;
			System.out.printf("%s attacked %s for %.2f damage, %s \n", 
					myBoss.name, myHero.name, heroDamage, effects[(int) (effectRNG / 0.25 - 2)]);
			System.out.printf("%s has %.2f life left\n",myHero.name, myHero.life);
			
			System.out.println("");
		}
		
		return true;
	}
	
	private double generateRandom() {
		double d = rng.nextGaussian() / 2 + 1;
		if (d < 0.5)
			d = 0.5;
		if (d > 1.5)
			d = 1.5;
		return d;
	}
}
