package Maze;

import javax.swing.JFrame;

public class Main{

	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(700,700);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new panel());
		frame.setVisible(true);
	}
	
}
