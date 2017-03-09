import java.util.*;
import java.text.*;
public class LandtractLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//instantiate two new objects
		Landtract num1 = new Landtract();
		Landtract num2 = new Landtract();
		
		//get input using the getters and setters and the keyboard scanner
		System.out.println("Enter the length for tract 1: ");
		num1.setLength(keyboard.nextDouble());
		System.out.println("Enter the width for tract 1: ");
		num1.setWidth(keyboard.nextDouble());
		System.out.println("The area for tract 1 is: " + num1.getArea());
		System.out.println(num1.toString());
		
		//get input using the getters and setters and the keyboard scanner
		System.out.println("Enter the length for tract 2: ");
		num2.setLength(keyboard.nextDouble());
		System.out.println("Enter the width for tract 2: ");
		num2.setWidth(keyboard.nextDouble());
		System.out.println("The area for tract 1 is: " + num2.getArea());
		System.out.println(num2.toString());
		
		//if else statemtn for displaying the areas are equal or not
		if(num1.equals(num2)){
			System.out.println("The areas of land are equal");
		}else{
			System.out.println("These areas are not equal");
		}
		
		
		
	}
		

	}

