import javax.swing.JOptionPane;

public class areYouHappy {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Are you happy?");

		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null,
					"Keep doing what ever you are doing.");
		}
		if (answer.equals("no")) {
			String answer2 = JOptionPane
					.showInputDialog("Do you want to be happy?");
			if (answer2.equals("no")) {
				System.out.println("Keep doing what ever you are doing.");
			}
			if (answer2.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something!");
			}
		}
	}
}
