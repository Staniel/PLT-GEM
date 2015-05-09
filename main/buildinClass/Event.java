package buildinClass;

public class Event {
	
	//Information of this event.
	public String display;
	public Event[] options;
	public String id;
	
	public Event(String eid, String d, Event[] o){
		this.id = eid;
		this.display = d;
		this.options = o;
	}
	
	public Event(Event e){
		display = e.display;
		int l = e.options.length;
		options = new Event[l];
		for (int i = 0;i < l;i++)
			options[i] = new Event(e.options[i]);
	}
	
	public void display(){
		System.out.println(display);
	}

}
