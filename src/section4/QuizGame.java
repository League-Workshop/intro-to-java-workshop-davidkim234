package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String answer1 = JOptionPane.showInputDialog("Who is the best men's volleyball player in the world?");
		// 3. Use an if statement to check if their answer is correct
		if (answer1.equals("Max Holt")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is Max Holt");
		}
		String answer2 = JOptionPane.showInputDialog("Who is the best basketball player in the world?");
		if (answer2.equals("Kawhi Leonard")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The Answer is Kawhi Leonard");
		}
		String answer3 = JOptionPane.showInputDialog("Which team is the best in the NFL?");
		if (answer3.equals("Eagles")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is the Eagles");
		}
		String answer4 = JOptionPane.showInputDialog("Which team is the best in the NBA?");
		if (answer4.equals("Lakers")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is the Lakers");
		}
		String answer5 = JOptionPane.showInputDialog("What do people call Steph Curry and Klay Thompson?");
		if (answer5.equals("Splash Bros")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is Splash Bros");
		}
String answer6 = JOptionPane.showInputDialog("Which team will win the national championship in college basketball next year?");
if (answer6.equals("San Diego State")) {
	score++;
	JOptionPane.showMessageDialog(null, "Correct");
} else {
	JOptionPane.showMessageDialog(null, "Wrong! The answer is San Diego State");
}
	String answer7=JOptionPane.showInputDialog("Which High School is the best in San Diego?");
	if (answer7.equals("Westview High School")) {
		score++;
		JOptionPane.showMessageDialog(null, "Correct");
	} else {
		JOptionPane.showMessageDialog(null, "Wrong! The answer is Westview High School");
	}
	String answer8=JOptionPane.showInputDialog("Who is the best Avenger?");
	if (answer8.equals("Thor")) {
	score++;
		JOptionPane.showMessageDialog(null, "Correct");
	} else {
		JOptionPane.showMessageDialog(null, "Wrong. The answer is Thor");
}
		// 4. if the user's answer is correct

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		// 6. After all the questions have been asked, print the user's score
		System.out.println(score);
	}
}
