package buildinClass;

import org.junit.Assert;
import org.junit.Test;

import buildinClass.Battle;

//@Test
public class BattleTest {
	@Test
	public void doTest(){
		// test the game when the hero is lost
		Skill s1 = new Skill("Defend", 5, 0, 0, 2, 1);
		Skill s2 = new Skill("Heal", 10, 0, 0, 0, 1);
		Skill s3 = new Skill("Think", 0, 3, 0, 0, 0);
		Skill s4 = new Skill("Let's do this", 0, 0, 3, -1, 3);
		Skill[] ss = {s1, s2, s3, s4};
		Unit m = new Unit("Aho", 5, 3, 50, 5, ss);
		Unit h = new Unit("Ted", 20, 3, 20, 5, ss);
		Battle b = new Battle("Battle to death!", m);
<<<<<<< HEAD
		Assert.assertEquals(b.trigger(h), true);
=======
		Assert.assertEquals(b.trigger(h), true);	
>>>>>>> 9d256157bd0197559e2b1d4a08e6270491fc620f
	}
	
	@Test
	public void testReward() {
		Skill s1 = new Skill("strength", 5, 0, 1, 1, 1);
		Skill s2 = new Skill("cure", 5, 0, 0, 0, 1);
		Skill s3 = new Skill("recovery", 0, 3, 0, 0, 1);
		Skill s4 = new Skill("fight", 0, 0, 3, 0, 1);
		Skill[] ss = {s1, s2, s3, s4};
		Unit hero = new Unit("hero", 10, 10, 10, 1, ss);
		Unit m = new Unit("boss", 10, 10, 10, 1, ss);
		Battle b = new Battle("Battle to death!", m);
		b.myHero = hero;
		b.reward();
		Assert.assertEquals(hero.attack, 10.5, 0);
		Assert.assertEquals(hero.defense, 10.5, 0);
		Assert.assertEquals(hero.lifeMax, 10.5, 0);
		Assert.assertEquals(hero.life, 10.5, 0);
	}
	
	
	
	
}