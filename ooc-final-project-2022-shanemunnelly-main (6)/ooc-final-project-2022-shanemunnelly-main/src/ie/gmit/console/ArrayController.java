package ie.gmit.console;

public class ArrayController {

	// Fields
	private Console[] ConsoleArray;

	// Constructors
	public ArrayController() {
	}

	public ArrayController(Console[] ConsoleArray) {
		this.ConsoleArray = ConsoleArray;
	}

	public ArrayController(int arrayLength) {
		this.ConsoleArray = new Console[arrayLength];
	}

	// Getters and Setters
	public Console[] getConsoleArray() {
		return ConsoleArray;
	}

	public void setConsoleArray(Console[] ConsoleArray) {
		this.ConsoleArray = ConsoleArray;
	}

	// Add Console method
	public boolean AddConsole(String ConsoleName, short ConsoleAge, String ConsoleColour) {
		// Console is an abstract class therefore we can not use it to create an object.
		// Instead we will use the PlaystationConsole Constructor to create a Console as it
		// calls the Console constructor.
		Console newConsole = new PlaystationConsole(ConsoleName, ConsoleAge, ConsoleColour ,null); // Leave primary branch science subject null
		// Loop over the Consoles array
		for (int i = 0; i < ConsoleArray.length; i++) {
			// If element in array is null add Console object
			if (ConsoleArray[i] == null) {
				ConsoleArray[i] = newConsole;
				// return true to indicate Console was added successfully
				return true;
			}
		}
		// Return false if can not find null (i.e we have a full array)
		return false;
	}

	// Delete method
	public boolean RemoveConsole(String ConsoleName) {
		// Loop over array
		for (int i = 0; i < ConsoleArray.length; i++) {
			// if array element is not null check if it equals ConsoleID
			if (ConsoleArray[i] != null && ConsoleArray[i].getConsoleName().equals(ConsoleName)) {
				// If Console ID is found then delete it i.e. set element it null
				ConsoleArray[i] = null;
				// Return true to indicate Console deletion was successful
				return true;
			}
		}
		// Return false to indicate that Console Id was not found
		return false;
	}

	// Count method
	public int CountConsoles() {
		int counter = 0;
		for (int i = 0; i < ConsoleArray.length; i++) {
			// if array element is not null add one to counter
			if (ConsoleArray[i] != null) {
				counter++;
			}
		}
		return counter;
	}

	// Search by ID method
	public Console searchByConsoleName(String ConsoleName) {
		// Loop over array
		for (int i = 0; i < ConsoleArray.length; i++) {
			if (ConsoleArray[i] != null && ConsoleArray[i].getConsoleName().equals(ConsoleName)) {
				return ConsoleArray[i];
			}
		}
		// Return null if ConsoleID was not found
		return null;
	}

	
	
}
