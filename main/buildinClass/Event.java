package buildinClass;

public class Event {

  // Information of this event.
  public String display;
  public Event[] options;
  public String id;

  /**
   * @param eid event id.
   * @param display display message.
   * @param options options of this even.
   */
  public Event(String eid, String display, Event[] options) {
    this.id = eid;
    this.display = display;
    this.options = options;
  }

  /**
   * 
   * @param evt event to copy from.
   */
  public Event(Event evt) {
    int length = evt.options.length;
    
    display = evt.display;
    options = new Event[length];

    for (int i = 0; i < length; i++) {
      options[i] = new Event(evt.options[i]);
    }
  }

  public void display() {
    System.out.println(display);
  }

}
