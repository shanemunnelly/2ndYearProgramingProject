package ie.gmit.console;

//Import the Scanner class to read user input
import java.util.Scanner;

/**
 * This is the Main class. It contains the main method.
 */
public class Main {

	// This is the main method. It contains a print statement.
	public static void main(String[] args) {

		// Instantiate Scanner class so we can start reading user input
		Scanner UserInput = new Scanner(System.in);

		// Used to store user Menu option selection
		int userSelection = 0;
		// Used to create and manipulate array
		ArrayController ac = new ArrayController(5);

		// Create infinite while loop to display Menu after every command
		while (true) {
			// Display Menu to console
			System.out.println("************************************************");
			System.out.println("**             Console Selection              **");
			System.out.println("************************************************");
			System.out.println("** (1) Add a console user                     **");
			System.out.println("** (2) Delete a console user                  **");
			System.out.println("** (3) Show total number of active consoles   **");
			System.out.println("** (4) Search by Console Version              **");
			System.out.println("** (5) Quit                                   **");
			System.out.println("************************************************");
			System.out.println("** select an option from 1 -5 and press enter **");
			System.out.println("************************************************");

			// Store user Menu option selection
			userSelection = UserInput.nextInt();

			// Execute option
			if (userSelection == 1) { // Add 
				System.out.println("Enter Console Username");
				String ConsoleName = UserInput.next();
				System.out.println("Enter how many years have you had this console>");
				short ConsoleAge = UserInput.nextShort();
				System.out.println ("enter console colour");
				String ConsoleColour =UserInput.next();

				boolean result = ac.AddConsole(ConsoleName, ConsoleAge,ConsoleColour);

				System.out.println(result);
			} else if (userSelection == 2) { // Delete
				System.out.println("Enter Console Name>");
				String ConsoleName = UserInput.next();

				boolean result = ac.RemoveConsole(ConsoleName);

				System.out.println(result);

			} else if (userSelection == 3) { // Count
				System.out.println(ac.CountConsoles());
			} else if (userSelection == 4) { // Search
				System.out.println("Enter Console Name");
				String ConsoleName = UserInput.next();

				Console newConsole = ac.searchByConsoleName(ConsoleName);

				if (newConsole == null) {
					System.out.println(" NOT found");
				} else {
					System.out.println(" found!");
				}
			} else if (userSelection == 5) { // quit
				break;
			} // End If/Else
			
		} // End while
		UserInput.close();

	} // End main method
} // End Main Class