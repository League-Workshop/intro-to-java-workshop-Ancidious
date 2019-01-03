package section2;

import org.jointheleague.graphical.robot.Robot;

public class FlammingStar {
	
public static void main(String[] args) {
	int baseSize = 300;
	int flameSize = 200;
	
	Robot r2d2 = new Robot("mini");
	r2d2.penDown();
	r2d2.setX(425);
	r2d2.setY(275);
	r2d2.setSpeed(100);
	r2d2.sparkle();
	
	for(int i = 0; i<25; i++) {
		r2d2.turn(45);

		r2d2.move(64);
		r2d2.turn(-40);
		r2d2.move(200);
		r2d2.turn(170);
		r2d2.move(200);
		r2d2.turn(64);
		r2d2.move(300);
		
		
	}
}
	
}
