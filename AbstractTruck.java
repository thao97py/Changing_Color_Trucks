/****************************************************************************************************
 * Class Name: CSC 143
 * Name: Thao Truong
 * Program Name: Lab3
 * Description: create a project folder called Lab3 that contains a package named a truck that will
represent the locations to store classes associated with an abstract superclass.
 * Date Created: 4/12/2018
 * *************************************************************************************************/
package atruck;
import java.awt.Graphics;
public abstract class AbstractTruck {
	//data member is a graphics object
	protected Graphics g;
	public AbstractTruck (){
		System.out.println(" Abstract class is activated");
	}
	//abstract method is passed two integers x, and y that represents a Graphics object that is translated on a drawing 
	//surface to the location represented by the x and y positions passed.
	public abstract void translate(int x, int y) ;
	
	
	//abstract method  passed three integers x, y and size that represents a Graphics object that is
	//translated on a drawing surface to the location represented by the x and y positions passed and resized to the size passed.
	public abstract void resize (int x, int y, int size);
	
}
