/*
 * A class that defines an illuminati shape
 * 
 * @author Fariha Ahmed
 * @version 1.0
 */

import java.awt.*;
import java.awt.geom.*;

public class IlluminatiShape implements CompositeShape {
	private int x,y,width;
	
	public IlluminatiShape(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}
	
	public void draw(Graphics2D g2) {
		Point2D.Double tip = new Point2D.Double(x + width / 2, y);
		Point2D.Double b1 = new Point2D.Double(x,y + width);
		Point2D.Double b2 = new Point2D.Double(x + width, y + width);
		
		Line2D.Double l1 = new Line2D.Double(tip,b1);
		Line2D.Double l2 = new Line2D.Double(tip,b2);
		Line2D.Double l3 = new Line2D.Double(b1,b2);
		
		Ellipse2D.Double eye = new Ellipse2D.Double((l1.getX1() + l1.getX2()) / 2, y + width / 3, width / 2, width / 3);
		Ellipse2D.Double pupil = new Ellipse2D.Double(eye.getCenterX() - 3.5, eye.getCenterY() - 3.5, width / 4, width / 4);		
		
		g2.draw(l1);
		g2.draw(l2);
		g2.draw(l3);
		g2.draw(eye);
		g2.fill(pupil);
		g2.draw(pupil);

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