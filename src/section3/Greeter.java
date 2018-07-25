package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Please type your name");
	JOptionPane.showMessageDialog(null, "Good morning, "+ answer);
}
}
