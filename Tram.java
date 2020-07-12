package package2;

public class Tram extends CityBus{
	
	private int maximumSpeed;
	
	public Tram() {
		super();
		maximumSpeed = 0;
	}
	
	public Tram(Tram tram) {
		super(tram);
		maximumSpeed = tram.getMaximumSpeed();
	}

	public Tram(double ticketPrice, int numberOfStops, long routeNumber, int beginOperationYear, String lineName, String driversName, int maximumSpeed) {
		super(ticketPrice, numberOfStops, routeNumber, beginOperationYear, lineName, driversName);
		this.maximumSpeed = maximumSpeed;
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "The maximum speed to which the tram can go is of " + maximumSpeed + ".";
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == null) //make sure that other is of the correct type
			return false;
		if(!(other instanceof Tram))
			return false;
		Tram tram = (Tram) other;
		return super.equals(other) && this.maximumSpeed == tram.maximumSpeed;
	}
	

	

}
