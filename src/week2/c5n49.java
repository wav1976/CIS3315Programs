/*
 * write a program that counts the number of vowels and consonants in a string. 
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author Valued Customer
 */
public class c5n49 {
   public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a sentence :");
    String sentence = scan.nextLine();

    String vowels = "aeiouAEIOU";
    int vowelCount = 0;
    int consCount = 0;
    int i;

      for(i = 0; i < sentence.length(); i += 1){
        char currentChar = sentence.charAt(i);
        int index;
        for(index = 0; index < vowels.length(); index += 1){
          if(vowels.charAt(index) == (currentChar)){
            vowelCount++;
          }else if(Character.isLetter(currentChar) && (vowels.charAt(index) == (currentChar))){
            consCount++;
          }
        }
      }
      
      System.out.println(consCount);
      System.out.println(vowelCount);
  }   
}
