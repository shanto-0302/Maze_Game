package Maze;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class FixedDoor implements Door{
	private Point startPoint,endPoint;
public FixedDoor(Point startPoint,Point endPoint) {
	// TODO Auto-generated constructor stub
	this.startPoint=startPoint;
	this.endPoint=endPoint;
}
@Override
public void BuildShape(Graphics g) {
	// TODO Auto-generated method stub
	Graphics2D g3=(Graphics2D) g;
	g3.setColor(Color.red);
	g3.setStroke(new BasicStroke(5));
	g3.drawLine(startPoint.x,startPoint.y,endPoint.x,endPoint.y);
}
}
