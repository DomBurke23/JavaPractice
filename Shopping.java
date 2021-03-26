import java.util.*;

class Shopping {
  
  public static void main(String[] args) {
	// define an array with [], insert values in a comma-separated list ( inside the {} 
    String[] groceryItems = {"steak", "milk", "jelly beans"};
    double[] prices = {25.00, 2.95, 2.50};
	
	
	System.out.println(" Length of groceryItems array: " + groceryItems.length);
	System.out.println(" Length of prices array: " + prices.length);
	// the following prints the address not the array 
	System.out.println("groceryItems: " + groceryItems + "prices: " + prices); 
	
	for (String i : groceryItems) {
	  System.out.println(i);
	}
	for (double i : prices) {
	  System.out.println(i);
	}
    // Replacing jelly beans to ham to the groceries
    groceryItems[2] = "ham";
    prices[2] = 4.99; 
	
	for (String i : groceryItems) {
	  System.out.println(i);
	}
	for (double i : prices) {
	  System.out.println(i);
	}
	
	/* If you uncomment the following line this file will still build but we will get an exception 
	 * due to trying to access an out of bound array element. */
	// prices[3] = 4.98;
  }
  
}