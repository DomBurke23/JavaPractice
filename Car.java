
/**
 *  A class is the set of instructions that describe how an 
 *  instance can behave and what information it contains.
 *  public is an access level modifier that allows other classes 
 *  to interact with this class.
 */ 

public class Car {
  String color;
  // new fields
  boolean isRunning;
  int velocity;
  static int milesDriven;

  // This is a constructor method. 
  // new parameters that correspond to the new fields
  public Car(String carColor, boolean carRunning, int milesPerHour, int milesDrove) {
	// instructions for creating a Car instance go in here. 
    color = carColor;
    // assign new parameters to the new fields
    isRunning = carRunning;
    velocity = milesPerHour;
	milesDriven = milesDrove;
  }
  
  public static void startEngine() {
  System.out.println("Starting the car!");
  System.out.println("Vroom!");
  }
  
  public static void drive() {
     String message = "Miles driven: " + milesDriven;
     System.out.println(message);
  }
    
  public void startRadio(String station) {
    System.out.println("Turning on the radio to " + station + "!");
    System.out.println("Enjoy!");
  }
  
  public int numberOfTires() {
   int tires = 4;
   return tires;
}

  public static void main(String[] args) {
	startEngine();
	/* ferrari is declared as access reference data type. 
	 * This means that the value of ferrari is a reference to an instance's memory address. 
	 * invoke the constructor after the "=" by using the keyword "new"
     * new values passed into the method call */
    Car ferrari = new Car("red", true, 27, 13000);
    Car renault = new Car("blue", false, 70,4367);
    ferrari.startEngine();
    System.out.println(renault.isRunning); // should print false
    System.out.println(ferrari.velocity);  // should print 27
	ferrari.drive();
	renault.startRadio("Meditation Station");
	int numTires = renault.numberOfTires();
  }
}