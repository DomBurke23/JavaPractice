import java.lang.StringBuilder;
import java.util.Scanner;


class dec_to_hex {
  private static final int sizeOfIntInHalfBytes = 8;
  private static final int numberOfBitsInAHalfByte = 4;
  private static final int halfByte = 0x0F;
  private static final char[] hexDigits = { 
    '0', '1', '2', '3', '4', '5', '6', '7', 
    '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
  };

  public static String decToHex(int dec) {
    StringBuilder hexBuilder = new StringBuilder(sizeOfIntInHalfBytes);
    hexBuilder.setLength(sizeOfIntInHalfBytes);
    for (int i = sizeOfIntInHalfBytes - 1; i >= 0; --i)
    {
      int j = dec & halfByte;
      hexBuilder.setCharAt(i, hexDigits[j]);
      dec >>= numberOfBitsInAHalfByte;
    }
    return hexBuilder.toString(); 
  }

  public static void main(String[] args) {
	System.out.println("Enter a decimal value (305445566) ");
     Scanner input = new Scanner(System.in);
	 int dec = input.nextInt(); 
     String hex = decToHex(dec);
     System.out.println(hex);       
  }
}