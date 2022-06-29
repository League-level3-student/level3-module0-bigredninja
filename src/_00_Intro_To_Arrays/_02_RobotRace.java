package _00_Intro_To_Arrays;

import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		Random rnd = new Random();
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[rnd.nextInt(8) + 2];
		
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i< robots.length; i++) {
			robots[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		int x = 750/robots.length;
		int y = 550;
		for (Robot robot : robots) {
			robot.setX(x);
			robot.setY(y);
			x += 750/robots.length;
			robot.setSpeed(10);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean done = false;
		int winner = -1;
		while (!done) {
			for (int i = 0; i< robots.length; i++) {
				robots[i].move(rnd.nextInt(50));
				if (robots[i].getY() < 50) {
					done = true;
					winner = i + 1;
					break;
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		
		// 7. declare that robot the winner and throw it a party!
		System.out.println("congradulations robot number: " + winner + "!!!");
		// 8. try different races with different amounts of robots.
		
		// 9. make the robots race around a circular track.
	}
}
