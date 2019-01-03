package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
int answer = JOptionPane.showConfirmDialog(null, "Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
System.out.println(answer);
		// 3. Otherwise, wish them good luck washing dishes.
if(answer == 0) {
	JOptionPane.showMessageDialog(null, "noiiiiiice");
}
if(answer == 1) {
	JOptionPane.showMessageDialog(null, "Well then you should learn.");
	}
if(answer == 2) {
		int answer2 = JOptionPane.showConfirmDialog(null, "You think you're funny hitting that cancel button?");
if(answer2 == 2) {
		int answer3 = JOptionPane.showConfirmDialog(null, "So we're gonna do this now, huh?");
}
}
}
}

