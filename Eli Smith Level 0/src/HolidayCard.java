import java.applet.AudioClip;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JApplet;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class HolidayCard extends MouseAdapter {

	double treeWidth = 15;
	double scale = 1.1; // This is how much the width of the tree grows with
						// each layer

	/* 1. Paste your methods from the Christmas Tree Recipe here. */
	void drawTreeBody() {

		// 8. Change the color of the line the tortoise draws to forest green
		Tortoise.setPenColor(Colors.Greens.ForestGreen);
		// 1. Make a variable for turnAmount and set it to 175
		int turnAmount = 175;
		// 2. Start the Tortoise facing to the right
		Tortoise.show();
		drawStar();
		Tortoise.penUp();
		Tortoise.turn(-90);
		Tortoise.move(treeWidth / 2);
		Tortoise.turn(180);
		Tortoise.penDown();
		Tortoise.setPenColor(Colors.Greens.ForestGreen);
		// 5. Repeat steps 3 through 10, 11 times
		for (int i = 0; i < 11; i++) {
			Tortoise.setSpeed(10);
			// 3. Move the tortoise the width of the tree
			Tortoise.move(treeWidth);
			// 4. Turn the tortoise the current turnAmount to the right
			Tortoise.turn(turnAmount);
			// 6. Set the widthOfTree to the current widthOfTree times the scale
			treeWidth = treeWidth * scale;
			// 7. Move the tortoise the width of a tree again
			Tortoise.move(treeWidth);
			
			// 8. Turn the tortoise the current turn amount to the LEFT
			Tortoise.turn(-turnAmount);
			// 9. Set the widthOfTree to the current widthOfTree times the scale
			// again
			treeWidth = treeWidth * scale;
			// 10. Decrease turnAmount by 1
			turnAmount = turnAmount - 1;
		}

		}

	
	public static void triangle() {
		Tortoise.show();
		Tortoise.setPenColor(Colors.Reds.Crimson);
		Tortoise.setSpeed(10);
		Tortoise.turn(120);
		Tortoise.move(5);
		Tortoise.turn(120);
		Tortoise.move(5);
		Tortoise.turn(120);
		Tortoise.move(5);
		Tortoise.turn(120);
	}
	void drawTreeTrunk() {
		// 1. Move the tortoise half the width of the tree
		Tortoise.move(treeWidth / 2);
		// 2. Change the tortoise so that it is pointing straight down
		Tortoise.turn(90);
		// 4. Set the pen width to the tree width divided by 10
		Tortoise.setPenWidth(treeWidth / 10);
		// 5. Change the color of the line the tortoise draws to brown
		Tortoise.setPenColor(Colors.Browns.DarkGoldenrod);
		// 3. Move the tortoise a quarter the current length
		Tortoise.move(treeWidth / 4);
	}

	void drawStar() {
		// * Optional: Draw a red star on top of the tree. Hint: 144 degrees
		// makes a star.
		for (int i = 0; i < 5; i++) {
			Tortoise.setSpeed(10);
			Tortoise.setPenColor(Colors.Yellows.Gold);
			Tortoise.move(80);
			Tortoise.turn(144);
		}
	}

	/* 2. When the mouse is clicked draw a tree at that position. */

	public void mouseClicked(MouseEvent mouseEvent) {
		System.out.println("mouse clicked!");
		playMusic("happyHolidaysdeep.wav");
		writeGreeting("Happy Holidays from the computer and Java coding.");
		int mouseX = mouseEvent.getX();
		int mouseY = mouseEvent.getY();
		// Set the X position of the Tortoise to the X position of the mouse
Tortoise.setX(mouseX);
Tortoise.setY(mouseY);
		drawTree();
	}

	/* 3. Personalize your card. */
	void drawGreetingAndSing() {
		// Download a Christmas sound (wav, midi or aiff) and use the
		// playMusic() method to play it

		// Use the writeGreeting() method to add a festive message

	}

	private void writeGreeting(String greeting) {
		tortoiseWindow.getGraphics().drawString(greeting, 250, 50);
	}

	private void playMusic(String soundFile) {
		AudioClip sound = JApplet.newAudioClip(getClass()
				.getResource(soundFile));
		sound.play();
	}

	void drawTree() {
		drawStar();
		drawTreeBody();
		drawTreeTrunk();
		treeWidth = 15;
		Tortoise.setAngle(0);
		Tortoise.setPenWidth(treeWidth / 5);
	}

	public static void main(String[] args) {
		new HolidayCard();
	}

	TurtlePanel tortoiseWindow;

	HolidayCard() {
		tortoiseWindow = Tortoise.getBackgroundWindow();
		tortoiseWindow.addMouseListener(this);

		Tortoise.show();
		Tortoise.setSpeed(10);
		drawGreetingAndSing();
	}
}
