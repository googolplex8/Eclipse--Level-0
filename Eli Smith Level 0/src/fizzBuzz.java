
public class fizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {

			if ((i % 5 == 0) && (i % 3 == 0)) {
				System.out.println("fizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}

		}

	}
}
