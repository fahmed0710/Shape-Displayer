/*
 * A class that defines an Icon in a specific shape
 * 
 * @author Fariha Ahmed
 * @version 1.0
 */

import java.awt.*;
import javax.swing.*;

public class ShapeIcon implements Icon{
	private CompositeShape cs;
	
	/*
	 * Constructs a shape icon for the given composite shape
	 * 
	 * @param cs a composite shape
	 */
	public ShapeIcon(CompositeShape cs) {
		this.cs = cs;
	}
	
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D)g;
		this.cs.draw(g2);
	}
	
	public int getIconWidth() {
		return this.cs.getSize();
	}

	public int getIconHeight() {
		return this.cs.getSize();
	}
}
