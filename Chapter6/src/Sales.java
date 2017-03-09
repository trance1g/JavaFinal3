import java.text.*;
import java.util.*;
import java.io.*;
public class Sales {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		PrintWriter p = new PrintWriter("WeeklySales.txt");
		DecimalFormat d = new DecimalFormat("$#,##0.00");
		double sales = 0;
		double total = 0;
		
		
		
		for(int count = 1; count <= 5; count++){
			
			System.out.println("Enter a sales amount for day " + count + ":");
			sales = keyboard.nextDouble();
			
			if(sales > 0){
			total += sales;
			}else{
				total -= sales;
			}
			
			p.println("Sales for day " + count + " was " + d.format(sales));
			
			while(sales < 0){
				System.out.println("You have entered a negative number, please try again!");
				System.out.println("Enter a sales amount for day " + count + ":");
				sales = keyboard.nextDouble();
				count = 1;
				
			}
			
		}
		p.println("_______________________");
		p.println("Total sales for the period is: " + d.format(total));
		
		
		p.close();
	}

}
