/*
 * Write a program that prompts the user to enter a string and display the 
string in reverse order. 
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author Wayne Vanzile
 */
public class c5n46 {
    public static void main(String[] args) {        
    
    String string, reverse = "";
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to reverse");
      string = in.nextLine();
 
      int length = string.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + string.charAt(i);
 
      System.out.println("Reverse of entered string is: "+reverse);
   }
}

