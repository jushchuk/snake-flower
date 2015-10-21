package main3x3;
import javax.swing.ImageIcon;
import javax.swing.JFrame; //imports JFrame library
import javax.swing.JButton; //imports JButton library
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout; //imports GridLayout library
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ButtonGrid extends JPanel implements ActionListener{

	
	private JButton[][] grid; //names the grid of buttons

	public ButtonGrid(ImageArray imgArray, ActionListener a){ //constructor
		setLayout(new GridLayout(3,3)); //set layout
		grid=new PicButton[3][3]; //allocate the size of grid
		int k=0;

		for(int y=0; y<3; y++){
			for(int x=0; x<3; x++){
				if(k==imgArray.getSpecialSlot()){
					grid[x][y]=new PicButton(true);
				} else {
					grid[x][y]=new PicButton(false);
				}
				
				grid[x][y].setBackground(Color.black);
				grid[x][y].addActionListener(this); //same actionLister is added to each button
				grid[x][y].addActionListener(a);
				grid[x][y].setIcon(imgArray.getImageArray()[k]);
				k++;
				add(grid[x][y]); //adds button to grid
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String answer = e.getActionCommand();
	    if (answer.equals("TRUE")) {
	    	//System.out.println("Correct!");
	    } else if (answer.equals("FALSE")) {
	    	//System.out.println("Wrong!");
	    }
	}
}
	 
