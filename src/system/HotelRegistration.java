package system;
import java.util.ArrayList;
import java.util.HashMap;

import location.Location;
import location.Room;
import customer.Customer;
import enums.States;
import enums.LocationName;
import enums.RoomType;

public class HotelRegistration{
	
	public HotelRegistration() {
		this.customers = new HashMap<>();
		this.locations = new HashMap<>();

	}
	
	public void addLocations(States state, String city, String address, 
			LocationName locationName) {
		locations.put(locationName, new Location(state, city, address, 
				locationName));
	}
	
	public String getAvailableRooms(LocationName locationName) {
		ArrayList<Room> available = new ArrayList<>();
		
		for(int i = 0; i < locations.get(locationName).getRooms().size(); i++) {
			if(locations.get(locationName).getRooms().get(i).isAvailable()) {
				available.add(locations.get(locationName).getRooms().get(i));
			}
		}
		return available.toString();
	}
	
	public String getBookedRooms(LocationName locationName) {
		ArrayList<Room> booked = new ArrayList<>();
		
		for(int i = 0; i < locations.get(locationName).getRooms().size(); i++) {
			if(!locations.get(locationName).getRooms().get(i).isAvailable()) {
				booked.add(locations.get(locationName).getRooms().get(i));
			}
		}
		return booked.toString();
	}
	
	
	public String getAllRooms(LocationName locationName) {
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
	
	public HashMap<LocationName, Location> getLocations() {
		return locations; 
	}

	private HashMap<String, Customer> customers;
	private HashMap<LocationName, Location> locations;
	
}
