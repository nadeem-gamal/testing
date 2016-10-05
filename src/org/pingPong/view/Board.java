package org.pingPong.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import org.pingPong.enums.Key;
import org.pingPong.view.shapes.Circle;
import org.pingPong.view.shapes.Rectangle;

@SuppressWarnings("serial")
public class Board extends JPanel {

	private Circle ball;
	private Rectangle leftHandler;
	private Rectangle rightHandler;

	private static final int handlerMovementStep = 10;

	private int ballAngle = 45;
	
	public Board() {
		super();
		setBackground(Color.GREEN);

		ball = new Circle();
		ball.setX(375);
		ball.setY(175);
		leftHandler = new Rectangle();
		leftHandler.setX(0);
		leftHandler.setY(150);
		rightHandler = new Rectangle();
		rightHandler.setX(750);
		rightHandler.setY(150);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		ball.draw(g);
		leftHandler.draw(g);
		rightHandler.draw(g);
	}

	public void keyPressed(Key key) {
		if (key == Key.UP) {
			int newY = rightHandler.getY() - handlerMovementStep;
			if (newY >= 0) {
				rightHandler.setY(newY);
			}
		} else if (key == Key.DOWN) {
			int newY = rightHandler.getY() + handlerMovementStep;
			if (newY <= 270) {
				rightHandler.setY(newY);
			}
		} else if (key == Key.W) {
			int newY = leftHandler.getY() - handlerMovementStep;
			if (newY >= 0) {
				leftHandler.setY(newY);
			}
		} else if (key == Key.S) {
			int newY = leftHandler.getY() + handlerMovementStep;
			if (newY <= 270) {
				leftHandler.setY(newY);
			}
		}else if (key == Key.SPACE) {
			
		}
		
		updateUI();
	}
}
