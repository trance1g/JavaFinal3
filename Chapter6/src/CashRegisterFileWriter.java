import java.util.*;
import java.text.*;
import java.io.*;
public class CashRegisterFileWriter{

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		DecimalFormat d = new DecimalFormat("$#,##0.00");
		Scanner k = new Scanner(System.in);
		 double quantity= 0;
		 System.out.println("Enter the quantity purchased: ");
		 quantity = k.nextDouble();
		 
		RetailItem item = new RetailItem("Candy Bar", 17789, 0.75, 10);
		
		CashRegister new1 = new CashRegister(item, quantity);
		
		PrintWriter w = new PrintWriter("num9.txt");
		
		w.print(new1.toString());
		w.close();
		
	}

}
