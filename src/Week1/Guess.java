package Week1;

import java.util.Scanner;

/**Have the user guess a number between 1 and 10. Loop until they get it right. 
 * more to come. New change. 
 * This line was added in GITHUB.02012017 That is today. 
 * 
 * 
 * @author Wayne Vanzile CIS 3315
 * 
 */
public class Guess {

    public static void main(String[] args) {
        int answer = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number");
        System.out.println("Guess a number from 1 and 10");

        while (true) {
            System.out.println("Enter a number: ");
          
            if (sc.nextInt() == answer) {
                break;
            } else {
                System.out.println("Wrong try again");
            }

        }
        System.out.println("Excellant guess. You are right");
    }
}
