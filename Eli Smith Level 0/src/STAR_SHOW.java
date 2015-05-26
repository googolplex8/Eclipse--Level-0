import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class STAR_SHOW {

	public static void main(String[] args) {
		
		int x = 30;
		Tortoise.setX(50);
		Tortoise.setY(700);
		for (int i = 0; i < 21; i += 1) {
			Tortoise.setPenColor(Colors.getRandomColor());
			x += 100;
			drawstar();
			Tortoise.setX(x);
			Tortoise.setY(700);
		}
		int y = 30;
		Tortoise.setX(700);
		Tortoise.setY(50);
		for (int i = 0; i < 21; i += 1) {
			y += 100;
			drawstar();
			Tortoise.setX(700);
			Tortoise.setY(y);
		}
	}

	public static void drawstar() {

		Tortoise.show();
		Tortoise.setSpeed(10);

		for (int i = 0; i < 4; i++) {
			Tortoise.move(100);
			Tortoise.turn(144);
			Tortoise.move(100);
		}

	}
}