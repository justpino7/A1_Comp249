package package3;

import package1.PublicTransportation;
import package2.Metro;

public class Ferry extends PublicTransportation{
	
	private int buildYear;
	private String shipName;
	
	public Ferry() {
		super();
		buildYear = 0;
		shipName = "";
	}
	
	public Ferry(Ferry ferry) {
		buildYear = ferry.getBuildYear();
		shipName = ferry.getShipName();
	}
	
	public Ferry(double ticketPrice, int numberOfStops, int buildYear, String shipName) {
		super(ticketPrice, numberOfStops);
		this.buildYear = buildYear;
		this.shipName = shipName;
	}

	public int getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "The ferry was built in the year " + buildYear + " and its name is " + shipName + ".";
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == null) //make sure that other is of the correct type
			return false;
		if(!(other instanceof Metro))
			return false;
		Ferry ferry = (Ferry) other;
		return super.equals(other) && this.buildYear == ferry.getBuildYear()
				&& this.shipName.equals(ferry.getShipName());
	}
}

