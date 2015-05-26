// Copyright Wintriss Technical Schools 2013
import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {

		for (int i = 0; i < 60; i++) {
			String Color = JOptionPane
					.showInputDialog("Choose a colour betweeen 1 and 5.");

			if (Color.equals("1")) {
				Tortoise.setPenColor(java.awt.Color.BLUE);
			}

			else if (Color.equals("2")) {
				Tortoise.setPenColor(java.awt.Color.ORANGE);
			}

			else if (Color.equals("3")) {
				Tortoise.setPenColor(java.awt.Color.GREEN);
			}

			else if (Color.equals("4")) {
				Tortoise.setPenColor(java.awt.Color.MAGENTA);
			} else {
				Tortoise.setPenColor(Colors.getRandomColor());
			}
		

		// 6. put a loop around your code so that you keep asking the user for
		// more colors & drawing them

		Tortoise.setPenWidth(10);
		Tortoise.show();
		Tortoise.setSpeed(5);
		Tortoise.move(120);
		Tortoise.turn(120);
		Tortoise.move(120);
		Tortoise.turn(120);
		Tortoise.move(120);
		Tortoise.turn(120);
	}
	}
	}
	
