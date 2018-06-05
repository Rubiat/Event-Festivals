// -------------------------------------------------------
// MusicFiesta Class
// Written by: Rubiat Zaman
// Comments: This class is another child class of the Festival class
// --------------------------------------------------------

package Assignment2.Package2;

public class MusicFiesta extends Festival {

	private int number_of_bands;
	
	
	public MusicFiesta () {
		super();
		number_of_bands = 1;
	}
	
	public MusicFiesta (int year, int month, int number_of_cities, String name, double ticket_price, int duration, int number_of_bands) {
		super(year, month, number_of_cities, name, ticket_price, duration);
		this.number_of_bands = number_of_bands;
	}
	
	// copy constructor that would work only for protected attributes
	/* public MusicFiesta (MusicFiesta anotherMusicFiesta) {
		this.setYear(anotherMusicFiesta.getYear());
		this.setMonth(anotherMusicFiesta.getMonth());
		this.setNumber_of_cities(anotherMusicFiesta.getNumber_of_cities());
		this.name = anotherMusicFiesta.name;
		this.ticket_price= anotherMusicFiesta.ticket_price;
		this.duration = anotherMusicFiesta.duration;
		this.number_of_bands = anotherMusicFiesta.number_of_bands;
	} */
	
	public MusicFiesta (MusicFiesta anotherMusicFiesta) {
		this.setYear(anotherMusicFiesta.getYear());
		this.setMonth(anotherMusicFiesta.getMonth());
		this.setNumber_of_cities(anotherMusicFiesta.getNumber_of_cities());
		this.setName(anotherMusicFiesta.getName());
		this.setTicket_price(anotherMusicFiesta.getTicket_price());
		this.setDuration(anotherMusicFiesta.getDuration());
		this.number_of_bands = anotherMusicFiesta.number_of_bands;
	}
	
	public int getNumber_of_bands() {
		return number_of_bands;
	}
	public void setNumber_of_bands(int number_of_bands) {
		this.number_of_bands = number_of_bands;
	}
	
	// toString method using protected attributes
	/* public String toString() {
		if (getNumber_of_cities() == 1)
			return ("This " + name + " Festival will be held in " + getYear() + ", month " + getMonth() + " in " + 
					getNumber_of_cities() + " city for " + duration + " days, the ticket"
							+ " will cost $" + ticket_price + " and has " + number_of_bands + " band(s)");
		else
			return ("This " + name + " Festival will be held in " + getYear() + ", month " + getMonth() + " in " + 
					getNumber_of_cities() + " cities for " + duration + " day(s), the ticket"
					+ " will cost $" + ticket_price + " and has " + number_of_bands + " band(s)");
	} */
	
	public String toString() {
		if (getNumber_of_cities() == 1)
			return ("This " + getName() + " Festival will be held in " + getYear() + ", month " + getMonth() + " in " + 
					getNumber_of_cities() + " city for " + getDuration() + " days, the ticket"
							+ " will cost $" + getTicket_price() + " and has " + number_of_bands + " band(s)");
		else
			return ("This " + getName() + " Festival will be held in " + getYear() + ", month " + getMonth() + " in " + 
					getNumber_of_cities() + " cities for " + getDuration() + " day(s), the ticket"
					+ " will cost $" + getTicket_price() + " and has " + number_of_bands + " band(s)");
	}
	
	// equals method taking advantage of protected attributes
	/* public boolean equals (Object x) {
		if (x == null)
			return false;
		else if (this.getClass() != x.getClass())
			return false;
		else {
			MusicFiesta otherMusicFiesta = (MusicFiesta) x;
			return (this.getYear() == otherMusicFiesta.getYear() && this.getMonth() == otherMusicFiesta.getMonth() && 
					this.getNumber_of_cities() == otherMusicFiesta.getNumber_of_cities() 
					&& this.name.equals(otherMusicFiesta.name) && this.duration == otherMusicFiesta.duration && 
					this.ticket_price == otherMusicFiesta.ticket_price 
					&& this.number_of_bands == otherMusicFiesta.number_of_bands);
		}
	} */
	
	public boolean equals (Object x) {
		if (x == null)
			return false;
		else if (this.getClass() != x.getClass())
			return false;
		else {
			MusicFiesta otherMusicFiesta = (MusicFiesta) x;
			return (this.getYear() == otherMusicFiesta.getYear() && this.getMonth() == otherMusicFiesta.getMonth() && 
					this.getNumber_of_cities() == otherMusicFiesta.getNumber_of_cities() 
					&& this.getName().equals(otherMusicFiesta.getName()) && this.getDuration() == otherMusicFiesta.getDuration() && 
					this.getTicket_price() == otherMusicFiesta.getTicket_price() 
					&& this.number_of_bands == otherMusicFiesta.number_of_bands);
		}
	}
}
