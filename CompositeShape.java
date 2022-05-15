/*
 * An interface that defines a composite shape
 * 
 * @author Fariha Ahmed
 * @version 1.0
 */

import java.awt.*;

public interface CompositeShape {
	/*
	 * Draws the shape
	 * @param g2 a Graphics 2D context
	 */
	public void draw(Graphics2D g2);
	
	/*
	 * Sets the shape's x-coordinate
	 * 
	 * @param x the new x-coordinate of the shape
	 */
	public void setX(int x);
	
	/*
	 * Sets the shape's y-coordinate
	 * 
	 * @param y the new y-coordinate of the shape
	 */
	public void setY(int y);
	
	/*
	 * Returns the x-coordinate of the shape
	 * 
	 * @return the shape's x-coordinate
	 */
	public int getX();
	
	/*
	 * Returns the y-coordinate of the shape
	 * 
	 * @return the shape's y-coordinate
	 */
	public int getY();
	
	/*
	 * Returns the shape's size
	 * 
	 * @return the shape's size
	 */
	public int getSize();
	
	
}
