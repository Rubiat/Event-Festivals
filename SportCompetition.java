// -------------------------------------------------------
// SportCompetition Class
// Written by: Rubiat Zaman
// Comments: This class is a direct child of the Event class
// --------------------------------------------------------

package Assignment2.Package3;

import Assignment2.Package1.Event;

public class SportCompetition extends Event {

	private int number_of_activities;
	
	public enum Season {summer, fall, winter, spring}; // enum variables for the seasons
	
	private Season season; 
	
	public SportCompetition() {
		super();
		number_of_activities = 1;
		season = Season.summer;
	}
	
	public SportCompetition(int year, int month, int number_of_cities, int number_of_activities, Season season) {
		super(year, month, number_of_cities);
		this.number_of_activities = number_of_activities;
		this.season = season;
	}
	
	public SportCompetition (SportCompetition anotherSportCompetition) {
		this.setYear(anotherSportCompetition.getYear());
		this.setMonth(anotherSportCompetition.getMonth());
		this.setNumber_of_cities(anotherSportCompetition.getNumber_of_cities());
		this.number_of_activities = anotherSportCompetition.number_of_activities;
		this.season = anotherSportCompetition.season;
	}
	
	public int getNumber_of_activities() {
		return number_of_activities;
	}
	
	public Season getSeason() {
		return season;
	}
	
	public void setNumber_of_activities(int number_of_activities) {
		this.number_of_activities = number_of_activities;
	}
	
	public void setSeason(Season season) {
		this.season = season;
	}
	
	public String toString() {
		if (getNumber_of_cities() == 1)
			return ("This " + season + " Sport Competition will be held in " + getYear() + ", month " + getMonth() + " in " + 
					getNumber_of_cities() + " city and has " + number_of_activities + " activities");
		else
			return ("This " + season + " Sport Competition will be held in " + getYear() + ", month " + getMonth() + " in " + 
					getNumber_of_cities() + " cities and has " + number_of_activities + " activities");
	}
	
	public boolean equals (Object x) {
		if (x == null) 
			return false;
		else if (this.getClass() != x.getClass())
			return false;
		else {
			SportCompetition otherSportCompetition = (SportCompetition) x;
			return (this.getYear() == otherSportCompetition.getYear() && this.getMonth() == otherSportCompetition.getMonth() && 
					this.getNumber_of_cities() == otherSportCompetition.getNumber_of_cities() && 
					this.number_of_activities == otherSportCompetition.number_of_activities && 
					this.season.equals(otherSportCompetition.season));
		}
	}
}
