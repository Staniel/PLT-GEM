package buildinClass;

import org.junit.Assert;
import org.junit.Test;

public class MonsterTest {
	@Test
	// not sure if we should let monster grow, but test it anyway 
	public void testMonster() {
		Skill s1 = new Skill("strength", 5, 0, 1, 1, 1);
		Skill s2 = new Skill("cure", 5, 0, 0, 0, 1);
		Skill s3 = new Skill("recovery", 0, 3, 0, 0, 1);
		Skill s4 = new Skill("fight", 0, 0, 3, 0, 1);
		Skill[] ss = {s1, s2, s3, s4};
		Unit hero = new Unit("hero", 10, 10, 10, 1, ss);
		Unit monster = new Unit("boss", 10, 10, 10, 1, ss);
		monster.grow(hero);
		Assert.assertEquals(monster.attack, 10.5, 0);
		Assert.assertEquals(monster.defense, 10.5, 0);
		Assert.assertEquals(monster.lifeMax, 10.5, 0);
		Assert.assertEquals(monster.life, 10.5, 0);
		
	}
	
	@Test
	public void testLifeMaxofMonster() {
		Skill s1 = new Skill("strength", 5, 0, 1, 1, 1);
		Skill s2 = new Skill("cure", 5, 0, 0, 0, 1);
		Skill s3 = new Skill("recovery", 0, 3, 0, 0, 1);
		Skill s4 = new Skill("fight", 0, 0, 3, 0, 1);
		Skill[] ss = {s1, s2, s3, s4};
		Unit hero = new Unit("hero", 10, 10, 10, 1, ss);
		Unit monster = new Unit("boss", 10, 10, 10, 1, ss);
		monster.grow(monster);
		monster.life = 5;
		Assert.assertEquals(monster.lifeMax, 10.5, 0);
	}
}
