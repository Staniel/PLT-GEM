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
	private int skillNumBoss;
	
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
			myHero.status();
			myBoss.status();
			System.out.println("Please choose your skill to use:");
//			System.out.println("status - Check current status.");
			System.out.println("0 - Attack: A \"normally\" effective attack.");

			//Choose skill from user input.
			if (heroSkills != null && heroSkills.length > 0) {
				while (true) {
					myHero.showSkills();
					String command = sc.next();
//					if (command.equals("status")) {
//						myHero.status();
//						myBoss.status();
//						continue;
//					}
					try {
						skillNum = Integer.parseInt(command) - 1;
						if (skillNum == -1)
							break;
						if (skillNum < -1 || skillNum >= heroSkills.length) {
							System.out.println("No such skill.");
							continue;
						}
						if (myHero.chi < heroSkills[skillNum].cost) {
							System.out.println("You don't have enough chi for this skill.");
							continue;
						}
					} catch (NumberFormatException nfe) {
						System.out.println("No such command.");
						continue;
					}
					myHero.skills[skillNum].cast(myHero);
					break;
				}
			}
			
			//Automatically use skill for boss, if any.
			if (bossSkills != null && bossSkills.length > 0) {
				while (true) {
					skillNumBoss = rng.nextInt(bossSkills.length + 1);
					if (skillNumBoss == bossSkills.length)
						break;
					if (myBoss.chi < bossSkills[skillNumBoss].cost) {
						continue;
					}
					myBoss.skills[skillNumBoss].cast(myBoss);
					break;
				}
				System.out.println("");
			}
			
			//Hero round.
			//Only attack if no life/chi skill is used.
			if (skillNum == -1 || (myHero.skill.lifeMod <= 0 && myHero.skill.chiMod <= 0)) {
				effectRNG =  generateRandom();
				bossDamage = effectRNG * Math.max(0, myHero.attack - myBoss.defense);
				myBoss.life -= bossDamage;
				System.out.printf("%s attacked %s for %.2f damage, %s \n", 
						myHero.name, myBoss.name, bossDamage, effects[(int) (effectRNG / 0.25 - 2)]);
				System.out.printf("%s has %.2f life left\n\n",myBoss.name, Math.max(0, myBoss.life));
				if (myBoss.life <= 0) {
					System.out.printf("%s defeated %s!\n", myHero.name, myBoss.name);
					reward();
					return true;
				}
			}
			
			//Boss round.
			//Only attack if no life/chi skill is used.
			if (skillNumBoss == -1 || myBoss.skill.lifeMod <= 0 && myBoss.skill.chiMod <= 0) {
				effectRNG =  generateRandom();
				heroDamage = effectRNG * Math.max(0, myBoss.attack - myHero.defense);
				myHero.life -= heroDamage;
				System.out.printf("%s attacked %s for %.2f damage, %s \n", 
						myBoss.name, myHero.name, heroDamage, effects[(int) (effectRNG / 0.25 - 2)]);
				System.out.printf("%s has %.2f life left\n\n",myHero.name, Math.max(0, myHero.life));
				if (myHero.life <= 0) {
					System.out.printf("%s was defeated!\n", myHero.name);
					return false;
				}
			}
			
			//Prepare for next round.
			roundOver();
			System.out.printf("round over\n");
		}
		
		//How could you get here!?
		return false;
	}
	
	//Check duration of skill and reset status if expired.
	private void roundOver() {
		if (myHero.skill != null)
			myHero.skill.cancel(myHero);
		if (myBoss.skill != null)
			myBoss.skill.cancel(myBoss);
	}
	
	//You win the battle, you get good stuff.
	private void reward() {
		System.out.printf("%s feels stronger after the glorious battle.\n", this.myHero.name);
		this.myHero.grow(this.myBoss);
	}
	
	//Normally distributed attack effect.
	private double generateRandom() {
		double d = rng.nextGaussian() / 2 + 1;
		if (d < 0.5)
			d = 0.5;
		if (d > 1.5)
			d = 1.5;
		return d;
	}
}
