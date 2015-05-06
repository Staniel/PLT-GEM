package buildinClass;

import org.junit.Assert;
import org.junit.Test;

import buildinClass.Battle;

//@Test
public class BattleTest {
	@Test
	public void doTest(){
		// test the game when the hero is lost
		Skill s1 = new Skill("LOL", 5, 0, 0.255, 0.255, 1);
		Skill s2 = new Skill("Heal", 5, 0, 0, 0, 1);
		Skill s3 = new Skill("Think", 0, 1, 0, 0, 0);
		Skill[] ss = {s1, s2, s3};
		Unit m = new Unit("boss", 5, 2, 20, 5, ss);
		Unit h = new Unit("hero", 5, 2, 10, 5, ss);
		Battle b = new Battle("Battle to death!", m);
		Assert.assertEquals(b.trigger(h), true);
		
	}
	
	@Test
	public void testLost() {
		// test lost
		//Skill s3 = new Skill("futile", 0, 0, 0);
		//Skill[] ss2 = {s3};
		//Character h1 = new Character("PLT", 5, 2, 0, ss2);
		//Monster m1 = new Monster("Aho", 5, 2, 20, ss2);
		//Battle b2 = new Battle("futile", m1);
		//Assert.assertEquals(b2.trigger(h1), false);
	}
}