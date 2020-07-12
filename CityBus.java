package package2;

import package1.PublicTransportation;

public class CityBus extends PublicTransportation {
	
	protected long routeNumber;
	protected int beginOperationYear;
	protected String lineName;
	protected String driversName;
	
	public CityBus() {
		super();
		routeNumber = 0;
		beginOperationYear = 0;
		lineName = "";
		driversName = "";
	}
	
	public CityBus(CityBus cityBus) {
		super(cityBus);
		routeNumber = cityBus.getRouteNumber();
		beginOperationYear = cityBus.getBeginOperationYear();
		lineName = cityBus.getLineName();
		driversName = cityBus.getDriversName();
	}
	
	public CityBus(double ticketPrice, int numberOfStops, long routeNumber, int beginOperationYear, String lineName, String driversName) {
		super(ticketPrice, numberOfStops);
		this.routeNumber = routeNumber;
		this.beginOperationYear = beginOperationYear;
		this.lineName = lineName;
		this.driversName = driversName;
	}

	public long getRouteNumber() {
		return routeNumber;
	}

	public void setRouteNumber(long routeNumber) {
		this.routeNumber = routeNumber;
	}

	public int getBeginOperationYear() {
		return beginOperationYear;
	}

	public void setBeginOperationYear(int beginOperationYear) {
		this.beginOperationYear = beginOperationYear;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getDriversName() {
		return driversName;
	}

	public void setDriversName(String driversName) {
		this.driversName = driversName;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "The city bus route number is " + routeNumber + " and it started operating in the year " 
				+ beginOperationYear + ". The line name is " + lineName + " and the driver's name is " + driversName + ".";
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == null) //make sure that other is of the correct type
			return false;
		if(!(other instanceof CityBus))
			return false;
		CityBus cityBus = (CityBus) other;
		return super.equals(other)
				&& this.routeNumber == cityBus.routeNumber
				&& this.beginOperationYear == cityBus.beginOperationYear
				&& this.lineName.equals(cityBus.lineName)
				&& this.driversName.equals(cityBus.driversName);
		}
	


}
