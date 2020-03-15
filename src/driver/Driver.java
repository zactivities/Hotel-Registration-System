package driver;

import enums.LocationName;
import enums.States;
import system.HotelRegistration;

public class Driver {

	public static void main(String[] args) {
		HotelRegistration system = new HotelRegistration(); 
		system.addLocations(States.WA, "Seattle", "4266 Winslow Pl N", 
				LocationName.BAXGRANDPLAZA);
		
		System.out.println(system.getAllRooms(LocationName.BAXGRANDPLAZA));
	}
}
