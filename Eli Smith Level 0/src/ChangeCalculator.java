// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {


String nickels = JOptionPane.showInputDialog("How many nickels do you have?");

int nickelsAsInt = Integer.parseInt(nickels);

String dimes = JOptionPane.showInputDialog("How many dimes do you have?");


int dimesAsInt = Integer.parseInt(dimes);

String quarters = JOptionPane.showInputDialog("How many quarters do you have?");

int quartersAsInt = Integer.parseInt(quarters);

String pennies = JOptionPane.showInputDialog("How many pennies do you have?");

int penniesAsInt = Integer.parseInt(nickels);
		// Calculate how much money the user has and save it in a double variable 
double money = (nickelsAsInt*.05 + dimesAsInt*.10 + quartersAsInt*.25 + penniesAsInt*.01);
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "$" + money + " YOUR WELCOME!!!");
	}
}
