import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Colors.Greens;
import org.teachingextensions.logo.Turtle.Animals;

public class house {
	public static void main(String[] args) {
		Tortoise.setAnimal(Animals.Spider);
		Tortoise.setX(10);
		Tortoise.setY(800);
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.turn(90);
		for (int i = 0; i < 9; i++) {
			int random = new Random().nextInt(3);
			if (random == 0) {
				building("small", Color.ORANGE);
			}
			if (random == 1) {
				building("medium", Color.ORANGE);
			}
			if (random == 2) {
				building("large", Color.ORANGE);
			}

		}
	}

	static void building(int height, Color color) {

		Tortoise.setPenColor(Greens.ForestGreen);
		Tortoise.move(30);
		Tortoise.turn(270);
		Tortoise.setPenColor(color);
		Tortoise.move(height);
		if (height == 250) {
			flatRoof();
		} else {
			pointyRoof();
		}
		Tortoise.setPenColor(color);
		Tortoise.move(height);
		Tortoise.turn(270);
	}

	private static void pointyRoof() {
		Tortoise.turn(45);
		Tortoise.move(20);
		Tortoise.turn(90);
		Tortoise.move(20);
		Tortoise.turn(45);
	}

	private static void flatRoof() {
		Tortoise.turn(90);
		Tortoise.move(20);
		Tortoise.turn(90);
	}

	static void building(String height, Color color) {
		if (height.equals("small")) {
			building(60, color);
		}
		if (height.equals("medium")) {
			building(120, color);
		}
		if (height.equals("large")) {
			building(250, color);

		}
	}
}
// 1. have the tortoise start in the bottom left corner

// 2. draw a house of height 100 |**|_

// 3. extract that into a method that takes height as a parameter

// 4. draw 9 houses of different heights

// 5. make the method take a String instead of a height

// “small” 60
// “medium” 120
// “large” 250

// 6. make the method take a color

// 7. make the grass (between houses) always green

// 8. give the houses peaked roofs

// 9. extract that into a method “drawPointyRoof” and “drawFlatRoof”

// 10. make large houses have flat rooves

// 11. make the roof type selection random
