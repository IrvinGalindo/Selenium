package utilities;

public enum DriverType {
	
	Chrome("Chrome"),
	FireFox("FireFox"),
	IE("Internet Explore");
	
	private final String value;
	
	DriverType(final String newValue) {
		value = newValue;
	}
	
	public String getValue() { return value; }
	
}
