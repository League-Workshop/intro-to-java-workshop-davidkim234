package section3;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		JOptionPane.showInputDialog("How are you?");
		String name = JOptionPane.showInputDialog("What is your name? ");
		System.out.println("Hi" + name + "how are you?");
		JOptionPane.showMessageDialog(null, "your name is " + name + " and you are good ");
		String hobby = JOptionPane.showInputDialog("What is your favorite hobby? ");
		String fish = JOptionPane.showInputDialog("What is your biggest fish? ");
		System.out.println("Your biggest fish is" + fish + "  how did you catch it? ");
		JOptionPane.showMessageDialog(null, "you like to go " + hobby + " and you caught a " + fish);
	}

	private static void showInputDialog(String string) {
		// TODO Auto-generated method stub

	}
}
