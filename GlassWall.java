package Maze;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class GlassWall implements Wall{
private Point startPoint,endPoint;
Door door=new NoDoor();

public GlassWall(Point startPoint,Point endPoint) {
	// TODO Auto-generated constructor stub
	this.startPoint=startPoint;
	this.endPoint=endPoint;
}


public void DrawWall(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
	door.BuildShape(g);
}

@Override
public void setDoor(Door d) {
	// TODO Auto-generated method stub
	this.door=d;
}
}
