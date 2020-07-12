package package1;

public class PublicTransportation {
	private double ticketPrice;
	private int numberOfStops;
	
	public PublicTransportation() {
		ticketPrice = 0.0;
		numberOfStops = 0;
		
	}
	
	public PublicTransportation(PublicTransportation PT) {
		this.ticketPrice = PT.ticketPrice;
		this.numberOfStops = PT.numberOfStops;
	}
	
	public PublicTransportation(double ticketPrice, int numberOfStops) {
		this.ticketPrice = ticketPrice;
		this.numberOfStops = numberOfStops;
	}
	
	public double getTicketPrice() {
		return ticketPrice;
	}
	
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public int getNumberOfStops() {
		return numberOfStops;
	}
	
	public void setNumberOfStops(int numberOfStops) {
		this.numberOfStops = numberOfStops;
	}
	
	@Override
	public String toString() {
		return "The price of a ticket is of " + ticketPrice + " and there are " + numberOfStops + " stops. ";
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == null) //make sure that other is of the correct type
			return false;
		if(!(other instanceof PublicTransportation))
			return false;
		PublicTransportation publicTransportation = (PublicTransportation) other;
		return this.ticketPrice == publicTransportation.getTicketPrice() 
				&& this.numberOfStops == publicTransportation.getNumberOfStops();
	}
	
}
