package buildinClass;


import java.util.Random;
import java.util.Scanner;

public class Battle {
	
	private Scanner sc;
	private String display;
	private Unit myBoss;
	private Unit myHero;
	private Skill[] heroSkills;
	private Skill[] bossSkills;
	private int skillNum;
	private int skillNumBoss;
	private int round;
	private static Random rng = new Random();
	
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
		
		this.sc = new Scanner(System.in);
		this.round = 0;
		this.myHero = h;
		this.heroSkills = myHero.skills;
		this.bossSkills = myBoss.skills;
		
		while (myBoss.life > 0 && myHero.life > 0){
			myHero.status();
			myBoss.status();

			//Choose skill from user input.
			if (heroSkills != null && heroSkills.length > 0) {
				while (true) {
					System.out.println("Please choose your skill to use:");
					System.out.println("0 - Attack: A \"normally\" effective attack.");
					myHero.showSkills();
					String command = sc.next();
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
					
					//Basic attack if skillNum is invalid.
					if (skillNumBoss == bossSkills.length)
						break;
					if (myBoss.chi < bossSkills[skillNumBoss].cost) {
						continue;
					}
					myBoss.skills[skillNumBoss].cast(myBoss);
					break;
				}
			}
			
			//Hero round.
			//Only attack if no life/chi skill is used.
			myHero.attack(myBoss);
			if (myBoss.life <= 0) {
				System.out.printf("%s defeated %s!\n", myHero.name, myBoss.name);
				reward();
				return true;
			}
			
			//Boss round.
			//Only attack if no life/chi skill is used.
			myBoss.attack(myHero);
			if (myHero.life <= 0) {
				System.out.printf("%s was defeated!\n", myHero.name);
				return false;
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
		this.round = round + 1;
	}
	
	//You win the battle, you get good stuff.
	private void reward() {
		System.out.printf("%s feels stronger after the glorious battle.\n", this.myHero.name);
		this.myHero.grow(this.myBoss);
	}
	

}
