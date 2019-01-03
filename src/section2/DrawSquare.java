package section2;

import org.jointheleague.graphical.robot.Robot;
import org.jointheleague.graphical.robot.RobotImage;

public class DrawSquare {
public static void main(String[] args) {
	Robot r2d2 = new Robot();
r2d2.setRandomPenColor();
r2d2.setSpeed(10);
r2d2.penDown();
for(int i = 0; i<3; i++) {
	r2d2.move(100);
	r2d2.turn(90);
	r2d2.setRandomPenColor();
}
r2d2.move(200);
r2d2.turn(90);
r2d2.move(100);
r2d2.turn(90);
r2d2.move(100);
for(int i = 0; i<3; i++) {
r2d2.turn(270);
r2d2.move(100);
r2d2.setRandomPenColor();
}
for(int i = 0; i<2; i++) {
	r2d2.turn(270);
	r2d2.move(200);
{
	for(int i = 0; i<2; i++) {
		r2d2.turn(270);
		r2d2.move(100);
	}
}
}
}