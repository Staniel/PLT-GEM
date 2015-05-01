package buildinClass;

import org.junit.Assert;
import org.junit.Test;

import buildinClass.Battle;

//@Test
public class BattleTest {
	@Test
	public void doTest(){
		Monster m = new Monster("boss", 0.5, 0.5, 10, null);
		Hero h = new Hero("hero", 1.0, 1.0, 5.0, null);
		Battle b = new Battle("hey", m);
		Assert.assertEquals(b.trigger(h), true);
	}
}