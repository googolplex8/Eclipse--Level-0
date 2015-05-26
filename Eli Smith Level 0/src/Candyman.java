import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Candyman implements ActionListener {

	JButton Candyman = new JButton("Candyman");
	JFrame main = new JFrame();
	int timesClicked = 0;

	private void run() {

		main.add(Candyman);
		main.setVisible(true);
		main.setSize(200, 200);
		Candyman.addActionListener(this);
	}

	public static void main(String[] args) {
		Candyman one = new Candyman();
		one.run();
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		timesClicked += 1;
		System.out.println("You Clicked Me");
		if (timesClicked >= 5) {
			showPictureFromTheInternet("http://292fc373eb1b8428f75b-7f75e5eb51943043279413a54aaa858a.r38.cf3.rackcdn.com/f56f06255c5a6ee239b1d596fba1634a-1066995997-1300495775-4d83fd9f-620x348.jpg");
			playSound("nooo.wav");
		}

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
