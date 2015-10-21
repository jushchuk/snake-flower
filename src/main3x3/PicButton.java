package main3x3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PicButton extends JButton {
	private boolean correctAnswer;
	
	public PicButton(boolean correctAnswer){
		super();
		this.correctAnswer=correctAnswer;
		if (correctAnswer){
			setActionCommand("TRUE");
		}else{
			setActionCommand("FALSE");
		}
	}

	public boolean getCorrectAnswer(){
		return correctAnswer;
	}
	
}
