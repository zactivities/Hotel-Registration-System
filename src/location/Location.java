package location;
import java.util.ArrayList;
import location.Room;
import enums.Accessibility;
import enums.BedType;
import enums.RoomType;
import enums.States;
import enums.LocationName;


public class Location{

	public Location(States stateAbbrev, String city, String address,
			LocationName name) {
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

	public LocationName getName() {
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
		final int floors = 6;
		double lowPrice = 110.99;
		double midPrice = 120.99;
		double highPrice = 160.99;
		int regCapacity = 4;
		int medCapacity = 6;
		int largeCapacity = 8;
		
		for(int i = 0; i < floors; i++) {
			for(int j = 0; j < 30; j++) {
				if(j < 10) {
					roomNumber = (i+1) + "0" + (j); 
					rooms.add(new Room(RoomType.STANDARDONEKING, BedType.KING,
							Accessibility.HANDICAPACCESSIBLE,
							true, roomNumber, lowPrice, 
							regCapacity));
				}
				else if((j > 9) && (j < 20)) {
					roomNumber = (i+1) + "" + (j); 
					rooms.add(new Room(RoomType.DELUXETWOQUEEN, BedType.QUEEN, 
							Accessibility.HANDICAPACCESSIBLE,
							true, roomNumber, midPrice, 
							medCapacity));
				}
				else {
					roomNumber = (i+1) + "" + (j); 
					rooms.add(new Room(RoomType.DELUXESUITE,
							BedType.KING, Accessibility.NONACCESSIBLE,
							true, roomNumber, highPrice, 
							largeCapacity));
				}
			}
		}
	}

	private ArrayList<Room> rooms;
	private States stateAbbrev;
	private LocationName name;
	private String city;
	private String address;
}
