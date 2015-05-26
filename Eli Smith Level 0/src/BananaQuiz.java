// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		
		String answer = JOptionPane.showInputDialog("Do you like life?");

		if (answer.equals("no")) {
			JOptionPane.showMessageDialog(null, "Your screwed up!!! End of Quiz :)");
		}

		if (answer.equals("yes")) {

			String answer2 = JOptionPane
					.showInputDialog("What is your favorite hobby?");

			JOptionPane.showMessageDialog(null, answer2
					+ " is much better with life!");
		}

	}
}