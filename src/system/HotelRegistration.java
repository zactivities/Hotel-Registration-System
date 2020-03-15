package system;
import java.util.ArrayList;
import java.util.HashMap;

import location.Location;
import location.Room;
import customer.Customer;
import enums.States;
import enums.Accessibility;
import enums.RoomType;

public class HotelRegistration{
	
	public HotelRegistration() {
		this.customers = new HashMap<>();
		this.locations = new HashMap<>();
		addLocations(States.WA, "Seattle", "4266 Winslow Pl N", 
				"Bax Grand Plaza");
		addLocations(States.OR, "Portland", "696 Boren Ave SE", 
				"Bax Grand Plaze II");
	}
	
	private void addLocations(States state, String city, String address, 
			String name) {
		locations.put(name, new Location(state, city, address, name));
	}
	
	public String getAvailableRooms(String locationName) {
		ArrayList<Room> available = new ArrayList<>();
		
		for(int i = 0; i < locations.get(locationName).getRooms().size(); i++) {
			if(locations.get(locationName).getRooms().get(i).isAvailable()) {
				available.add(locations.get(locationName).getRooms().get(i));
			}
		}
		return available.toString();
	}
	
	public String getBookedRooms(String locationName) {
		ArrayList<Room> booked = new ArrayList<>();
		
		for(int i = 0; i < locations.get(locationName).getRooms().size(); i++) {
			if(!locations.get(locationName).getRooms().get(i).isAvailable()) {
				booked.add(locations.get(locationName).getRooms().get(i));
			}
		}
		return booked.toString();
	}
	
	
	public String getAllRooms(String locationName) {
		return locations.get(locationName).getRooms().toString();
	}
	
	public void createNewCustomer(String firstName, String lastName, 
			String phoneNumber, RoomType roomPreference) {
		customers.put(lastName.trim().toLowerCase()+phoneNumber.trim(), 
				new Customer(firstName, lastName, phoneNumber, roomPreference));
	}
	
	public void createNewCustomer(String firstName, String lastName, 
			String phoneNumber) {
		customers.put(lastName.trim().toLowerCase()+phoneNumber.trim(), 
				new Customer(firstName, lastName, phoneNumber));
	}
	
	public Customer getCustomer(String lastName, String phoneNumber) {
		return customers.get(lastName+phoneNumber);
	}
	
	public HashMap<String, Location> getLocations() {
		return locations; 
	}

	private HashMap<String, Customer> customers;
	private HashMap<String, Location> locations;
	
}
