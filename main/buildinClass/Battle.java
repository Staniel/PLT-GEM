package buildinClass;

import java.util.Random;
import java.util.Scanner;

public class Battle {
	private Scanner sc;
	private Random rng;
	private String display;
	private Unit myBoss;
	private Unit myHero;
	private String[] effects = {"badly effective", "poorly effective", "somewhat effective", "very effective", "super effective"};
	private double effectRNG;
	private double bossDamage;
	private double heroDamage;
	private Skill[] heroSkills;
	private Skill[] bossSkills;
	private int skillNum;
	
	//Initiate a battle with battle message and monster.
	public Battle(String s, Unit m){
		display = s;
		myBoss = m;
	}
	
	//Copy constructor.
	public Battle(Battle b){
		display = b.display;
		myBoss = new Unit(b.myBoss);
	}
	
	//Return true or false of victory or defeat.
	public boolean trigger(Unit h){
		System.out.printf("Encountered %s, ", myBoss.name);
		System.out.println(this.display);
		
		sc = new Scanner(System.in);
		rng = new Random();
		this.myHero = h;
		heroSkills = myHero.skills;
		bossSkills = myBoss.skills;
		
		while (myBoss.life > 0 && myHero.life > 0){
			System.out.println("Please choose your skill to use:");
			System.out.println("0 - Attack: A \"normally\" effective attack.");

			//Use skill for hero, if any.
			if (myHero.chi > 0 && heroSkills != null && heroSkills.length > 0) {
				while (true) {
					myHero.showSkills();
					skillNum = sc.nextInt() - 1;
					if (myHero.chi < heroSkills[skillNum].cost) {
						System.out.println("You don't have enough chi for this skill");
						continue;
					}
				}
					
				System.out.printf("%s Used skill : %s\n", myHero.name, heroSkills[skillNum].name);
				myHero.skills[skillNum].cast(myHero);
			}
			
			//Automatically use skill for boss, if any.
			if (myBoss.chi > 0 && bossSkills != null && bossSkills.length > 0) {
				skillNum = rng.nextInt(bossSkills.length);
				if (myBoss.chi < bossSkills[skillNum].cost) {
					continue;
				}
				System.out.printf("%s Used skill : %s\n", myBoss.name, bossSkills[skillNum].name);
				myBoss.skills[skillNum].cast(myBoss);
				System.out.println("");
			}
			
			//Hero round.
			effectRNG =  generateRandom();
			bossDamage = effectRNG * Math.max(0, myHero.attack - myBoss.defend);
			if (bossDamage >= myBoss.life) {
				System.out.printf("%s defeated %s!\n", myHero.name, myBoss.name);
				reward();
				return true;
			}
			myBoss.life -= bossDamage;
			System.out.printf("%s attacked %s for %.2f damage, %s \n", 
					myHero.name, myBoss.name, bossDamage, effects[(int) (effectRNG / 0.25 - 2)]);
			System.out.printf("%s has %.2f life left\n",myBoss.name, myBoss.life);
			
			//Boss round.
			effectRNG =  generateRandom();
			heroDamage = effectRNG * Math.max(0, myBoss.attack - myHero.defend);
			if (heroDamage >= myHero.life) {
				System.out.printf("%s was defeated!\n", myHero.name);
				return false;
			}
			myHero.life -= heroDamage;
			System.out.printf("%s attacked %s for %.2f damage, %s \n", 
					myBoss.name, myHero.name, heroDamage, effects[(int) (effectRNG / 0.25 - 2)]);
			System.out.printf("%s has %.2f life left\n",myHero.name, myHero.life);
			
			//Prepare for next round.
			roundCheck();
			System.out.println("");
		}
		
		//How could you get here!?
		return false;
	}
	
	//Check duration of skill and reset status if expired.
	private void roundCheck() {
		myHero.duration--;
		myBoss.duration--;
		
		if (myHero.duration <= 0)
			myHero.skill.cancel(myHero);
		if (myBoss.duration <= 0)
			myBoss.skill.cancel(myBoss);
		
	}
	
	//You win the battle, you get stuff.
	private void reward() {
		this.myHero.attack *= 1.05;
		this.myHero.defend *= 1.05;
		this.myHero.lifeMax *= 1.05;
		this.myHero.life = this.myHero.lifeMax;
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
