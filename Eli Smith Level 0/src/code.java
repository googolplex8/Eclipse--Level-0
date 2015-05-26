// Copyright Wintriss Technical Schools 2014
import java.util.Random;

import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your
 * friend can read it. You set up the passcode and the secret message. Your
 * friend types in the passcode to retrieve the message.
 * 
 */

public class code {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		String code = "qwerty7821googolplex88LK";
		int randomNumber = new Random().nextInt(9999999);
		int randomNumber2 = new Random().nextInt(9999999);

		String answer = JOptionPane.showInputDialog("Enter The Code...");
		if (answer.equals(code)) {
			JOptionPane
					.showMessageDialog(
							null,
							"Meet me at global coordinates "
									+ randomNumber
									+ ", "
									+ randomNumber2
									+ " (there is a nuclear arsenal and naval base hidden there)");
		} else {
			JOptionPane
					.showMessageDialog(
							null,
							"INTRUDER!!!, self destruct in T-10 (would you like nuclear or bioweapon death?)");
		}

	}

	// 2. Using a pop-up, ask for a secret message and store it in a variable

	// 3. Ask your friend for the passcode and store it in a variable

	// 4. If the passcode matches, show the secret message

	// 5. If the passcode does not match, pop-up "INTRUDER!!"
	// qwerty7821googolplex88LK
}
