package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String answer1 = JOptionPane.showInputDialog("Who is the best men's volleyball player in the world?");
		// 3. Use an if statement to check if their answer is correct
		if (answer1.equals("Matt Anderson")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is Matt Anderson");
		}
		String answer2 = JOptionPane.showInputDialog("Who is the best basketball player in the world?");
		if (answer2.equals("Lebron James")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The Answer is Lebron James");
		}
		String answer3 = JOptionPane.showInputDialog("Which team is the best in the NFL?");
		if (answer3.equals("Chargers")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is the Chargers");
		}
		String answer4 = JOptionPane.showInputDialog("Which team is the best in the NBA?");
		if (answer4.equals("Clippers")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is the Clippers");
		}
		String answer5 = JOptionPane.showInputDialog("What do people call Kevin Durant after he joined the warriors?");
		if (answer5.equals("A snake")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is A snake");
		}

		// 4. if the user's answer is correct

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		// 6. After all the questions have been asked, print the user's score
		System.out.println(score);
	}
}
