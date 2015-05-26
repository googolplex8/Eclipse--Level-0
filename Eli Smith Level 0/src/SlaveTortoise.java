import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SlaveTortoise {
	public static void main(String[] args) {
		String colorString = JOptionPane
				.showInputDialog("What color do you want? (Pick green, orange, or purple)");
		if (colorString.equals("green")) {
			Tortoise.setPenColor(Color.GREEN);
		} else if (colorString.equals("orage")) {
			Tortoise.setPenColor(Color.ORANGE);
		} else if (colorString.equals("purple")) {
			Tortoise.setPenColor(Color.MAGENTA);
		} else {
			Tortoise.setPenColor(Colors.getRandomColor());
		}
			Tortoise.show();
			Tortoise.setSpeed(10);

			String shape = JOptionPane
					.showInputDialog("What shape do you want? (Pick square, triangle, or circle)");
			if (shape.equals("square")) {
				square();
			} else if (shape.equals("triangle")) {
				triangle();
			} else if (shape.equals("circle")) {
				circle();
			} else {
				Tortoise.show();
				Tortoise.setSpeed(10);

				for (int i = 0; i < 5; i++) {
					Tortoise.move(100);
					Tortoise.turn(144);
					Tortoise.move(100);
				}

			}

		}
	

	public static void square() {
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
	}

	public static void triangle() {
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.turn(120);
		Tortoise.move(100);
		Tortoise.turn(120);
		Tortoise.move(100);
		Tortoise.turn(120);
		Tortoise.move(100);
		Tortoise.turn(120);
	}

	public static void circle() {
		Tortoise.show();
		Tortoise.setSpeed(10);
		for (int i = 0; i < 360; i++) {
			Tortoise.turn(1);
			Tortoise.move(1);

		}

	}
}