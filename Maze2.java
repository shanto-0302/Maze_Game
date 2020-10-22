package Maze;

import java.awt.Graphics;
import java.awt.Point;

public class Maze2 {

	public void maze(Graphics g) {
		IFactory factory1=new FactoryMaze();
		BuildMaze maze1=new BuildMaze(100,100,315,30);
		maze1.createMaze(g,factory1);
		
		BuildMaze maze2=new BuildMaze(229,100,315,30);
		maze2.createMaze(g,factory1);
		
		BuildMaze maze3=new BuildMaze(100,230,315,30);
		maze3.createMaze(g,factory1);
		
		BuildMaze maze4=new BuildMaze(229,230,315,30);
		maze4.createMaze(g,factory1);
		
	 
		
	}
	
}
