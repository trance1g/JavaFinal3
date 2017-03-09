import java.util.Scanner;
import java.io.*;
public class ChargeEditLauncher {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		Charge c1 = new Charge();
		File file = new File("C:\\Users\\trance1g\\Desktop\\P5.txt");
		Scanner inputFile = new Scanner(file);
		
		final int SIZE = 18;
		int index = 0;
		int[] numbers = new int[SIZE];
		while(inputFile.hasNext() && index < numbers.length){
			numbers[index] = inputFile.nextInt();
			index++;
		}
		int input;
		
		do{
			System.out.println("Enter your charge account number: ");
			input = k.nextInt();
		if(c1.sequentialSearch(input) == -1){;
			System.out.println("The account number is not present.");
		}else{
			System.out.println("The charge account number exists.");
			}
		}while(input != 9999999);
		
		inputFile.close();
	}

}
