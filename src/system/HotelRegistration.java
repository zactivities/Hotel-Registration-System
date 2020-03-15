package system;
import java.util.HashMap;

import location.Location;
import customer.Customer;
import enums.States;
import enums.Accessibility;
import enums.RoomType;

public class HotelRegistration {
	
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
		return locations.get(locationName).getRooms().toString();
	}
	
	public Customer getCustomer(String lastName, String phoneNumber) {
		return customers.get(lastName+phoneNumber);
	}
	
	public HashMap<String,Location> getLocations() {
		return locations; 
	}

	private HashMap<String, Customer>customers;
	private HashMap<String, Location> locations;
}
