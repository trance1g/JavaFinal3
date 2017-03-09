
public class FuelLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate fuelguage class and odometer class
		FuelGuage g1 = new FuelGuage();
		Odometer o1 = new Odometer(g1);
	
		//for loop for the distance traveled to show the current fuel level
	int i = 24;
	for(int x = 1; x <= 360.0; x++){
		if(g1.getFuel() <= 1){
			int y = 0;
			while(y <= 15.0){
				if(g1.getFuel() <= 15.0){
					g1.getfillTank();
					System.out.println("The current fuel level is: " + g1.getFuel());
				}
				y++;
			}
		}
		//validation that the display shows for every gallon of gas
		if(i == 24){
			System.out.println("The mileage is currently: " + o1.getMileage()
			+ " The current fuel level is: " + g1.getFuel());	
			i = 1;
		}else{
			i++;
		}
			o1.addMiles();
			o1.getBurnFuel();
			 
		
	}
			
		
	}
	
	

}
