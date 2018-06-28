package extra;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	static Robot rob = null;
	
	public static void main(String[] args) {
	
		rob = new Robot();
		rob.moveTo(30,500);
		rob.hide();
		rob.setSpeed(100);
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			drawHouse(rand.nextInt(150)+ 50);
			
		}
		
	}
	
	public static void drawHouse(int height) {
		
		rob.setRandomPenColor();
		rob.setAngle(0);
		rob.penDown();
		rob.move(height);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(0, 150, 0);
		rob.move(30);
		
	}
}
