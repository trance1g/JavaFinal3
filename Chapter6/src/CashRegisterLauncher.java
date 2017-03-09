import java.util.*;
import java.text.*;
public class CashRegisterLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat d = new DecimalFormat("$#,##0.00");
		Scanner k = new Scanner(System.in);
		 double quantity= 0;
		 System.out.println("Enter the quantity purchased: ");
		 quantity = k.nextDouble();
		 
		RetailItem item = new RetailItem("Candy Bar", 17789, 0.75, 1.5);
		
		CashRegister new1 = new CashRegister(item, quantity);
		
		System.out.println("The quantity for the sale is: " + quantity);
		
		System.out.println("The subtotal for 10 items bought is: " + d.format(new1.getSubTotal()));
		
		System.out.println("The tax for thew sale is: " + d.format(new1.getTax()));
		
		System.out.println("The total for the sale is: " + d.format(new1.getTotal()));
		
	}

}
