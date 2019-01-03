package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class CrazyPentagon {
	
	private void makePrettyThings() {
		Robot r2d2 = new Robot("batman");
		r2d2.penDown();
		r2d2.setSpeed(100);
		r2d2.setPenColor(new Color(0x620B0B));
		int sides = 5;
		int angle = 360/sides;
		for (int i = 0; i < 200; i++) {
			r2d2.move(i);
			r2d2.turn(angle);
		}
		}
	public static void main(String[] args) {
		new CrazyPentagon().makePrettyThings();
	}
}