// import array list library. 
import java.util.ArrayList;
import java.util.Collections; 
import java.util.Scanner;

/* elements can be added and removed from an ArrayList whenever you want */

class CalculateTotal {
  
  public static void main(String[] args) {
    // Create an ArrayList object and add elements. 
    ArrayList<Double> expenses = new ArrayList<Double>();
    //clear list before adding elements 
    expenses.clear();
    // add elements
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    // Modify an entry
    expenses.set(2, 10.58);
    // Remove an entry
    expenses.remove(3);
	  
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your expense: ");
    expenses.add(sc.nextDouble());
    
    double total = 0;
    
    // Get size of Array list 
    int ArrayListSize = expenses.size(); 
    
    // Iterate over expenses, expenses.size access the elements in the list. 
    for (int i = 0; i<expenses.size();i++){
      total = total+expenses.get(i);
    }
	  
    System.out.println("Your ordered list: ");    
    // print the arraylist in ascending order. 
	  Collections.sort(expenses);
	  for (double i : expenses) {
      System.out.println(i);
    }
    
    System.out.println("Total expense = " + total);
    System.out.println("Size of ArrayList " + ArrayListSize);
    System.out.println("Size of ArrayList " + expenses.size());
    
  }
  
}
