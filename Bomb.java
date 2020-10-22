package Maze;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Bomb {
	private Point startPoint,endPoint;
	public Bomb(Point startPoint,Point endPoint) {
		// TODO Auto-generated constructor stub
		this.startPoint=startPoint;
		this.endPoint=endPoint;
	}
	
	public void BuildShape(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2=(Graphics2D) g;
		g2.setColor(Color.black);
		g2.fillOval(startPoint.x,startPoint.y,endPoint.x,endPoint.y);
	}
}
