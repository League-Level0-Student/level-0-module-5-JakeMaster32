package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot Ultron = new Robot();
int a = 144;
		//2. Set the speed to 100
Ultron.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "Choose a color", "Color Chooser", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Blue", "Green"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 0) {
			Ultron.setPenColor(255, 0, 0);
		}else if(colorChoice == 1) {
			Ultron.setPenColor(0, 0, 255);
		}else {
			Ultron.setPenColor(0, 255, 0);
		}
		//4. Ask the use how many polygons they want to be drawn.
	String x =	JOptionPane.showInputDialog("How many pentagons do you want to be drawn?");
		//5. Use the robot to draw the number of polygons the user requested.
		int y = Integer.parseInt(x);
		for(int z = 0; z < y; z++) {
		//6. Make it so your shapes do not overlap
		Ultron.penDown();
		Ultron.turn(72);
		Ultron.move(50);
		Ultron.turn(72);
		Ultron.move(50);
		Ultron.turn(72);
		Ultron.move(50);
		Ultron.turn(72);
		Ultron.move(50);
		Ultron.turn(72);
		Ultron.move(50);
		Ultron.penUp();
		Ultron.turn(72);
		Ultron.move(200);
		}
		//7. Challenge: add more colors to the Option Dialog.
	}
}

