package buildinClass;

import java.util.LinkedList;
import java.util.Random;


public class Unit {
	public String name;
	public double attack;
	public double defense;
	public double life;
	public double lifeMax;
	public int chi;
	public int chiMax;
	public Skill[] skills;
	public Skill skill;
	private String[] effects = {"badly effective", "poorly effective", "somewhat effective", "very effective", "super effective"};
	private double effectRNG;
	private LinkedList<String> achievements;
	private static Random rng = new Random();
	
	public Unit(String n, double a, double d, double l, int c, Skill[] sk){
		name = n;
		attack = a;
		defense = d;
		life = l;
		lifeMax = life;
		chi = c;
		chiMax = chi;
		skills = sk;
		this.achievements = new LinkedList<String>();
	}
	
	public Unit(Unit h){
		name = h.name;
		attack = h.attack;
		defense = h.defense;
		life = h.life;
		lifeMax = h.lifeMax;
		chi = h.chi;
		chiMax = h.chiMax;
		skills = h.skills.clone();
	}
	
	//Print out status of this unit.
	public void status() {
		System.out.printf("STATUS\t%s: %.2f / %.2f life,\t%d / %d chi,\t%.2f attack ,\t%.2f defense.\n", 
				this.name, this.life, this.lifeMax, this.chi, this.chiMax, this.attack, this.defense);
	}
	
	public void attack(Unit target) {
		effectRNG =  generateRandom();
		double damage =  Math.max(0, this.attack * effectRNG - target.defense);
		target.life -= damage;
		System.out.printf("%s attacked %s for %.2f damage, %s \n", 
				this.name, target.name, damage, effects[(int) (effectRNG / 0.25 - 2)]);
		System.out.printf("%s has %.2f life left\n",target.name, Math.max(0, target.life));
	}
	
	//Strengthen this unit based on opponent's level.
	public void grow(Unit opponent) {
		this.attack *= 1.05;
		this.defense *= 1.05;
		this.lifeMax *= 1.05;
		this.life = this.lifeMax;
		this.chi = this.chiMax;
		System.out.printf("%s: %.2f / %.2f life, %d / %d chi, %.2f attack / %.2f defense\n", 
				this.name, this.life, this.lifeMax, this.chi, this.chiMax, this.attack, this.defense);
		this.achievements.add(opponent.name);
	}
	
	//AI of boss, choosing the relatively good strategy to use.
	public void choose(Unit boss) {
		//to choose some skill.
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
	
	public void showSkills() {
		for (int i = 0; i < skills.length; i++) {
			System.out.println((i + 1) + " - " + skills[i].name + ":" + skills[i].effect());
		}
	}
	
	public void showAchievement() {
		for (String s : this.achievements)
			System.out.println(s);
	}
}
