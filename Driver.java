package package1;

import package2.CityBus;
import package2.Tram;
import package2.Metro;
import package3.Ferry;
import package4.AirCraft;

public class Driver {

	public static void main(String[] args) {
		
		PublicTransportation transport1 = new PublicTransportation(3.00, 5);
		System.out.println(transport1.toString());
		
		CityBus transport2 = new CityBus(3.25, 2, 123456789, 1994, "OrleanExpress", "John Smith");
		System.out.println(transport2.toString());
		
		Tram transport3 = new Tram(4.00, 0, 1235674890, 1990, "TramTram", "Jack Johnson", 300);
		System.out.println(transport3.toString());
		
		Metro transport4 = new Metro(2.25, 9, 987123650, 1976, "MetroZ", "John Jackson", 8, "Montreal");
		System.out.println(transport4.toString());
		
		Ferry transport5 = new Ferry(5.20, 1, 1982, "Titanic2");
		System.out.println(transport5.toString());
				
		//AirCraft transport6 = new AirCraft(3.50, 6, HELICOPTER, YEARLY);
		
		PublicTransportation transport7 = new PublicTransportation(3.00, 5);
		System.out.println(transport7.toString());
		
		Tram transport8 = new Tram(5.25, 1, 1069082404, 1981, "Tramerade", "John Doe", 240);
		
		CityBus transport9 = new CityBus(2.00, 3, 283749103, 1996, "JohnExpress", "Chris Rock");
		
		Ferry transport10 = new Ferry(3.00, 0, 1970, "Ferrylicious");
		
		//AirCraft transport11 = new AirCraft(7.00, 0, BALLOON, YEARLY);
		
		Metro transport12 = new Metro(1.30, 11, 193029183, 1968, "MetroX", "Chris Pratt", 9, "Toronto");
		
		PublicTransportation transport13 = new PublicTransportation(3.50, 7);
		
		Metro transport14 = new Metro(1.70, 8, 173574183, 1972, "MetroY", "Chris Pine", 6, "New York");
		
		//AirCraft transport15 = new AirCraft(6.40, 2, GLIDER, MONTHLY);
		
		
		
		System.out.println(transport2.equals(transport5));
		System.out.println(transport2.equals(transport4));
		System.out.println(transport1.equals(transport7));
		System.out.println(transport3.equals(transport4));
		System.out.println(transport3.equals(transport5));
		System.out.println(transport1.equals(transport4));
		
		PublicTransportation[] transportArray = {transport1, transport2, transport3, transport4, transport5, 
												 transport6, transport7, transport8, transport9, transport10, 
												 transport11, transport12, transport13, transport14, transport15};
		
		PublicTransportation leastExpensiveTicket = transportArray[0];
		PublicTransportation mostExpensiveTicket = transportArray[0];
		double tempMin = transportArray[0].getTicketPrice();
		double tempMax = transportArray[0].getTicketPrice();
		
		for (int i = 0; i < transportArray.length; i++) {
			if(transportArray[i].getTicketPrice() < tempMin) {
				tempMin = transportArray[i].getTicketPrice();
			}
		}
		
	}

}
