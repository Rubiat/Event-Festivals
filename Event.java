// -------------------------------------------------------
// Event Class
// Written by: Rubiat Zaman
// Comments: This is the event class (parent class)
// --------------------------------------------------------

package Assignment2.Package1;

public class Event {

	private int year;
	private int month;
	private int number_of_cities;
	
	public Event () { // default constructor
		year = 2018;
		month = 02;
		number_of_cities = 2;
	}
	
	public Event (int year, int month, int number_of_cities) {  // parameter constructor
		this.year = year;
		this.month = month;
		this.number_of_cities = number_of_cities;
	}
	
	public Event (Event anotherEvent) {  // copy constructor
		this.year = anotherEvent.getYear();
		this.month = anotherEvent.getMonth();
		this.number_of_cities = anotherEvent.getNumber_of_cities();
	}
	
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getNumber_of_cities () {
		return number_of_cities;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setNumber_of_cities (int number_of_cities) {
		this.number_of_cities = number_of_cities;
	}
	
	public String toString() {
		if (number_of_cities == 1)  // if only 1 city, will display the first message
			return ("This event will be held in " + year + ", month " + month + " in " + 
					number_of_cities + " city");
		else
			return ("This event will be held in " + year + ", month " + month + " in " + 
					number_of_cities + " cities");
	}
	
	public boolean equals(Object x) {
		if (x == null)  // without checking if it's null, it might compare an event with an empty object
			return false;
		else if (this.getClass() != x.getClass())  // <- so that it doesn't compare an event with an object of another class
			return false;
		else
		{Event otherEvent = (Event) x; // at this point we know for sure that they're from the same class
		return (this.year == otherEvent.year && this.month == otherEvent.month && 
				this.number_of_cities == otherEvent.number_of_cities);
		}
	}
}
