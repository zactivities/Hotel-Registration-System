package location;
import enums.RoomType;
import enums.BedType;
import enums.Accessibility;
import enums.Availability;

public class Room{

	public Room(RoomType roomType, BedType bedType, Accessibility accessibility,
			Availability availability, String roomNumber, double price) {
		this.roomType = roomType;
		this.bedType = bedType;
		this.accessibility = accessibility;
		this.availability = availability;
		this.roomNumber = roomNumber;
		this.price = price;
	}
	
	public Availability getAvailability() {
		return availability;
	}
	
	public void setAvailability(Availability availability) {
		this.availability = availability;
	}
	
	public double getPrice() {
		return price;
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

	private RoomType roomType;
	private BedType bedType;
	private Accessibility accessibility; 
	private Availability availability; 
	private String roomNumber;
	private double price;
	
}
