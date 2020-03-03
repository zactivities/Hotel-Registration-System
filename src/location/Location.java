package location;
import java.util.HashMap;

import enums.States;


public class Location{

	public Location(States stateAbbrev, String city, String address,
			String name) {
		this.stateAbbrev = stateAbbrev;
		this.city = city;
		this.address = address;
		this.name = name;
		this.rooms = new HashMap<>(); 
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
	
	public void addRoom(Room room) {
		rooms.put(room.getRoomNumber(), room);
	}

	private HashMap<String, Room> rooms;
	private States stateAbbrev;
	private String city;
	private String address;
	private String name;
}
