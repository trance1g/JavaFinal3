import java.util.*;
import java.text.*;
public class P1Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate scanner class and decimalformat class
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat d1 = new DecimalFormat("#0.00");
		
		//instantiate new object
		P1 num1 = new P1();
		
		//get user input and use scanner to gather info
		int input = 0;
		System.out.println("Enter a number to calculate area: 1 for circle, 2 for rectangle, 3 for square: ");
		input = keyboard.nextInt();
		keyboard.nextLine();
		
		//switch statement decides what the output will be based on the 1-2-3 input
		switch(input){
		
		case 1: 
			System.out.println("Enter the radius of a circle: ");
			System.out.println("The area of the circle is: " + num1.Area(keyboard.nextDouble()) + " square feet.");
			break;
		case 2: 
			System.out.println("Enter the length for a rectangle, press enter, then enter the width, then press enter again. ");
			System.out.println("The area of the rectangle is: " + num1.Area(keyboard.nextDouble(), keyboard.nextDouble()) + " square feet.");
			break;
		case 3:
			System.out.println("Enter the radius for a square, press enter, then enter the height, then press enter again. ");
			System.out.println("The area of the square is: " + d1.format(num1.Area(keyboard.nextDouble(), keyboard.nextDouble(), "")) + " square feet.");
			
		
		
		}
		

	}

}
