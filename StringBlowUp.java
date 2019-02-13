
/****************************************************************************
 *
 * Created by: Wendi Yu
 * Created on: Feb 12 2019
 * Created for: ICS4U
 * This is a string blow up
 *
 ****************************************************************************/
import java.util.Scanner;

public class StringBlowUp {

	public static void main(String[] args) {
		
		// character count from 0
		int checkPosition = 0;
		
		 // intro for what the user need to put in
		System.out.println(" Enter a string (put some number and letters): ");
		
		// allow user to input string
		Scanner scanner = new Scanner(System.in);
		
		//allows and collects user input in following line
		String userInput = scanner.nextLine();
		
		//check if user input length is 0, ask them to input something
		if(userInput.length() <= 0) {
			System.out.println("Please input a string !");
		}
		// loop string depending on the length a sting has.
		for(int counter = 0; counter < userInput.length();counter ++) {	
			
			// check 0 position
			char str = userInput.charAt(checkPosition);
			
			// if 0 position is a digit and check the next position 
			if(Character.isDigit(str) && checkPosition < userInput.length() - 1) {
				
				/* if the character at index 0 of the string is a digit(like "32c"), 
				 *  check the following index of the character. if the next character is a digit,
				 *   then print it as "222ccc".
				 */
				char nextStr = userInput.charAt(checkPosition + 1);
				
				//  parse for integer in string
				int repeat = Integer.parseInt(Character.toString(str));
				
				// repeat a digit to string. ex:"3a", repeat 3 time of an "a"
				for(int StringValue = 0; StringValue < repeat; StringValue ++) {
					// print 3 time of "a"
					System.out.print(nextStr);
				}
				
				// continues the same process for next character until the end of this string
				checkPosition++;
				
				// check if 0 position is a letter
			}else if(Character.isLetter(str)) {
				
				// print the letter
				System.out.print(str);
				
				// continues the same process for next character until the end of this string
				checkPosition++;
			}
		}
			

	}

}
