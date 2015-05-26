import javax.swing.JOptionPane;

public class height {
	public static void main(String[] args) {
		String Jimmy = JOptionPane.showInputDialog("How tall is Jimmy?");
		String you = JOptionPane.showInputDialog("How tall are you?");
		String growJ = JOptionPane
				.showInputDialog("How much is Jimmy going to grow in the next 10 years?");
		String growY = JOptionPane
				.showInputDialog("How much are you going to grow in the next 10 years?");
		int JimmyInt = Integer.parseInt(Jimmy);
		int youInt = Integer.parseInt(you);
		int growJInt = Integer.parseInt(growJ);
		int growYInt = Integer.parseInt(growY);
		JimmyInt += growJInt;
		youInt += growYInt;

		if (JimmyInt > youInt) {
			JOptionPane.showMessageDialog(null, "Jimmy is taller ya punk!");
		}

		else if (youInt > JimmyInt) {
			JOptionPane.showMessageDialog(null, "You are taller then Jimmy!");
		} else {
			JOptionPane.showMessageDialog(null, "You are equal heights!");
		}
	}
}
