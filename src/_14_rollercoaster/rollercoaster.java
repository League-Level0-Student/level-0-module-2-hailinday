package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	String personHeight = JOptionPane.showInputDialog("What is your height in inches");
	int height = Integer.parseInt(personHeight);
	if (height > 48) {
		JOptionPane.showMessageDialog(null, "You can go on the ride.");
	} else {
		JOptionPane.showMessageDialog(null, "You need to grow more first.");
	}
}	
}

