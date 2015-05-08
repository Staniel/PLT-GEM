package buildinClass;


import org.junit.Assert;
import org.junit.Test;

public class EventTest {
	@Test
	public void testEvent() {
		String s = "test event";
		String s1 = "test event1";
		String s2 = "test event2";
		String s3 = "test event3";
		String id = "1";
		String id1 = "2";
		String id2 = "3";
		String id3 = "4";
 		Event[] eleEvent = new Event[0];
		Event event1 = new Event(id, s, eleEvent);
		Event event2 = new Event(id1, s1, eleEvent);
		Event event3 = new Event(id2, s2, eleEvent);
		Event[] eventlist = new Event[3];
		eventlist[0] = event1;
		eventlist[1] = event2;
		eventlist[2] = event3;
		Event event = new Event(id3, s, eventlist);
		Assert.assertEquals(event.options[1].display, "test event1");
		Assert.assertEquals(event.display, "test event");
	}
}
