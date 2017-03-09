import java.util.*;

public class Geometry {
	//private variables for measurements
	private double radius;
	private double length;
	private double width;
	private double base;
	private double height;
	//private variable for the number the user enters
	private int userInput;

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	
	//ovwerloaded geometry method to do the math for the shapes
	public void setHeight(double height) {
		this.height = height;
	}

	public  static double Geometry(double radius) {
		return Math.PI * (radius * radius);
	}
	
	public  static double Geometry(double length, double width) {
		return length * width;
	}
	

	public  static double Geometry(double base, double height, int a){
		return base * height * (0.5);
	}
	
	Scanner keyboard = new Scanner(System.in);
	//switch statement for the outputs and input for the sshape, depending on the dimensions and size
	public void calcArea(int userInput){
		switch(userInput){
		
		case 1: 
			System.out.println("Enter the radius of the circle: ");
			setRadius(keyboard.nextDouble());
			while(radius < 0){
				System.out.println("You have entered an invalid value, please try again.");
				setRadius(keyboard.nextDouble());
			}
			System.out.println("Area: " + Geometry(radius) + " units squared");
			break;
		case 2:
			System.out.println("Enter the length of the rectangle: ");
			setLength(keyboard.nextDouble());
			while(length < 0){
				System.out.println("You have entered an invalid value, please try again.");
				setLength(keyboard.nextDouble());
			}
			System.out.println("Enter the width of the rectangle: ");
			setWidth(keyboard.nextDouble());
			while(width < 0){
				System.out.println("You have entered an invalid value, please try again.");
				setWidth(keyboard.nextDouble());
			}
			System.out.println("Area: " + Geometry(length, width) + " units squared");
			break;
		case 3: 
			System.out.println("Enter the base of the triangle: ");
			setBase(keyboard.nextDouble());
			while(base < 0){
				System.out.println("You have entered an invalid value, please try again.");
				setBase(keyboard.nextDouble());
			}
			System.out.println("Enter the height of the triangle: ");
			setHeight(keyboard.nextDouble());
			while(height < 0){
				System.out.println("You have entered an invalid value, please try again.");
				setHeight(keyboard.nextDouble());
			}
			System.out.println("Area: " + Geometry(base, height, 1) + " units squared");
			break;
		case 4: 
			System.out.println("You have entered 4. Have a good day :)");
			System.exit(1);
	}

	}

}
