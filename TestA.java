/*******************************************************************************************************
 * Class Name: CSC 143
 * Name: Thao Truong
 * Program Name: Lab3
 * Description: create a project folder called Lab3 that contains a package named a truck that will
 * represent the locations to store classes associated with an abstract superclass.
 * Date Created: 4/12/2018
 * ***************************************************************************************************/
package atruck;
import java.awt.Color;
public class TestA {

	public static void main(String[] args) {
		//create a reference variable for an object of the DrawingWindow class called
		//display and set the DrawingWindow constructor to a width of 400 pixels
		//and height 300 pixels,
		DrawingWindow display = new DrawingWindow(400,300);
		display.setBackground(Color.WHITE); //set the display background color to WHITE
		
		AbstractTruck a; //create a reference variable for the AbstractTruck class called a
		
		//assign the object subclass BlueTruck to the reference a
		a = new BlueTruck(display.getGraphics());
		display.sleep();
		a.translate(25,25);
		display.sleep();
		a.resize(225,150,150);
		display.sleep();
		
		//assign the object subclass GreenTruck to the reference a
		a = new GreenTruck(display.getGraphics());
		a.translate(25,25);
		display.sleep();
		a.resize(225,150,150);
		display.sleep();
		
		
		//assign the object subclass RedTruck to the reference a
		a = new RedTruck(display.getGraphics());
		a.translate(25,25);
		display.sleep();
		a.resize(225,150,150);
		display.sleep();
	}

}
