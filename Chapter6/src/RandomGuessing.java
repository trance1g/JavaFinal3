import java.util.Scanner;
import java.util.Random;

public class RandomGuessing {

    //-----------------------------------------------------------------------------------------------
    //This application prompt to the user to guess a number. The user can still playing until
    //guess the number or want to quit
    //-----------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        Random rand = new Random();

        int randNum = rand.nextInt(100) + 1;
        System.out.println(randNum);

        System.out.println("\t\tHi-Lo Game with Numbers\t\t\n\t   Guess a number between 1 and 100!!!\n");

        String ans;
        int attemptsCount = 0;

        do {

            System.out.print("Guess the number: ");
            int input = scan.nextInt();

            while(input != randNum){

                attemptsCount++;

                if(input < randNum){
                    System.out.println();
                    System.out.print("low guessing\nEnter new number: ");
                    input = scan.nextInt();
                }
                else{
                    System.out.println();
                    System.out.print("high guessing\nEnter new number: ");
                    input = scan.nextInt();
                }
            }

            System.out.println();
            System.out.println("Congrats!!! You guess right\nAttempts: "+attemptsCount);

            System.out.println();
            System.out.print("You want to play again (yes/no): ");
            ans = scan.next();

            randNum = rand.nextInt(100) + 1; //generate new random number between same above range, 
                                             //if the user wants to keep playing.

        }while (ans.equalsIgnoreCase("yes"));


    }
}
