package location;
import enums.RoomType;
import enums.BedType;
import enums.Accessibility;
import enums.Availability;

public class Room{

	public Room(RoomType roomType, BedType bedType, Accessibility accessibility,
			boolean availability, String roomNumber, double price, 
			int capacity) {
		this.roomType = roomType;
		this.bedType = bedType;
		this.accessibility = accessibility;
		this.availability = availability;
		this.roomNumber = roomNumber;
		this.price = price;
		this.capacity = capacity;
	}
	
	public boolean isAvailable() {
		return availability;
	}
	
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public RoomType getRoomType() {
		return roomType;
	}
	
	public BedType getBedType() {
		return bedType;
	}
	
	public Accessibility getAccessibility() {
		return accessibility;
	}
	
	public String getRoomNumber() {
		return roomNumber;
	}

	@Override
	public String toString() {
		return "\n\nRoom "+roomNumber+"[roomType=" + roomType + ", bedType=" + bedType
				+ ", accessibility=" + accessibility + ", availability="
				+ availability + ", roomNumber=" + roomNumber + ", price="
				+ price + ", capacity=" + capacity + "]";
	}
	
	private RoomType roomType;
	private BedType bedType;
	private Accessibility accessibility; 
	private boolean availability; 
	private String roomNumber;
	private double price;
	private int capacity;
}
