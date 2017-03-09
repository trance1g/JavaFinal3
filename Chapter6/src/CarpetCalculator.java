import java.util.*;
import java.text.*;
public class CarpetCalculator {
 
     
    public static void main(String[] args) {
         
        Scanner keyboard = new Scanner (System.in);
        
       
        System.out.println("Enter the width of the room: ");
        double width = keyboard.nextDouble();
        System.out.println("Enter the length of the room: ");
        double length = keyboard.nextDouble();
        System.out.println("Enter the price of the carpet per square foot: ");
        double cost = keyboard.nextDouble();
        
        RoomDimension copy = new RoomDimension(width, length);
        
        RoomCarpet room = new RoomCarpet(copy, cost);
        System.out.print("The total area is : " + copy.roomArea() + " square feet. \nThe total cost is : $" + room.calculate());
        
        
         
    }
 
 
}