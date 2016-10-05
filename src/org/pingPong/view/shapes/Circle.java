package org.pingPong.view.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

	private int x = 400;
	private int y = 200;
	private int radius = 50;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub

		Color color = g.getColor();
		g.setColor(Color.WHITE);
		g.fillArc(x, y, radius, radius, 0, 360);
		g.setColor(color);
	}

}
