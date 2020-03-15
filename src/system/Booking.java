package system;

import java.time.LocalDate;
import java.time.LocalTime;

import customer.Customer;
import location.Location;

public class Booking {

	private Customer customer; 
	private Location room;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private LocalTime checkInTime;
}
