// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class magic8ball {

	// 0. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		// 1. Make a variable that will hold a random number
int randomNumber = new Random().nextInt(4);
		// 2. Put a random number into this variable using
		// "new Random().nextInt(4)"

		// 3. Print out this variable
System.out.println(randomNumber);
		// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Enter a question or else!!!");
		// 5. If the random number is 0
		// -- tell the user "Yes"
		if(randomNumber == 0)
		{
			JOptionPane.showMessageDialog(null, "Yes, of course!");
		}
	

		// 6. If the random number is 1

		// -- tell the user "No"
		if(randomNumber == 1)
		{
			JOptionPane.showMessageDialog(null, "NO! YOU NOOB!");
		}
		// 7. If the random number is 2
		if(randomNumber == 2)
		{
			JOptionPane.showMessageDialog(null, "I don't know, that's a stupid question!");
		}
		// -- tell the user "Maybe?"

		// 8. If the random number is 3

		// -- write your own answer
		if(randomNumber == 3)
		{
			JOptionPane.showMessageDialog(null, "Your problem! Figure it out!");
		}
	}
}