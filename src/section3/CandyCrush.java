package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String name = JOptionPane.showInputDialog("Hey there!!! What's your name? :D");
String crush = JOptionPane.showInputDialog("Hey " + name + ", Who was it that you liked again?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You have a crush on "+ crush + "?" + " LIES! You totally have a crush on Java!");
		// 3. Ask the user for the name of their best friend
		String bestfriend = JOptionPane.showInputDialog("BTW, who was your best friend again, " + name + "?");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showConfirmDialog(null, "OOHHHH, " + bestfriend + " is the SWEETEST person! Don't you think so too?");
	} 
}



