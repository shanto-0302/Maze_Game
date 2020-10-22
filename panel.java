package Maze;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;



public class panel extends JPanel{

	private JButton shape1,shape2,refresh;
	private boolean isShape1Clicked,isShape2Clicked;
	public panel() {
		// TODO Auto-generated constructor stub
	setBackground(Color.white);
		
		shape1 = new JButton("FIRST Maze");
		shape2 = new JButton("SECOND Maze");
		refresh = new JButton("REFRESH");
				
		addButtonActionListeners();
		
		add(shape1);
		add(shape2);
		add(refresh);
		 
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		if(isShape1Clicked)
		{
			Firstmaze maze1=new Firstmaze();
			maze1.maze1(g);
		}
		
		else if(isShape2Clicked)
		{
			Maze2 maze2=new Maze2();
			maze2.maze(g);
		}
		
	 
	}
		
private void addButtonActionListeners(){
	
		shape1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub	
				
				isShape1Clicked = true;
				isShape2Clicked = false;	
				repaint();
			}
		});
		
		shape2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				isShape2Clicked = true;
				isShape1Clicked = false;	
				repaint();
			}
		});
		 
		
		refresh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				isShape1Clicked = isShape2Clicked=false;
				repaint();
			}
		});
		
	}
	
}
