import java.util.Arrays;
import java.util.Scanner;  

public class Lottery{

  public static void main(String[] args){
    int[] lotteryNumbers = {4, 8, 15, 16, 23, 42};
    String betterPrintout = Arrays.toString(lotteryNumbers);
    System.out.println(betterPrintout);
	
	int arrayLength;  
	Scanner input=new Scanner(System.in);  
	System.out.print("Please enter how many numbers you want to pick.");
	arrayLength=input.nextInt();   //reading the number of elements from the that we want to enter  
	int[] array = new int[10];   //creates an array in the memory of length 10 
	System.out.println("Enter the elements of the array: ");  
	for(int loopCounter=0; loopCounter<arrayLength; loopCounter++)  
	{  
	  //reading array elements from the user   
	  array[loopCounter]=input.nextInt();  
	}  
	System.out.println("Array elements are: ");  
	// accessing array elements using the for loop  
	for (int loopCounter=0; loopCounter<arrayLength; loopCounter++)   
	{  
	  System.out.println(array[loopCounter]);  
	}  
  }

}