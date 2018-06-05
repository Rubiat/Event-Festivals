// -------------------------------------------------------
// Fair Class
// Written by: Rubiat Zaman
// Comments: This class is a direct child of the Event class
// --------------------------------------------------------

package Assignment2.Package4;

import Assignment2.Package1.Event;

public class Fair extends Event {

	private int number_of_exhibitors;
	
	public enum Type {Career, Science, Trade, Travel};  // enum variables
	
	private Type type;
	
	public Fair() {
		super();
		number_of_exhibitors = 5;
		type = Type.Science;
	}
	
	public Fair(int year, int month, int number_of_cities, int number_of_exhibitors, Type type) {
		super(year, month, number_of_cities);
		this.number_of_exhibitors = number_of_exhibitors;
		this.type = type;
	}
	
	public Fair(Fair anotherFair) {
		this.setYear(anotherFair.getYear());
		this.setMonth(anotherFair.getMonth());
		this.setNumber_of_cities(anotherFair.getNumber_of_cities());
		this.number_of_exhibitors = anotherFair.number_of_exhibitors;
		this.type = anotherFair.type;
	}
	
	public int getNumber_of_exhibitors() {
		return number_of_exhibitors;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setNumber_of_exhibitors (int number_of_exhibitors) {
		this.number_of_exhibitors = number_of_exhibitors;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public String toString() {
		if (getNumber_of_cities() == 1)
			return ("This " + type + " Fair will be held in " + getYear() + ", month " + getMonth() + " in " + 
					getNumber_of_cities() + " city and has " + number_of_exhibitors + " exhibitor(s)");
		else
			return ("This " + type + " Fair will be held in " + getYear() + ", month " + getMonth() + " in " + 
					getNumber_of_cities() + " cities and has " + number_of_exhibitors + " exhibitor(s)");
	}
	
	public boolean equals(Object x) {
		if (x == null)
			return false;
		else if (this.getClass() != x.getClass())
			return false;
		else {
			Fair otherFair = (Fair) x;
			return (this.getYear() == otherFair.getYear() && this.getMonth() == otherFair.getMonth() && 
					this.getNumber_of_cities() == otherFair.getNumber_of_cities() && 
					this.number_of_exhibitors == otherFair.number_of_exhibitors && this.type.equals(otherFair.type));
		}
	}
}
