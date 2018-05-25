/**************************************************************************************************
 * Class Name: CSC 143
 * Name: Thao Truong
 * Program Name: Lab3
 * Description: create a project folder called Lab3 that contains a package named a truck that will
represent the locations to store classes associated with an abstract superclass.
 * Date Created: 4/12/2018
 * ***********************************************************************************************/
package atruck;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class DrawingWindow {
	//set up data members
	private JFrame frame;
	private static int FRAME_WIDTH = 200;
	private static int FRAME_HEIGHT = 300;
	private static int FRAME_X_ORIGIN = 800;
	private static int FRAME_Y_ORIGIN = 100;
	
	// first constructor with no arguments
	public DrawingWindow() {
		frame= new JFrame();
		frame.setTitle("Drawing Window");
		frame.setSize( FRAME_WIDTH, FRAME_HEIGHT);
		frame.setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		frame.setVisible(true);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//overloaded constructors with arguments
	public DrawingWindow(int width, int height) {
		frame= new JFrame();
		frame.setTitle("Drawing Window");
		frame.setSize(width, height);
		frame.setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	//set background color for the contentpane
	public  void setBackground(Color c) {
		 frame.getContentPane().setBackground(c);
	}
	
	//return the graphics "pen" object
	public Graphics getGraphics() {
		Graphics g = frame.getContentPane().getGraphics();
		return g;
	}
	
	//delay the processing time 
	public void sleep() {
		try {Thread.sleep(500);}
		catch(Exception e) {};
	}
}

