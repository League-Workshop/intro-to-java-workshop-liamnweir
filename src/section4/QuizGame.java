package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int Score = 0;
		// 2. Ask the user a question
		String answer = JOptionPane.showInputDialog("Guess this farm animal: has a snout and rolls aroundd in the mud");
		// 3. Use an if statement to check if their answer is correct
		if (answer.equalsIgnoreCase("Pig")) {
			JOptionPane.showInputDialog("You got it right! You earned 1 point");
		}

		else {
			JOptionPane.showInputDialog("Wrong! Better luck next question!");
		}
		// 4. if the user's answer is correct

		// -- add one to their score
		Score = Score + 1;

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String goat = JOptionPane
				.showInputDialog("Guess this farm animal: makes milk and some are hairy, some are shaved");

		if (goat.equalsIgnoreCase("Goat")) {
			JOptionPane.showInputDialog("You got it right! You earned 1 point");

		}

		else {
			JOptionPane.showInputDialog("Wrong! Better luck next question!");

			// 6. After all the questions have been asked, print the user's score

		}

		String Horse = JOptionPane.showInputDialog("Guess this farm animal: they are known to ride on and their home is full of hay!");

		if (Horse.equalsIgnoreCase("Horse")) {
			JOptionPane.showInputDialog("You got it right! You earned 1 point");

		}

		else {
			JOptionPane.showInputDialog("Wrong! Better luck next question!");
		
		}
	}
}




	
