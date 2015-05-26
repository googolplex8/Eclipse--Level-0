import javax.swing.JOptionPane;


public class voting {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog(null, "How old are you?");
	String who = JOptionPane.showInputDialog(null, "Who do you want to be the president?");
	int ageInt = Integer.parseInt(age);
	if(ageInt >= 18){
		JOptionPane.showMessageDialog(null, "Go vote for " + who + " ya street punk.");
	}
	else{
		JOptionPane.showMessageDialog(null, "No one cares about your opinion!");
	}
}
}
