import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class buttonPrep implements ActionListener{
	public static void main(String[] args) {
Random r = new Random();
int randNum = r.nextInt(1000);
		JButton num = new JButton("Random Number");
		JButton let = new JButton("Random Letter");
		JButton string = new JButton("My Own String");
num.addActionListener(this);
let.addActionListener(this);
string.addActionListener(this);

}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==num){
			System.out.println(randNum);
		}
		
	}
}