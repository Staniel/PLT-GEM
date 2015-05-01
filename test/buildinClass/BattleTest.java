package buildinClass;

import org.junit.Assert;
import org.junit.Test;

import buildinClass.Battle;

//@Test
public class BattleTest {
	@Test
	public void doTest(){
		Skill s1 = new Skill("Empower", 1.0, 0.2, 0.2);
		Skill s2 = new Skill("Heal", 5.0, 0, 0);
		Skill[] ss = {s1, s2};
		Monster m = new Monster("boss", 5, 2, 20, ss);
		Hero h = new Hero("hero", 5, 2, 10, ss);
		Battle b = new Battle("hey", m);
		Assert.assertEquals(b.trigger(h), true);
	}
}