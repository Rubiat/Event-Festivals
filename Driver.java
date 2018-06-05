// -------------------------------------------------------
// Driver Class
// Written by: Rubiat Zaman
// Comments: This class tests the toString and equals methods and the functionality of the other classes
// --------------------------------------------------------

package Assignment2.Package5;

import Assignment2.Package1.Event;
import Assignment2.Package2.CulturalFiesta;
import Assignment2.Package2.Festival;
import Assignment2.Package2.MusicFiesta;
import Assignment2.Package3.SportCompetition;
import Assignment2.Package3.SportCompetition.Season;
import Assignment2.Package4.Fair;
import Assignment2.Package4.Fair.Type;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Event [] EventArray = new Event[10];

		//Creating the 6 objects to test their toString methods:
		EventArray[0] = new Event();
		EventArray[1] = new Festival();
		EventArray[2] = new CulturalFiesta();
		EventArray[3] = new MusicFiesta();
		EventArray[4] = new SportCompetition();
		EventArray[5] = new Fair();
		
		// testing out the toString() method for the 6 different classes
		System.out.println(EventArray[0]);  
		System.out.println(EventArray[1]);
		System.out.println(EventArray[2]);
		System.out.println(EventArray[3]);
		System.out.println(EventArray[4]);
		System.out.println(EventArray[5]);

		System.out.println();

		// Creating two new objects to test out equals methods
		EventArray[6] = new Event();
		EventArray[7] = new MusicFiesta();

		// testing out the equals() method (all objects are created via default constructor so far)
		System.out.println(EventArray[0].equals(EventArray[6]));   // true -> Event & Event
		System.out.println(EventArray[1].equals(EventArray[2]));   // false -> Festival & CulturalFiesta
		System.out.println(EventArray[3].equals(EventArray[4]));   // false -> MusicFiesta & SportCompetition
		System.out.println(EventArray[3].equals(EventArray[7]));   // true -> MusicFiesta & MusicFiesta

		// filling the array with 10 Event objects:
		EventArray[8] = new Festival(2017, 06, 1, "Comedy", 50, 14);
		EventArray[9] = new Fair(2017, 05, 5, 10, Type.Career);
		


		System.out.println();

		Event least_cities = EventArray[0]; // the event with least amount of cities, currently initialized at 0
		Event most_cities = EventArray[0];  // the event with the most amount of cities
		int index_of_least = 0; // index where the object with least amount of cities is located
		int index_of_most = 0;

		for (int i = 1; i < EventArray.length; i++) { // finding Event with least cities
			if (EventArray[i].getNumber_of_cities() <= least_cities.getNumber_of_cities()) {
				least_cities = EventArray[i]; // if event at i has less cities than the current least_cities event
				index_of_least = i;
			}
		}

		for (int i = 1; i < EventArray.length; i++) {  // event with most cities
			if (EventArray[i].getNumber_of_cities() >= most_cities.getNumber_of_cities()) {
				most_cities = EventArray[i];
				index_of_most = i;
			}
		}

		//displaying the Event objects with least and most cities
		System.out.println("The event with the least cities located at index " + index_of_least + ":");
		System.out.println(least_cities);
		System.out.println();
		System.out.println("The event with the most cities located at index " + index_of_most + ":");
		System.out.println(most_cities);

		System.out.println();




		/* changing the year for the events because otherwise almost all of them happen 
		 * in the same year (since I created them using the copy constructor) */
		EventArray[2].setYear(2019);
		EventArray[3].setYear(2020);  // 3 and 6 have same year
		EventArray[4].setYear(2025);
		EventArray[5].setYear(2015);
		EventArray[6].setYear(2020);  // 6 and 3 have the same year
		EventArray[7].setYear(2050);
		EventArray[8].setYear(2000);
		EventArray[9].setYear(1950);
		// Objects at index 1 and 0 also have the same year since I didn't change them and they're both created from default constructor

		for (int i = 0; i < EventArray.length; i++) {
			for (int j = 0; j < i; j++) { // going to compare an object at 'i' index with all the previous objects
				if (EventArray[i].getYear() == EventArray[j].getYear()) {
					System.out.println("Objects at index " + i + " and " + j + " are happening in the same year:");
					System.out.println(EventArray[i]);
					System.out.println(EventArray[j]);
					System.out.println();
				}
			}
		}
		
		
		// testing out the (deliberately faulty) copy array method
		Event [] originalEvent = new Event[12];
		
		originalEvent[0] = new Event();
		originalEvent[1] = new Festival();
		originalEvent[2] = new CulturalFiesta();
		originalEvent[3] = new MusicFiesta();
		originalEvent[4] = new SportCompetition();
		originalEvent[5] = new Fair();
		originalEvent[6] = new Event(2015, 07, 4);
		originalEvent[7] = new Festival(2016, 06, 5, "Arts", 35, 14);
		originalEvent[8] = new CulturalFiesta(2012, 02, 4, "Fire", 20, 7, 4);
		originalEvent[9] = new MusicFiesta(2019, 02, 1, "Igloofest", 50, 14, 7);
		originalEvent[10] = new SportCompetition(2020, 8, 2, 4, Season.summer);
		originalEvent[11] = new Fair(2014, 06, 5, 4, Type.Travel);
		
		for (int i = 0; i < originalEvent.length; i++)
			System.out.println(originalEvent[i]);
		
		System.out.println();
		
		Event [] copyEvent = copyFestival(originalEvent);
		
		for (int i = 0; i < copyEvent.length; i++)
			System.out.println(copyEvent[i]);
		
		System.out.println("\nThe copying method doesn't work since there is no polymorphism "
				+ "at work because there is no overriding methods afterall. Since only "
				+ "the new Event() constructor was used, it ended up creating only new "
				+ "objects from the Event class since only one Event() constructor exists.");

	}
	
	// copy Event array method
	public static Event [] copyFestival(Event [] anEvent) {
		Event[] newEvent = new Event [anEvent.length];
		
		for (int i = 0; i < anEvent.length; i++)
			newEvent[i] = new Event(anEvent[i]);
		
		return newEvent;
	}

}
