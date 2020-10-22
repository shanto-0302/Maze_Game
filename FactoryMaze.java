package Maze;

import java.awt.Point;

public class FactoryMaze implements IFactory{

	private Point wallstartPoint,wallendPoint,doorStartPoint,doorEndPoint,
	startPointBomb,endPointBomb;

	@Override
	public Wall CreateWall() {
		// TODO Auto-generated method stub		
		return new GlassWall(new Point(wallstartPoint),new Point(wallendPoint));
	}

	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new FixedDoor(new Point(doorStartPoint),new Point(doorEndPoint));
	}

	@Override
	public void setElement(Point wallstartPoint, Point wallendPoint,
			Point doorStartPoint, Point doorEndPoint) {
		// TODO Auto-generated method stub	
			this.wallstartPoint=wallstartPoint;
			this.wallendPoint=wallendPoint;
			this.doorStartPoint=doorStartPoint;
			this.doorEndPoint=doorEndPoint;
		
	}
	public void SetBomPosition(Point startPointBomb,Point endPointBomb) {
		this.startPointBomb=startPointBomb;
		this.endPointBomb=endPointBomb;
	}

	@Override
	public Bomb createBomb() {
		// TODO Auto-generated method stub
		return new Bomb(startPointBomb,endPointBomb);
	}

}
