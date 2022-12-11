package ie.gmit.console;

public class XboxConsole extends Console{
// Instance Variable
private String ConsoleGeneration; //Stores the consoles generation


 // Default Constructor
public XboxConsole() {
}
 	// Parameterised Constructor (3 Parameters)
public XboxConsole(String ConsoleName, short ConsoleAge, String ConsoleColour) {
super (ConsoleName,ConsoleAge,ConsoleColour);
}
  	// Parameterised Constructor (4 Parameters)
public XboxConsole(String ConsoleName, short ConsoleAge,String ConsoleColour, String ConsoleGeneration ) {
super (ConsoleName,ConsoleAge, ConsoleColour);
this.ConsoleGeneration= "ConsoleGeneration";
}
 	// Getters and Setters
public String getConsoleGeneration() {
return ConsoleGeneration;	
}
public void setConsoleGeneration(String ConsoleGeneration) {
this.ConsoleGeneration= ConsoleGeneration;	
}
// Implementing inherited abstract method
public void consoleversion(){
System.out.println("THis is the Pro version of the console");
}
}

