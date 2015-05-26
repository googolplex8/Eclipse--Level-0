import java.io.IOException;

import javax.swing.JOptionPane;

public class karyokee {
	public static void main(String[] args) throws InterruptedException,
			IOException {

		for (int i = 0; i < 10; i++) {

			for (int h = 0; h < 4; h++) {
				for (int r = 0; r < 10; r++) {
					Runtime.getRuntime().exec("say badger ").waitFor();
				}
				if (h == 3) {

					for (int e = 0; e < 2; e++) {
						Runtime.getRuntime().exec("say snake ").waitFor();
					}
				} else {
					for (int k = 0; k < 2; k++) {
						Runtime.getRuntime().exec("say mushroom ").waitFor();
					}
				}
			}

		}

	}
}