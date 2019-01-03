package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		int userscore;
		userscore = 0 ;
		String answer1 = JOptionPane.showInputDialog("How old am I?");
		if(answer1.equals("16")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			userscore = userscore + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong! It's 16.");
		}
		String answer2 = JOptionPane.showInputDialog("How tall am I?");
		if(answer2.equals("5'11")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			userscore = userscore + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong! I'm 5'11.");
		}
		String answer3 = JOptionPane.showInputDialog("Where do I live?");
		if(answer3.equals("Home")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			userscore = userscore + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong! It's Home.");
		}
		JOptionPane.showMessageDialog(null, "Congratulations on finishing the quiz! The score you got was " + userscore + "/3.");
		if(userscore == 3) {
			JOptionPane.showMessageDialog(null, "Congraulations on the 100 percent!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Better luck Next time!");
		}
	}
}