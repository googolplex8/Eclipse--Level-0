import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;

public class valedation {
	public static void main(String[] args) throws InterruptedException,
			IOException {
		for (int i = 0; i < 100; i++) {

		int randomNumber = new Random().nextInt(6);
		System.out.println(randomNumber);
		
			if (randomNumber == 0) {
				Runtime.getRuntime().exec("say You are OK ").waitFor();
			}
			if (randomNumber == 1) {
				Runtime.getRuntime().exec("say You are really OK ").waitFor();
			}
			if (randomNumber == 3) {
				Runtime.getRuntime().exec("say You are super OK ").waitFor();
			}
			if (randomNumber == 4) {
				Runtime.getRuntime().exec("say You are the most OK ").waitFor();
			}
			if (randomNumber == 5) {
				Runtime.getRuntime().exec("say You are not OK ").waitFor();
			}
		}
	}
}
// 0-4