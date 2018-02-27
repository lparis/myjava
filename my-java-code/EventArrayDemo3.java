import javax.swing.JOptionPane;

public class EventArrayDemo3 
{
	public static void main(String[] args) 
	{
		String[] eventTypes = {"", "Private", "Corporate", "Non-profit"};
		String choiceString = "";
		String strSelectedEvent;
		int selectedEvent;
		Event[] someEvents = new Event[5];
		int x;
		
		for (x = 1; x < eventTypes.length; ++x)
			choiceString = choiceString + "\n" + x + " " + eventTypes[x];
		
		for (x = 0; x < someEvents.length; ++x)
		{
			strSelectedEvent = JOptionPane.showInputDialog(null, "Event #" + (x + 1) + " Enter the number for the type of event you want" + choiceString);
			selectedEvent = Integer.parseInt(strSelectedEvent);
			
			if (selectedEvent < 1 || selectedEvent > 3)
				selectedEvent = 0;
			
			someEvents[x] = new Event(selectedEvent);
		}
		
		for (x = 0; x < someEvents.length; ++x)
			System.out.println(someEvents[x].getType() + " " + eventTypes[someEvents[x].getType()] + " " + someEvents[x].getRate() + " " + someEvents[x].getManager());
		
		increaseFees(someEvents, 100.00);
		
		System.out.println("After increaes: ");
		for (x = 0; x < someEvents.length; ++x)
			System.out.println(someEvents[x].getType() + " " + eventTypes[someEvents[x].getType()] + " " + someEvents[x].getRate() + " " + someEvents[x].getManager());
	}
	
	public static void increaseFees(Event[] e, double increaseAmt)
	{
		int x;
		for (x = 0; x < e.length; ++x)
			e[x].setRate(e[x].getRate() + increaseAmt);
	}
}
