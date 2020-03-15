package customer;
import enums.RoomType;

public class Customer{

	
	public Customer(String firstName, String lastName, String phoneNumber,
			RoomType roomPreference) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.roomPreference = roomPreference;
	}
	
	public Customer(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.roomPreference = RoomType.STANDARDONEKING;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public RoomType getRoomPreference() {
		return roomPreference;
	}
	
	public void setRoomPreference(RoomType roomPreference) {
		this.roomPreference = roomPreference;
	}

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private RoomType roomPreference;
}


