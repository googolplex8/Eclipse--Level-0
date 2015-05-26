// Copyright Wintriss Technical Schools 2013
/****** MUST BE USED WITH JAVA 1.6 *****/

import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class FeedTheTortoise implements KeyEventDispatcher
{

	private void feedTheTortoise()
	{
		// 1. use the addFood() method to add food for the tortoise
	addFood(400, 200);
	}

private void goUp()
	{
		// 2. Print �going up�. Test it out by running your code and pressing the up key
	System.out.println("Going Up!");	
	// 3. Make the tortoise move up the screen
	
	Tortoise.move(5);
	}

	private void goDown()
	{
		// 4. make the tortoise move down the screen
		System.out.println("Going Down!");
	Tortoise.move(-5);
	}
	
	private void goLeft()
	{
		// 5. make the tortoise move left
		System.out.println("Going Left!");
		Tortoise.turn(-90);
		Tortoise.move(5);
		Tortoise.turn(90);
	}

	private void goRight()
	{
		// 6. make the tortoise move right
		System.out.println("Going Left!");
		Tortoise.turn(90);
		Tortoise.move(5);
		Tortoise.turn(-90);
	}

	private void checkIfFoodFound() throws Exception
	{
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();
		
		// 7. Print out the variables for tortoiseLocationX and tortoiseLocationY
//		System.out.println(tortoiseLocationX);
//		System.out.println(tortoiseLocationY);
		// 8. if tortoise is at same location as food
		int difX = tortoiseLocationX - 400;
		int difY = tortoiseLocationX - 200;
		System.out.println(difX);
		System.out.println(difY);
		if((difX < 5)  && (difY < 5)){
			System.out.println("Chomp!!!");	
			Runtime.getRuntime().exec("say chomp");
		}
	}
			// print "chomp"
			// say �chomp� with Runtime.getRuntime().exec(�say chomp�);
			// call the eatFood() method
		
	


private void eatFood() {
		component.setText("");
	}

	private void addFood(int x, int y)
	{
		component.setLocation(x, y);
		window.add(component);
	}

	TurtlePanel window = Tortoise.getBackgroundWindow();
Label component = new Label("*");

	public static void main(String[] args)
	{
		FeedTheTortoise feeder = new FeedTheTortoise();
		feeder.controlTheTortoise();
		feeder.feedTheTortoise();
	}

	private void controlTheTortoise() 
{
KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e)
	{
		if (e.getID() == KeyEvent.KEY_PRESSED)
		{
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				 goDown();
			try {
			checkIfFoodFound();
			} catch (Exception exception) {}
		}
		return false;
	}

}

