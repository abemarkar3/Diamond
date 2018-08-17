import java.util.Scanner;

import kareltherobot.Directions;
import kareltherobot.Robot;
import kareltherobot.World;


public class MakeADiamond  implements Directions{
	Robot bobbie = new Robot(1,5,North,300);
	String upOrDown;
	
	public static void main(String[] args) {
		MakeADiamond mad = new MakeADiamond();
		
		mad.prompt();
	}

	private void prompt() {
		// Ask the user for the diamond size
		//System.out.println("Hey dude, I see you want to make a diamond.  Give me the deets: ");
		Scanner keyboard  = new Scanner(System.in);
		//int beepersOnSide = keyboard.nextInt();
		//System.out.println(beepersOnSide);
		World.setVisible(true);
		World.setDelay(1);
//		World.setDelay(100);
	
//		System.out.println("Which direction?  Up or down");
//		 upOrDown = keyboard.nextLine();
////		if(upOrDown .equalsIgnoreCase("up") ){
////			System.out.println("You picked up!! ");
////		}
////		else {
////			System.out.println("You picked down!");
////		}
//		System.out.println("Your pick was: "+upOrDown);
		

		drawDiamond(4);
		reset();
		drawDiamond(3);
		reset();
		drawDiamond(2);
		reset();
		drawDiamond(2);
		reset();
		bobbie.putBeeper();
		bobbie.move();
		bobbie.putBeeper();
	}
	
	private void turnRight() {
		bobbie.turnLeft();
		bobbie.turnLeft();
		bobbie.turnLeft();
	}
	
	private void reset() {
		bobbie.turnLeft();
		bobbie.move();
	}

	private void drawDiamond(int beepersOnSide) {
		int hello = 0;
		// make the robot street 1, middle of diamond (corner)
		while(hello != beepersOnSide) {
			bobbie.putBeeper();
			bobbie.move();
			turnRight();
			bobbie.move();
			bobbie.turnLeft();
			hello += 1;
		}
		int yellow = 0;
		// make the robot street 1, middle of diamond (corner)
		while(yellow != beepersOnSide) {
			bobbie.putBeeper();
			bobbie.move();
			bobbie.turnLeft();
			bobbie.move();
			turnRight();
			yellow += 1;
		}
		bobbie.putBeeper();
		bobbie.turnLeft();
		
		hello = 0;
		// make the robot street 1, middle of diamond (corner)
		while(hello != beepersOnSide) {
			bobbie.putBeeper();
			bobbie.move();
			bobbie.turnLeft();
			bobbie.move();
			turnRight();
			hello += 1;
		}
		bobbie.putBeeper();
		bobbie.turnLeft();
		bobbie.turnLeft();
		hello = 0;
		
		while(hello != beepersOnSide) {
			bobbie.putBeeper();
			bobbie.move();
			turnRight();
			bobbie.move();
			bobbie.turnLeft();
			hello += 1;
		}
		
	}

	private void drawSide(Robot r, int beepersOnSide) {
		
	}

}
