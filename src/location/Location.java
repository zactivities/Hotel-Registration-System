package location;
import java.util.ArrayList;
import java.util.HashMap;
import location.Room;
import enums.Accessibility;
import enums.Availability;
import enums.BedType;
import enums.RoomType;
import enums.States;


public class Location{

	public Location(States stateAbbrev, String city, String address,
			String name) {
		this.stateAbbrev = stateAbbrev;
		this.city = city;
		this.address = address;
		this.name = name;
		this.rooms = new ArrayList<>(); 
		generateRooms();
	}
	
	public States getStateAbbrev() {
		return stateAbbrev;
	}

	public String getCity() {
		return city;
	}

	public String getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}
	
	public int getNumRooms() {
		return rooms.size();
	}
	
	public ArrayList<Room> getRooms(){
		return rooms;
	}
	
	private void generateRooms() {
		String roomNumber;
		final int floors = 5;
		double lowPrice = 110.99;
		double midPrice = 120.99;
		double highPrice = 160.99;
		
		for(int i = 0; i < floors; i++) {
			for(int j = 0; j < 30; i++) {
				if(j < 11) {
					roomNumber = i + "0-" + j; 
					rooms.add(new Room(RoomType.STANDARDTWOQUEEN, BedType.KING,
							Accessibility.HANDICAPACCESSIBLE,
							Availability.AVAILABLE, roomNumber, lowPrice));
				}
				else if(j < 21) {
					roomNumber = i + "0-" + j; 
					rooms.add(new Room(RoomType.DELUXETWOQUEEN, BedType.QUEEN, 
							Accessibility.HANDICAPACCESSIBLE,
							Availability.AVAILABLE, roomNumber, midPrice));
				}
				else {
					roomNumber = i + "0-" + j; 
					rooms.add(new Room(RoomType.DELUXESUITE,
							BedType.KING, Accessibility.NONACCESSIBLE,
							Availability.AVAILABLE, roomNumber, highPrice));
				}
			}
		}
	}

	private ArrayList<Room> rooms;
	private States stateAbbrev;
	private String city;
	private String address;
	private String name;

}
