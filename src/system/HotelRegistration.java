package system;
import java.util.ArrayList;
import location.Location;
import location.Room;
import customer.Customer;
import enums.States;
import enums.Accessibility;
import enums.Availability;
import enums.BedType;
import enums.RoomType;
import enums.CustomerStatus;

public class HotelRegistration {
	
	
	public void addLocations(States state, String city, String address, 
			String name) {
		locations.add(new Location(state, city, address, name));
		generateRooms();
	}
	
	//TODO Figure out what to do for customer check in/
	public void customerCheckIn(String firstName, String lastName, 
			String phoneNumber, RoomType roomPreference) {
		
	}
	
	public ArrayList<Location> getLocations() {
		return locations;
	}
	
	private void generateRooms() {
		for (int firstFloor = 0; firstFloor < 30; firstFloor++) {
			locations.get(index++)
					.addRoom(new Room(RoomType.HANDICAPACCESSIBLE, BedType.KING,
							Accessibility.HANDICAPACCESSIBLE,
							Availability.AVAILABLE, "A" + firstFloor, lowPrice));
		}
		for (int secondFloor = 0; secondFloor < 30; secondFloor++) {
			locations.get(index)
					.addRoom(new Room(RoomType.DELUXETWOQUEEN,
							BedType.QUEEN, Accessibility.HANDICAPACCESSIBLE,
							Availability.AVAILABLE, "B" + secondFloor, lowPrice));
		}
		for (int thirdFloor = 0; thirdFloor < 30; thirdFloor++) {
			locations.get(index)
					.addRoom(new Room(RoomType.BUSINESSDELUXESUITE, BedType.KING,
							Accessibility.HANDICAPACCESSIBLE,
							Availability.AVAILABLE, "C" + thirdFloor, midPrice));
		}
		for (int fourthFloor = 0; fourthFloor < 30; fourthFloor++) {
			locations.get(index)
					.addRoom(new Room(RoomType.DELUXESUITE,
							BedType.KING, Accessibility.NONACCESSIBLE,
							Availability.AVAILABLE, "D" + fourthFloor, highPrice));
		}
	}
	
	private double lowPrice = 110.99;
	private double midPrice = 120.99;
	private double highPrice = 160.99;
	private static int index = 0; 
	private ArrayList<Customer> customers;
	private ArrayList<Room> rooms;
	private ArrayList<Location> locations;
}
