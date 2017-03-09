import java.util.*;
public class Book {
	private String title, publishDate, author;

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner keyboard = new Scanner(System.in);
		 Library g1Library = new Library();
		 
		 Book b1 = new Book();
		
		 /*g1Library("Gone with the wind", "Brett Hill", "Jan 1 2010");*/
		 
		 b1.title = keyboard.nextLine()
		 b1.author = keyboard.nextLine();
		 
		 System.out.println(g1Library);
		
	}
	

}
