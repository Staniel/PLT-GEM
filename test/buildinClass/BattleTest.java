package buildinClass;

import org.junit.Assert;
import org.junit.Test;

import buildinClass.Battle;

//@Test
public class BattleTest {
	@Test
	public void doTest(){
		// test the game when the hero is lost
		Skill s1 = new Skill("Empower", 1.0, 0.2, 0.2);
		Skill s2 = new Skill("Heal", 5.0, 0, 0);
		Skill[] ss = {s1, s2};
		Monster m = new Monster("boss", 5, 2, 20, ss);
		Hero h = new Hero("hero", 5, 5, 2, 10, ss);
		Battle b = new Battle("Battle to death!", m);
		Assert.assertEquals(b.trigger(h), true);
		
		// test the display of the game
		Assert.assertEquals(b.display, "hey");
		
	}
	
	@Test
	public void testLost() {
		// test lost
		Skill s3 = new Skill("futile", 0, 0, 0);
		Skill[] ss2 = {s3};
		Hero h1 = new Hero("PLT", 5, 2, 0, ss2);
		Monster m1 = new Monster("Aho", 5, 2, 20, ss2);
		Battle b2 = new Battle("futile", m1);
		Assert.assertEquals(b2.trigger(h1), false);
	}
}