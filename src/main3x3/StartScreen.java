package main3x3;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StartScreen extends JPanel{
	
	private JTextArea instructions;
	
	public StartScreen(int i){
		setLayout(new BorderLayout());
		
		if (i==0) {
		instructions = new JTextArea("This Test will be 20 rounds and about 60 seconds long."
								+ "\n On each screen you will have to click the "
								+ "\n one image (flower/snake) that is not like the other."
								+ "\n Once the test is complete you will get your average response time.");
		} else if (i==1){
			instructions = new JTextArea("Ready...");
		} else if(i==2){
			instructions = new JTextArea("Set...");
		}
		
		add(instructions,BorderLayout.CENTER);
		
	}
}
