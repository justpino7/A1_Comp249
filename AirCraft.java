package package4;

import package1.PublicTransportation;

public class AirCraft extends PublicTransportation{
	
	public enum ClassType {HELICOPTER, AIRLINE, GLIDER, BALLOON};
	public enum MaintenanceType {WEEKLY, MONTHLY, YEARLY};
	
	private ClassType classType;
	private MaintenanceType maintenanceType;
	
	public AirCraft() {
		super();
		classType = ClassType.HELICOPTER;
		maintenanceType = MaintenanceType.WEEKLY;
	}
	
	public AirCraft(AirCraft airCraft) {
		classType = airCraft.getClassType();
		maintenanceType = airCraft.getMaintenanceType();
	}
	
	public AirCraft(double ticketPrice, int numberOfStops, ClassType classType, MaintenanceType maintenanceType) {
		super(ticketPrice, numberOfStops);
		this.classType = classType;
		this.maintenanceType = maintenanceType;
	}

	public ClassType getClassType() {
		return classType;
	}

	public void setClassType(ClassType classType) {
		this.classType = classType;
	}

	public MaintenanceType getMaintenanceType() {
		return maintenanceType;
	}

	public void setMaintenanceType(MaintenanceType maintenanceType) {
		this.maintenanceType = maintenanceType;
	}
	
	@Override
	public String toString() {
		return super.toString() 
		+ "The class type of the aircraft is " + classType + " and it is maintained " + maintenanceType + ".";
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == null) //make sure that other is of the correct type
			return false;
		if(!(other instanceof AirCraft))
			return false;
		AirCraft aircraft = (AirCraft) other;
		return super.equals(other) 
				&& this.classType == aircraft.getClassType()
				&& this.maintenanceType == aircraft.getMaintenanceType();
		
	}
	
	
	

}
