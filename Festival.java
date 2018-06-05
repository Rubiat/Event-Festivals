// -------------------------------------------------------
// Festival Class
// Written by: Rubiat Zaman
// Comments: This is the festival class which contains 3 more attributes
// --------------------------------------------------------

package Assignment2.Package2;

import Assignment2.Package1.Event;

public class Festival extends Event {

	// attributes were created protected at first
	/* protected String name;
	protected double ticket_price;
	protected int duration;
	*/
	
	// The child classes of Festival will have to use getters and setters
	private String name;
	private double ticket_price;
	private int duration;
	
	
	public Festival() {  // default
		super();
		name = "Beer";
		ticket_price = 10;
		duration = 7;
	}
	
	public Festival (int year, int month, int number_of_cities, String name, double ticket_price, int duration) {
		super(year, month, number_of_cities);
		this.name = name;
		this.ticket_price = ticket_price;
		this.duration = duration;
	}
	
	public Festival (Festival anotherFestival) {  // copy
		this.setYear(anotherFestival.getYear());
		this.setMonth(anotherFestival.getMonth());
		this.setNumber_of_cities(anotherFestival.getNumber_of_cities());
		this.name = anotherFestival.name;
		this.ticket_price = anotherFestival.ticket_price;
		this.duration = anotherFestival.duration;
	}
	
	public String getName() {
		return name;
	}
	
	public double getTicket_price() {
		return ticket_price;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void add(int sum) {
		this.ticket_price+=sum;
	}
	
	public void setTicket_price (double ticket_price) {
		this.ticket_price = ticket_price;
	}
	
	public void setDuration (int duration) {
		this.duration = duration;
	}
	
	public String toString () {
		if (getNumber_of_cities() == 1)
			return ("This " + name + " Festival will be held in " + getYear() + ", month " + getMonth() + " in " + 
					getNumber_of_cities() + " city for " + duration + " days, the ticket"
							+ " will cost $" + ticket_price);
		else
			return ("This " + name + " Festival will be held in " + getYear() + ", month " + getMonth() + " in " + 
					getNumber_of_cities() + " cities for " + duration + " day(s), the ticket"
					+ " will cost $" + ticket_price);
	}
	
	public boolean equals(Object x) {
		if (x == null)  // if x is an empty object
			return false;
		else if (this.getClass() != x.getClass())  // if they're from different classes
			return false;
		else {
			Festival otherFestival = (Festival) x;
			return (this.getYear() == otherFestival.getYear() && this.getMonth() == otherFestival.getMonth() && 
				this.getNumber_of_cities() == otherFestival.getNumber_of_cities() 
				&& this.name.equals(otherFestival.name) && this.duration == otherFestival.duration && 
				this.ticket_price == otherFestival.ticket_price);
		}
	}
}
