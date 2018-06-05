// -------------------------------------------------------
// CulturalFiesta Class
// Written by: Rubiat Zaman
// Comments: This class is a child of the Festival class
// --------------------------------------------------------

package Assignment2.Package2;

public class CulturalFiesta extends Festival {

	private int spoken_languages;
	
	public CulturalFiesta() {  // default constructor
		super();
		spoken_languages = 1;
	}
	
	
	public CulturalFiesta (int year, int month, int number_of_cities, String name, double ticket_price, int duration, int spoken_languages) {
		super(year, month, number_of_cities, name, ticket_price, duration);
		this.spoken_languages = spoken_languages;
	}
	
	// This copy constructor could work if Festival had protected attributes instead
	/* public CulturalFiesta (CulturalFiesta anotherCulturalFiesta) {
		this.setYear(anotherCulturalFiesta.getYear());
		this.setMonth(anotherCulturalFiesta.getMonth());
		this.setNumber_of_cities(anotherCulturalFiesta.getNumber_of_cities());
		this.name(anotherCulturalFiesta.getName());
		this.ticket_price = anotherCulturalFiesta.ticket_price;
		this.duration = anotherCulturalFiesta.duration;
		this.spoken_languages = anotherCulturalFiesta.spoken_languages;
	} */
	
	public CulturalFiesta (CulturalFiesta anotherCulturalFiesta) {
		this.setYear(anotherCulturalFiesta.getYear());
		this.setMonth(anotherCulturalFiesta.getMonth());
		this.setNumber_of_cities(anotherCulturalFiesta.getNumber_of_cities());
		this.setName(anotherCulturalFiesta.getName());
		this.setTicket_price(anotherCulturalFiesta.getTicket_price());
		this.setDuration(anotherCulturalFiesta.getDuration());
		this.spoken_languages = anotherCulturalFiesta.spoken_languages;
	}
	
	public void add (int sum) {
		this.setTicket_price(this.getTicket_price()+1);
	}
	
	
	public int getSpoken_languages() {
		return spoken_languages;
	}
	
	public void setSpoken_languages(int spoken_languages) {
		this.spoken_languages = spoken_languages;
	}
	
	// this method could work if Festival used protected attributes
	/* public String toString() {
		if (getNumber_of_cities() == 1)
			return ("This " + name + " Festival will be held in " + getYear() + ", month " + getMonth() + " in " + 
					getNumber_of_cities() + " city for " + duration + " days, the ticket"
							+ " will cost $" + ticket_price + " and has " + spoken_languages + " spoken language(s)");
		else
			return ("This " + name + " Festival will be held in " + getYear() + ", month " + getMonth() + " in " + 
					getNumber_of_cities() + " cities for " + duration + " day(s), the ticket"
					+ " will cost $" + ticket_price + " and has " + spoken_languages + " spoken language(s)");
	} */
	
	public String toString() {
		if (getNumber_of_cities() == 1)
			return ("This " + getName() + " Festival will be held in " + getYear() + ", month " + getMonth() + " in " + 
					getNumber_of_cities() + " city for " + getDuration() + " days, the ticket"
							+ " will cost $" + getTicket_price() + " and has " + spoken_languages + " spoken language(s)");
		else
			return ("This " + getName() + " Festival will be held in " + getYear() + ", month " + getMonth() + " in " + 
					getNumber_of_cities() + " cities for " + getDuration() + " day(s), the ticket"
					+ " will cost $" + getTicket_price() + " and has " + spoken_languages + " spoken language(s)");
	}
	
	// This method could work if Festival used protected attributes
	/* public boolean equals(Object x) {
		if (x == null)
			return false;
		else if (this.getClass() != x.getClass())
			return false;
		else {
			CulturalFiesta otherCulturalFiesta = (CulturalFiesta) x;
			return (this.getYear() == otherCulturalFiesta.getYear() && this.getMonth() == otherCulturalFiesta.getMonth() && 
					this.getNumber_of_cities() == otherCulturalFiesta.getNumber_of_cities() 
					&& this.name.equals(otherCulturalFiesta.name) && this.duration == otherCulturalFiesta.duration && 
					this.ticket_price == otherCulturalFiesta.ticket_price 
					&& this.spoken_languages == otherCulturalFiesta.spoken_languages);
		}
	} */
	
	public boolean equals(Object x) {
		if (x == null)
			return false;
		else if (this.getClass() != x.getClass())
			return false;
		else {
			CulturalFiesta otherCulturalFiesta = (CulturalFiesta) x;
			return (this.getYear() == otherCulturalFiesta.getYear() && this.getMonth() == otherCulturalFiesta.getMonth() && 
					this.getNumber_of_cities() == otherCulturalFiesta.getNumber_of_cities() 
					&& this.getName().equals(otherCulturalFiesta.getName()) && this.getDuration() == otherCulturalFiesta.getDuration() && 
					this.getTicket_price() == otherCulturalFiesta.getTicket_price() 
					&& this.spoken_languages == otherCulturalFiesta.spoken_languages);
		}
	}
}
