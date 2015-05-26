// Copyright Wintriss Technical Schools 2014
import java.io.IOException;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class xGeeks {
	public static void main(String[] args) throws InterruptedException, IOException {

		// 1. Save the superpower for each person in a variable.
		String Eli = "awesomeness";
		String Andrew = "procrastination and uselessness and not doing what is told ever";
		String June = "recipe creation";
		String TJ = "singing and being tall";

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String answer = JOptionPane
				.showInputDialog("Enter someone in the rooms name (not anyone)");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (answer.equals("Eli")) {
			Runtime.getRuntime().exec("say " + Eli).waitFor();
		} else if (answer.equals("Andrew")) {
			Runtime.getRuntime().exec("say " + Andrew).waitFor();
		} else if (answer.equals("June")) {
			Runtime.getRuntime().exec("say " + June).waitFor();
		} else if (answer.equals("TJ")) {
			Runtime.getRuntime().exec("say " + TJ).waitFor();
		} else {
			Runtime.getRuntime().exec("say Nothing").waitFor();
		}
	}
}