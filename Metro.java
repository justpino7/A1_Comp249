package package2;

public class Metro extends CityBus {
	
	private int numberOfVehicules;
	private String nameOfCity;
	
	public Metro() {
		super();
		numberOfVehicules = 0;
		nameOfCity = "";
	}
	
	public Metro(Metro metro) {
		super(metro);
		numberOfVehicules = metro.getNumberOfVehicules();
		nameOfCity = metro.getNameOfCity();
	}
	
	public Metro(double ticketPrice, int numberOfStops, long routeNumber, int beginOperationYear, String lineName, String driversName, int numberOfVehicules, String nameOfCity) {
		super(ticketPrice, numberOfStops, routeNumber, beginOperationYear, lineName, driversName);
		this.numberOfVehicules = numberOfVehicules;
		this.nameOfCity = nameOfCity;
	}

	public int getNumberOfVehicules() {
		return numberOfVehicules;
	}

	public void setNumberOfVehicules(int numberOfVehicules) {
		this.numberOfVehicules = numberOfVehicules;
	}

	public String getNameOfCity() {
		return nameOfCity;
	}

	public void setNameOfCity(String nameOfCity) {
		this.nameOfCity = nameOfCity;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "The number of vehicules of the metro is of " + numberOfVehicules + " and the name of the city is " + nameOfCity + ".";
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == null) //make sure that other is of the correct type
			return false;
		if(!(other instanceof Metro))
			return false;
		Metro metro = (Metro) other;
		return super.equals(other) && this.numberOfVehicules == metro.getNumberOfVehicules()
				&& this.nameOfCity.equals(metro.getNameOfCity());
	}
	
}
