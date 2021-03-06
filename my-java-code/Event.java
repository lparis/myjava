
public class Event 
{
	private int typeOfEvent;
	private double rate;
	private String manager;
	
	public int getType()
	{
		return typeOfEvent;
	}
	public double getRate()
	{
		return rate;
	}
	public String getManager()
	{
		return manager;
	}
	public void setType(int eventType)
	{
		typeOfEvent = eventType;
	}
	public void setRate(double eventRate)
	{
		rate = eventRate;
	}
	public void setManager(String managerName)
	{
		manager = managerName;
	}
	
	// /** // Constructor
	public Event(int eType)
	{
		double[] rateSchedule = {0.0, 47.99, 75.99, 30.99};
		String[] managerList = {"X", "Dustin Britt", "Carmen Lindsey", "Robin Armanetti"};
		typeOfEvent = eType;
		if (eType > rateSchedule.length)
			eType = 0;
		rate = rateSchedule[eType];
		manager = managerList[eType];
	}
	//**/
}
