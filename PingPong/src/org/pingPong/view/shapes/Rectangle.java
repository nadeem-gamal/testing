package org.pingPong.view.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	private int x = 0;
	private int y = 0;
	private int width = 25;
	private int height = 100;
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Color color = g.getColor();
		g.setColor(Color.BLACK);
	
//		g.drawRect(x, y, width, height);
		g.fillRect(x, y, width, height);
		g.setColor(color);
	}

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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
