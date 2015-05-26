import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class highLow {

	public static void main(String[] args) {

		int random = new Random().nextInt(100);

		System.out.println(random);

		int guessInt = 0;
		for (int i = 0; i < 3; i++) {

			String guess = JOptionPane
					.showInputDialog(null, "Give me a guess!");

			guessInt = Integer.parseInt(guess);

			if (guessInt == random) {
				JOptionPane.showMessageDialog(null, "You win!!!");
				i = 4;
			}

			if (guessInt > random) {
				JOptionPane.showMessageDialog(null, "Too High!!!");
			}

			if (guessInt < random) {
				JOptionPane.showMessageDialog(null, "Too Low!!");
			}

		}

		if (guessInt != random) {
			JOptionPane.showMessageDialog(null, "You Loose!!!");
		}
	}
}
