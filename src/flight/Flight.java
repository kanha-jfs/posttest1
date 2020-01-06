package flight;

public class Flight {

	int availablityseats;
	String destination;
	float price;
	String source;
	String traveldate;

	public Flight() {
		source = "Hyderabad";
		destination = "Delhi";
		traveldate = "23/01/2020";
		availablityseats = 24;
		price = 2303.0f;

	}//constructor
	
	public Flight(int pavailablityseats, String pdestination, float pprice, String psource, String ptraveldate) {
		source = psource;
		destination = pdestination;
		traveldate = ptraveldate;
		availablityseats = pavailablityseats;
		price = pprice;
	}//parameterised constructor

	public void accepttDetails() {
		source = "Hyderabad";
		destination = "Delhi";
		traveldate = "23/01/2020";
		availablityseats = 24;
		price = 2303.0f;
	}// acceptdetails

	public void DisplayDetails() {
		System.out.println(source);
		System.out.println(destination);
		System.out.println(traveldate);
		System.out.println(availablityseats);
		System.out.println(price);

	}// Displaydetails



	@Override
	public String toString() {
		return "Flight [availablityseats=" + availablityseats + ", destination=" + destination + ", price=" + price
				+ ", source=" + source + ", traveldate=" + traveldate + "]";
	}
	
}// class
