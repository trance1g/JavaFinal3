
public class Odometer {
	
	private double mileage = 0;
	private FuelGuage k;
	public Odometer() {
		// TODO Auto-generated constructor stub
	}
	
	public Odometer(FuelGuage k) {
		// TODO Auto-generated constructor stub
		this.k = k;
	}

	
	//addmiles method that has an if statement for resetting the count at 1000000 miles
	public double addMiles(){
		if(mileage >= 999999){
			mileage = 0;
		}else{
			mileage++;
		}
		return mileage;
	}
	//getburnfuel method that shows how much fuel has been used
	public void getBurnFuel(){
		if ((mileage % 24.0) == 0){
			double total;
			total = k.getFuel() - 1.0;
			k.setFuel(total);
		}
	}
	/**
	 * @return the mileage
	 */
	public double getMileage() {
		return mileage;
	}
}
