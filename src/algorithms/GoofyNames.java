package algorithms;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String x = JOptionPane.showInputDialog("What is your name?");
		// 2. Print upper case name to the console using .toUpperCase()
		// Run your program to see that this works.

		// 3. Loop through each character of the name (steps 4 - 6).
		// HINT: Use .length() to determine the number of characters in the String.

		// 4. Create a String variable to store the next character of the name
		// using .substring(start, end)
		// HINT: replace 'start' and 'end' to get String with character at i
		// 5. Use MODULO to set this variable to upper case for EVEN characters
		// and lower case for ODD characters.
		String y = "";
		y = (y + x.substring(0, 1));
		y = y.toLowerCase();
		String z = "";
		z = (z + x.charAt(1));
		z = z.toUpperCase();
		System.out.println(z);
		y = (y + z);
		System.out.println(y);

		// 6. ADD this String (containing 1 char) to the goofyName String

		int a = x.length();
		for (int b = 2; b < a; b++) {
			if (b % 2 == 1) {
				String d = x.charAt(b) + "";
				y = y + d.toUpperCase();

				System.out.println(y);
			} else {String d = x.charAt(b) + "";
				y = y + d.toLowerCase();
			}

		}
		goofyName = goofyName + y;
		JOptionPane.showMessageDialog(null, "Your goofy name is " + goofyName);
	}
	// 7. Use pop-up to show user their Goofy name

}
