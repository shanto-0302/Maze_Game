package Maze;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class IMaze {

	List <IRoom> room=new ArrayList<IRoom>();
	public void Draw(Graphics g){
		Iterator<IRoom> itr = room.iterator();
		while(itr.hasNext()){
			itr.next().Draw(g);
		}	
	}
	
}
