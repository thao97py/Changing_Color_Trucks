/****************************************************************************************************
 * Class Name: CSC 143
 * Name: Thao Truong
 * Program Name: Lab3
 * Description: create a project folder called Lab3 that contains a package named a truck that will
represent the locations to store classes associated with an abstract superclass.
 * Date Created: 4/12/2018
 * ************************************************************************************************/
package atruck;
import java.awt.Color;
import java.awt.Graphics;

public class RedTruck extends AbstractTruck {
	public RedTruck (Graphics graphic) {
		System.out.println("Red Truck is activated");
		super.g = graphic;//call its graphic object of the parent class
	}
	
	//override the translate abstract method declared in its parent class
	//modifying the implementation code for a Graphics object that we used in PLAB-01A
	public void translate ( int x, int y) {
		g.setColor(Color.RED);
		g.fillRect(x, y, 100, 50);
		
		g.setColor(Color.BLACK);
		g.fillOval(x+10, y+40, 20, 20);
		g.fillOval(x+70, y+40, 20, 20);
		
		g.setColor(Color.GRAY);
		g.fillRect(x+70,y+10,30,20);
	}
	
	//override the translate abstract method declared in its parent class
	//modifying the implementation code for a Graphics object that we used in PLAB-01A
	public void resize ( int x, int y, int size) {
		g.setColor(Color.RED);
		g.fillRect(x, y, size, size/2);
		
		g.setColor(Color.BLACK);
		g.fillOval(x +size/10, y + 2*size/5, size/5, size/5);
		g.fillOval(x +7 * size/10, y +2 * size/5, size/5, size/5);
		
		g.setColor(Color.GRAY);
		g.fillRect(x + 7 * size/10, y + 3*size/10 , 3 * size/10, size/5);
	}
}
