
public class FuelGuage {

	private double fuel = 0.0; 
	
	public FuelGuage() {
		// TODO Auto-generated constructor stub
	}
	//method for filling the tank to 15 gallons
	public double getfillTank(){
		if(fuel <  15.00){
			fuel++;
		}
		return fuel;
	}
	
	
	/**
	 * @return the fuel
	 */
	public double getFuel() {
		return fuel;
	}

	/**
	 * @param fuel the fuel to set
	 */
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	//method shows how much fuel hjas been used
	public double getFuelUsed(){
		while(fuel > 1.0){
			fuel--;
		}
		return fuel;
	}

}
