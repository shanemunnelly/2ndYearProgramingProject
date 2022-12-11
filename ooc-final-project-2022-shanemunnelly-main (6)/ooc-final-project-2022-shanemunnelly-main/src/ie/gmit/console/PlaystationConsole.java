package ie.gmit.console;

public class PlaystationConsole extends Console{
	// Instance Variable
private String PlaystationConsoleGeneration; //Stores the console generation
//Default Constructor
public PlaystationConsole() {
}
  	// Parameterised Constructor (3 Parameters)
public PlaystationConsole(String ConsoleName, short ConsoleAge, String ConsoleColour) {
super (ConsoleName,ConsoleAge,ConsoleColour);
}
 	// Parameterised Constructor (4 Parameters)
public PlaystationConsole(String ConsoleName, short ConsoleAge, String PlaystationConsoleGeneration, String ConsoleColour ) {
super (ConsoleName, ConsoleAge, ConsoleColour);
this.PlaystationConsoleGeneration= "PlaystationConsoleGeneration";
}
  // getters and setters
public String getPlaystationConsoleGeneration() {
return PlaystationConsoleGeneration;	
}
public void setPlaystationConsoleGeneration(String PlaystationConsoleGeneration) {
this.PlaystationConsoleGeneration= PlaystationConsoleGeneration;	
}
  //Polymorphism
@Override
public int Consolewarrenty() { 
int YearsofWarrenty = 4;	
return super.getConsoleAge() -YearsofWarrenty;
}
 //implementing the abstraction method
public void consoleversion(){
System.out.println("THis is the Pro version of the console");
}
}
