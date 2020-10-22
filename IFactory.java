package Maze;

import java.awt.Point;

public interface IFactory {
Wall CreateWall();
Door createDoor();
public void setElement(Point wallstartPoint,Point wallendPoint,
		Point doorStartPoint,Point doorEndPoint);

public void SetBomPosition(Point startPoint, Point endPoint); 
Bomb createBomb();
}
