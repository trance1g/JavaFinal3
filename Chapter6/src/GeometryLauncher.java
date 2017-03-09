import java.util.*;
public class GeometryLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate scanner and geometry class
		Scanner keyboard = new Scanner(System.in);
		Geometry g1 = new Geometry();
		
		//display options to user
		System.out.println("Geometry Calculator");
		System.out.println("1. Calculate the Area of a Circle");
		System.out.println("2. Calculate the Area of a Rectangle");
		System.out.println("3. Calculate the Area of a Triangle");
		System.out.println("4. Quit");
		
		//depending on which choice the user enters, it will run the switch statement and display the output
		System.out.println("Enter your choice 1-4");
		
		//user input validation for values outside the range
		int userInput = keyboard.nextInt();
		while(userInput > 4 || userInput < 0){
			System.out.println("You have entered a value outside of the range indicated, please try again.");
			userInput = keyboard.nextInt();
		}
		
		//calling the switch
		g1.calcArea(userInput);
		 
		
		
		

		

	}

}
