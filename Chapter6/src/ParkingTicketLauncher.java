public class ParkingTicketLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ParkedCar car = new ParkedCar("1993 Mustang Foxbody", "Ford", "LSXLOL", 185);
		ParkingMeter meter = new ParkingMeter(30);
		PoliceOfficer officer1 = new PoliceOfficer("Officer Hill", 12345);
		ParkingTicket ticket = new ParkingTicket(meter, car, officer1);
		PoliceOfficer officer2 = new PoliceOfficer(officer1, car, meter, ticket);
		officer2.examineCar();
		

	}

}