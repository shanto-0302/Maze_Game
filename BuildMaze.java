package Maze;

import java.awt.Graphics;
import java.awt.Point;

public class BuildMaze extends IMaze{

int x;	
int y1;


int bomX,bomR;

public BuildMaze(int x,int y1,int bomX,int bomR) {
	// TODO Auto-generated constructor stub
	this.x=x;
	 
	this.y1=y1;
 
	
	this.bomX=bomX;
	this.bomR=bomR;
}

public void createMaze(Graphics g, IFactory factory1 ){
	
	Room r1=new Room();
	Wall wall1;
	

	factory1.setElement(new Point(x,y1),new Point(60,7),new Point(x+60/2,y1),new Point(x+60/2 +20,y1));
	wall1=factory1.CreateWall();
	r1.setSouthWall(wall1);
	wall1.setDoor(factory1.createDoor());


	factory1.setElement(new Point(x+60,y1),new Point(6,70),new Point(x+60+6/2,y1+60/2),new Point(x+60+6/2,y1+60/2 +20));
	wall1=factory1.CreateWall();
	r1.setEastWall(wall1);
	wall1.setDoor(factory1.createDoor());

	factory1.setElement(new Point(x,y1+60),new Point(60,7),new Point(x+60/2,y1),new Point(x+60/2 +20,y1));
	wall1=factory1.CreateWall();
	r1.setNorthWall(wall1);
	

	factory1.setElement(new Point(x,y1),new Point(6,70),new Point(x,x+60/2),new Point(x,x+60/2 +20));
	wall1=factory1.CreateWall();
	r1.setWestWall(wall1);
	
	
	
	Room r2 =new Room();

    factory1.setElement(new Point(x+60+6/2,y1),new Point(60,7),new Point(x+60+6/2 +10,y1),new Point(x+60+6/2 +30,y1));
	wall1=factory1.CreateWall();
	r2.setEastWall(wall1);
	

	factory1.setElement(new Point(x+60+6/2 +60 ,y1),new Point(6,70),new Point(x+60+6/2 +60 +2,y1+15),new Point(x+60+6/2 +60 +2,y1+33));
	wall1=factory1.CreateWall();
	r2.setNorthWall(wall1);
	wall1.setDoor(factory1.createDoor());
	

	factory1.setElement(new Point(x+60+6/2 +2,y1+60),new Point(60,7),new Point(x+60+6/2 +15,y1+60+6/2),new Point(x+60+6/2 +32,y1+60+6/2));
	wall1=factory1.CreateWall();
	wall1.setDoor(factory1.createDoor());
	r2.setSouthWall(wall1);
	
	
	Room r3=new Room();
	
	
	factory1.setElement(new Point(x+60+6/2 +60 +2,y1+60),new Point(6,70),new Point(x+60*2+10,y1+60*2-30),new Point(x+60*2+10,y1+60*2-10));
	wall1=factory1.CreateWall();
	r3.setEastWall(wall1);
	wall1.setDoor(factory1.createDoor());
	
	
	
	factory1.setElement(new Point(x+60+10,y1+60+6/2 +60 +2),new Point(60,7),new Point(x+60+30,y1+60+6/2 +60 +2),new Point(x+60*2-10,y1+60+6/2 +60 +2));
	wall1=factory1.CreateWall();
	r3.setNorthWall(wall1);
	wall1.setDoor(factory1.createDoor());
	
	factory1.setElement(new Point(x+60+5,y1+60),new Point(6,70),new Point(x+60+5,y1+60+20),new Point(x+60+5,y1+60*2-5));
	wall1=factory1.CreateWall();
	r3.setSouthWall(wall1);
	wall1.setDoor(factory1.createDoor());
	
	
	Room r4=new Room();
	
	factory1.setElement(new Point(x,y1+60),new Point(6,70),new Point(x,y1+60+15),new Point(x,y1+60*2-25));
	wall1=factory1.CreateWall();
	r4.setEastWall(wall1);
	wall1.setDoor(factory1.createDoor());
	

	factory1.setElement(new Point(x+3,y1+60+6/2 +60 +2),new Point(60+3,7),new Point(x+60/2,y1+60*2+8),new Point(x+60/2 +20,y1+60*2+8));
	wall1=factory1.CreateWall();
	wall1.setDoor(factory1.createDoor());
	
	r4.setNorthWall(wall1);

	factory1.SetBomPosition(new Point(bomX,bomX), new Point(bomR,bomR));
	factory1.createBomb().BuildShape(g);
	
	room.add(r1);
	room.add(r2);
	room.add(r3);
	room.add(r4);
	Draw(g);
	
}
}
