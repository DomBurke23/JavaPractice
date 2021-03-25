import java.util.Scanner;

public class hex_to_dec{  
  public static void main(String args[])
  {  
    System.out.println("Enter a Hex value eg a");
	Scanner input = new Scanner(System.in);
	String hex = input.next();  
    int decimal=Integer.parseInt(hex,16);  
    System.out.println(decimal);  
  }
} 