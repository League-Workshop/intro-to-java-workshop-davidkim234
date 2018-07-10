package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot plankton = new Robot();
		// 5. Set your robot's pen down
		plankton.penDown();
		// 3. Set the robot to go at max speed (100)
		plankton.setSpeed(300);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; i < 200; i++) {
			// 7. Change the pen color to random
			plankton.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
			plankton.move(2 * i);
			// 2. Turn the robot 360/7 degrees to the right
			plankton.turn(360 / 7);
			// 8. Set the pen width to i
			plankton.setPenWidth(i);
		}
	}
}