import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variable in this recipe. 
 * 2. ask students what Tortoise commands they think they will use to make picture in the laminated hand-outs. */


public class flamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms

		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		Tortoise.setX(900);
		Tortoise.setY(400);
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 1. Show the Tortoise
Tortoise.show();
		// 12. Set the tortoise speed to 10
Tortoise.setSpeed(10);
		// 13. Make all the code below repeat 25 times
for (int i = 0; i < 700; i++) {
	// 2. Turn the tortoise 1/8 of a circle
			Tortoise.turn(360/8); 
				// 3. Move the tortoise 64 pixels

				Tortoise.move(64);
				// 4. Turn the tortoise 40 degrees to the LEFT. (Negative numbers will turn the tortoise counter-clockwise.)
				Tortoise.turn(-4);
				// 5. Move the tortoise the distance in the variable flameSize
				Tortoise.setPenColor(Color.ORANGE);
				Tortoise.move(flameSize);
				// 6. Turn the tortoise 170 degrees
				Tortoise.turn(150);
				// 7. Move the tortoise the distance in the variable flameSize (again)
				Tortoise.setPenColor(Color.BLUE);
				Tortoise.move(flameSize);
				// 8. Turn the tortoise 64 degrees to the right
				Tortoise.setPenColor(Color.magenta);
				Tortoise.turn(100);
				// 9. Move the tortoise the distance in the variable baseSize
				Tortoise.move(baseSize);
				// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
				// 11. Color your ninja star like Figure 2.
}
			
		
	}

}

