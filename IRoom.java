package Maze;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class IRoom {
	List <Wall> walls=new ArrayList<Wall>();
	public void Draw(Graphics g){
		Iterator<Wall> itr = walls.iterator();
		while(itr.hasNext()){
			itr.next().DrawWall(g);
		}	
	}
}
