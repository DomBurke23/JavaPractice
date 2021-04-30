import java.util.ArrayList;
import java.util.Collections; 
import java.util.Scanner;

class CalculateTotal {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.clear();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    expenses.set(2, 10.58);
	
	
    Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your expense: ");
    expenses.add(sc.nextDouble());
	
    expenses.remove(3);
    double total = 0;
    int ArrayListSize = expenses.size(); 
	
	
	System.out.println("Your ordered list: ");
    // Iterate over expenses
    for (int i = 0; i<expenses.size();i++){
      total = total+expenses.get(i);
    }
	
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