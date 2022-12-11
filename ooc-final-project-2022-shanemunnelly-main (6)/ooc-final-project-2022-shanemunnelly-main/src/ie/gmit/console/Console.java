package ie.gmit.console;

public abstract class Console {
	
// Instance Variables
private String ConsoleName;
private String ConsoleColour ;
private short ConsoleAge;
private int ConsolePrice;
private boolean hasdiscdrive ;

	//constructors for default values	
public Console() {
this.ConsoleAge=0;
this.ConsoleName =null;
this.ConsoleColour=null;
this.hasdiscdrive = false;
this.ConsolePrice = 0; 
}
	// Parameterised Constructor
public Console(String ConsoleName, short ConsoleAge, String ConsoleColour) {
	this.ConsoleAge=ConsoleAge;
	this.ConsoleName =ConsoleName;
	this.ConsoleColour=ConsoleColour;
}

//getter and setters
public String getConsoleName() {
	return ConsoleName;
}
public void setConsoleName(String consoleName) {
	ConsoleName = consoleName;
}
public String getConsoleColour() {
	return ConsoleColour;
}
public void setConsoleColour(String consoleColour) {
	ConsoleColour = consoleColour;
}
public short getConsoleAge() {
	return ConsoleAge;
}
public void setConsoleAge(short ConsoleAge) {
	this.ConsoleAge = ConsoleAge;
}
public int getConsolePrice() {
	return ConsolePrice;
}
public void setConsolePrice(int consolePrice) {
	ConsolePrice = consolePrice;
}
public boolean isHasdiscdrive() {
	return hasdiscdrive;
}
public void setHasdiscdrive(boolean hasdiscdrive) {
	this.hasdiscdrive = hasdiscdrive;
}
// MyMethod
public int Consolewarrenty() { 
int YearsofWarrenty = 2;	
return this.ConsoleAge-YearsofWarrenty;
}
// Abstract method (does not have a body)
public abstract void consoleversion();

}
