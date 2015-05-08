package buildinClass;


import org.junit.Assert;
import org.junit.Test;

public class HeroTest {
	@Test
	public void testHero() {
		Skill s1 = new Skill("strength", 5, 0, 1, 1, 1);
		Skill s2 = new Skill("cure", 5, 0, 0, 0, 1);
		Skill s3 = new Skill("recovery", 0, 3, 0, 0, 1);
		Skill s4 = new Skill("fight", 0, 0, 3, 0, 1);
		Skill[] ss = {s1, s2, s3, s4};
		Unit hero = new Unit("hero", 10, 10, 10, 1, ss);
		Unit m = new Unit("boss", 10, 10, 10, 1, ss);
		hero.grow(m);
		Assert.assertEquals(hero.attack, 10.5, 0);
		Assert.assertEquals(hero.defense, 10.5, 0);
		Assert.assertEquals(hero.lifeMax, 10.5, 0);
		Assert.assertEquals(hero.life, 10.5, 0);
		
	}
	
	@Test
	public void testLifeMax() {
		Skill s1 = new Skill("strength", 5, 0, 1, 1, 1);
		Skill s2 = new Skill("cure", 5, 0, 0, 0, 1);
		Skill s3 = new Skill("recovery", 0, 3, 0, 0, 1);
		Skill s4 = new Skill("fight", 0, 0, 3, 0, 1);
		Skill[] ss = {s1, s2, s3, s4};
		Unit hero = new Unit("hero", 10, 10, 10, 1, ss);
		Unit m = new Unit("boss", 10, 10, 10, 1, ss);
		hero.grow(m);
		hero.life = 5;
		Assert.assertEquals(hero.lifeMax, 10.5, 0);
	}
	
	@Test
	public void testGenerateRandom() {
		Skill s1 = new Skill("strength", 5, 0, 1, 1, 1);
		Skill s2 = new Skill("cure", 5, 0, 0, 0, 1);
		Skill s3 = new Skill("recovery", 0, 3, 0, 0, 1);
		Skill s4 = new Skill("fight", 0, 0, 3, 0, 1);
		Skill[] ss = {s1, s2, s3, s4};
		Unit hero = new Unit("hero", 10, 10, 10, 1, ss);
		Unit m = new Unit("boss", 10, 10, 10, 1, ss);
		double test1 = hero.generateRandom();
		Assert.assertEquals(test1, 1, 0.5);
	}
	
}
