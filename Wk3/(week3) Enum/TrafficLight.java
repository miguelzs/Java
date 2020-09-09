public enum TrafficLight {

	// enum is a special data type that enables a variable to be a 
	// set of predefined constants

	RED ("Stop"), GREEN ("Go"), YELLOW("Use caution");
	
	private String description;

	private TrafficLight (String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}