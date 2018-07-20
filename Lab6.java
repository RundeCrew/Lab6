import java.util.Scanner;
import java.util.Random;


public class Lab6 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to the Grand Circus Casino!\n"); 
		
		System.out.println("How many sides should each die have?");// asking for side of dice
		int numSides = scnr.nextInt();
		
		String rollAgain = "y"; // initializing for loop
		int rollNum = 1;        // to print out what roll number the user is on.
		
		do {
					
			System.out.println("Roll " + rollNum + ":"); //printing out what roll number the user is on
			
			System.out.println(dieRoll(numSides)); //My random die roll Method (see below)
			
			System.out.println("\nDo you want to roll again? (y/n)"); //roll again?
			rollAgain = scnr.next();
			rollNum += 1;
			
		} while (rollAgain.trim().toLowerCase().startsWith("y")); // allowing for user to enter any version of y/Y or Yes/yes
		
		System.out.println("Thank you for playing!"); // always thank your player!
	
}
	private static String dieRoll (int x) { // my method for random generator. Used another method inside this method
		Random randGen = new Random(); 
		randGen.nextInt(x);
		int dieOne = randGen.nextInt(x) + 1;
		int dieTwo = randGen.nextInt(x) +1;
		
		return (dieOne + " \n" + dieTwo);
	}
			
}

