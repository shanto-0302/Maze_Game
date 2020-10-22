package Maze;

import java.awt.Graphics;
import java.awt.Point;

public class Firstmaze {

	public void maze1(Graphics g) {
		IFactory factory1=new FactoryMaze();
		BuildMaze maze=new BuildMaze(100,100,190,30);
		maze.createMaze(g,factory1);
	}
}
