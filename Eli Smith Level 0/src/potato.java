import javax.swing.JOptionPane;

public class potato {
	public static void main(String[] args) {
		for (int i = 1; i < 8; i++) {

			if (i == 4) {
				JOptionPane.showMessageDialog(null, i);
			} else if (i == 7) {
				JOptionPane.showMessageDialog(null, i + " potato");
			} else {
				JOptionPane.showMessageDialog(null, i + " potato");
			}
		}
		JOptionPane.showMessageDialog(null, "more!!!");
	}

}
