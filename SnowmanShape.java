/*
 * A class that defines a snowman shape
 * 
 * @author Fariha Ahmed
 * @version 1.0
 */

import java.awt.*;
import java.awt.geom.*;

public class SnowmanShape implements CompositeShape {
	private int x,y,width;
	
	/*
	 * Constructs a snowman item
	 * 
	 * @param x the left of the bounding rectangle
	 * @param y the top of the bounding rectangle
	 * @param width the width of the bounding rectangle
	 */
	public SnowmanShape(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}
	
	public void draw(Graphics2D g2) {
		Ellipse2D.Double head = new Ellipse2D.Double(x,y,width,width);
		Ellipse2D.Double body = new Ellipse2D.Double(x,y+width,width,width);
		
		g2.draw(head);
		g2.draw(body);
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int getSize() {
		return this.width;
	}
}