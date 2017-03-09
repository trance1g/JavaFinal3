import java.util.*;
public class MonthLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		
		Month p1 = new Month(0);
		Month p2 = new Month("John");
		Month p3 = new Month(40);
		Month p4 = new Month(3);
		Month p5 = new Month("September");
		Month p6 = new Month(10);
		
		System.out.println("For the value 0, it will print out " + p1.toString());
		System.out.println("For the value John, it will print out " + p2.toString());
		System.out.println("For the value 40, it will print out " + p3.toString());
		System.out.println("For the value 3, it will print out " + p4.toString());
		System.out.println("For the value September, it will print out " + p5.toString());
		System.out.println("For the value 10, it will print out " + p6.toString());
		
		System.out.println("Is September Greater that October " + p5.greaterThan(p6));
		System.out.println("Is January less that October " + p1.lessThan(p4));
		
	}

}
