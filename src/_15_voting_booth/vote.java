package _15_voting_booth;

import javax.swing.JOptionPane;

public class vote {
	public static void main(String[] args) {
		String personAge = JOptionPane.showInputDialog("What is your age.");
		int age = Integer.parseInt(personAge);
		if (age > 18) {
			JOptionPane.showInputDialog("Who do you think the next president should be.");
		} else {
			JOptionPane.showMessageDialog(null, "No one cares what you think.");
		}
	}
}
