package raszz;
import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * RamonOlive - a robot by Ramon
 */
public class RamonOlive extends Robot
{
	/**
	 * run: RamonOlive's default behavior
	 */
	public void run() {
	

		setColors(Color.orange,Color.black,Color.red); // body,gun,radar

	
		while(true) {
		
			ahead(20);
			turnGunRight(35);
			back(10);
			turnGunLeft(60);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		
		fire(10);
		fire(10);
		fire(10);
	


	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		turnGunRight(15);
		back(30);
		fire(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
	
		back(30);
	}	
}
