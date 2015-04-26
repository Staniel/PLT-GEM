
public class Event {
	public String display;
	public Event[] options;
	public Event(String d, Event[] o){
		display = d;
		options = o;
	}
	public Event(Event e){
		display = e.display;
		int l = e.options.length;
		options = new Event[l];
		for (int i=0;i<l;i++)
			options[i] = new Event(e.options[i]);
	}
}
