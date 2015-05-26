import java.net.URI;

import javax.swing.JOptionPane;

public class soundtrackToLife {

	public static void main(String[] args) {

		String mood = JOptionPane
				.showInputDialog("What is your mood? (I don't really care)");

		if (mood.equals("happy")) {
			playVideo("https://www.youtube.com/watch?v=71hqRT9U0wg");
		}

		else if (mood.equals("sad")) {
			playVideo("https://www.youtube.com/watch?v=k-ARuoSFflc");
		} else if (mood.equals("angry")) {
			playVideo("https://www.youtube.com/watch?v=v4EFddbHkRo");
		} else if (mood.equals("scared")) {
			playVideo("https://www.youtube.com/watch?v=kLFW2t3JDzY");
		} else if (mood.equals("excited")) {
			playVideo("https://www.youtube.com/watch?v=StTqXEQ2l-Y");
		}
	 else if (mood.equals("evil")) {
		playVideo("https://www.youtube.com/watch?v=vH7ui4ABDP0");
	}
		// If you are seeing ads at the beginning of your videos, install
		// Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
