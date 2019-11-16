package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
String winner = "";
for (int i = 0; i < 5; i++) {
	int x = new Random().nextInt(10);
	winner = winner + x + " ";
}
JOptionPane.showMessageDialog(null, winner);
}
}
