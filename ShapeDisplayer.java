/*
 * Allows user to display different shapes by clicking different buttons
 *
 * @author Fariha Ahmed
 * @version 1.0
 */

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

public class ShapeDisplayer {
	private CompositeShape shape;
	private JButton carButton, snowmanButton, illuminatiButton;
	private int x,y;
	
	public ShapeDisplayer() {
		JFrame f = new JFrame();
		JPanel buttonsPanel = new JPanel();
		
		carButton = new JButton();
		ShapeIcon carIcon = new ShapeIcon(new CarShape(8,20,35));
		carButton.setIcon(carIcon);
		carButton.setPreferredSize(new Dimension(50,50));
		carButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				shape = new CarShape(x,y,35);
				carButton.setBorder(new LineBorder(Color.RED));
				snowmanButton.setBorder(new LineBorder(Color.BLUE));
				illuminatiButton.setBorder(new LineBorder(Color.BLUE));
			}
		});
		
		snowmanButton = new JButton();
		ShapeIcon snowmanIcon = new ShapeIcon(new SnowmanShape(17,10,15));
		snowmanButton.setIcon(snowmanIcon);
		snowmanButton.setPreferredSize(new Dimension(50,50));
		snowmanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				shape = new SnowmanShape(x,y,15);
				snowmanButton.setBorder(new LineBorder(Color.RED));
				carButton.setBorder(new LineBorder(Color.BLUE));
				illuminatiButton.setBorder(new LineBorder(Color.BLUE));
			}
		});
		
		illuminatiButton = new JButton();
		ShapeIcon illuminatiIcon = new ShapeIcon(new IlluminatiShape(10,10,30));
		illuminatiButton.setIcon(illuminatiIcon);
		illuminatiButton.setPreferredSize(new Dimension(50,50));
		illuminatiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shape = new IlluminatiShape(x,y,30);
				illuminatiButton.setBorder(new LineBorder(Color.RED));
				carButton.setBorder(new LineBorder(Color.BLUE));
				snowmanButton.setBorder(new LineBorder(Color.BLUE));
			}
		});
		
		f.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				
			}

			public void mousePressed(MouseEvent e) {
				shape.setX(e.getX());
				shape.setY(e.getY());
				Graphics2D g2 = (Graphics2D)f.getGraphics();
				shape.draw(g2);
			}

			public void mouseReleased(MouseEvent e) {
				
			}

			public void mouseEntered(MouseEvent e) {
				
			}

			public void mouseExited(MouseEvent e) {
				
			}
		});

		buttonsPanel.add(carButton, FlowLayout.LEFT);
		buttonsPanel.add(snowmanButton, FlowLayout.CENTER);
		buttonsPanel.add(illuminatiButton, FlowLayout.RIGHT);
		f.add(buttonsPanel,BorderLayout.NORTH);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ShapeDisplayer();
	}
}
