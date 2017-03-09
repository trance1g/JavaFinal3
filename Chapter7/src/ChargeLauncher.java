import java.util.*;
public class ChargeLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate scanner and charge classes as new objects
		Scanner k = new Scanner(System.in);
		Charge c1 = new Charge();
		
		int input;
		
		//do while loop that determines if the account number is present in the array
		do{
		System.out.println("Enter your charge account number: ");
		input = k.nextInt();
		if(c1.sequentialSearch(input) == -1){;
		System.out.println("The account number is not present.");
		}else{
			System.out.println("The charge account number exists.");
		}
		}while(input != 9999999);
		
	
	}

}
