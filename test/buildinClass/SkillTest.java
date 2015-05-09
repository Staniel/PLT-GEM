package buildinClass;

import org.junit.Assert;
import org.junit.Test;

public class SkillTest {
	@Test
	public void testSkill() {
		Skill s1 = new Skill("Defend", 6, 0, 0, 2, 1);
		Skill s2 = new Skill("Heal", 10, 0, 0, 0, 1);
		Skill s3 = new Skill("Think", 0, 2, 0, 0, 0);
		Skill s4 = new Skill("Let's do this", 0, 0, 3, -0.5, 3);
		Skill[] ss = {s1, s2, s3, s4};
		Unit h = new Unit("hero", 5, 3, 20, 5, ss);
		s1.cast(h);
		Assert.assertEquals(h.life, 20, 0);
		h.life = 10;
		s1.cast(h);
		Assert.assertEquals(h.life, 16, 0);
		h.life = 15;
		s1.cast(h);
		Assert.assertEquals(h.life, 20, 0);
	}
	
	@Test
	public void testEffect() {
		Skill s1 = new Skill("Defend", 6, 0, 0, 2, 1);
		Skill s2 = new Skill("Heal", 10, 0, 0, 0, 1);
		Skill s3 = new Skill("Think", 0, 2, 0, 0, 0);
		Skill s4 = new Skill("Let's do this", 0, 0, 3, -0.5, 3);
		Skill[] ss = {s1, s2, s3, s4};
		Unit h = new Unit("hero", 5, 3, 20, 5, ss);
		Assert.assertEquals(s1.effect(), "Restore 6.0 life for caster. Increase defend by 200.0% for this round. Costs 1 chi. ");
	}
	
	@Test
	public void testCancel() {
		Skill s1 = new Skill("Attach", 6, 0, 2, 2, 1);
		Skill s2 = new Skill("Heal", 10, 0, 0, 0, 1);
		Skill s3 = new Skill("Think", 0, 2, 0, 0, 0);
		Skill s4 = new Skill("Let's do this", 0, 0, 3, -0.5, 3);
		Skill[] ss = {s1, s2, s3, s4};
		Unit h = new Unit("hero", 5, 3, 20, 5, ss);
		s1.cancel(h);
		Assert.assertEquals(h.attack, 1.666666,0.0001);
	}
}
