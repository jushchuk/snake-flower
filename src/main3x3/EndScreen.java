package main3x3;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class EndScreen extends JPanel{
	
	private JTextField labelA;
	private JTextField labelB;
	private JTextArea labelC;

	
	public EndScreen(double typeA, double typeB){
		setLayout(new GridLayout(4,1));
		labelA = new JTextField("Average Time for flowers and one snake: "+typeA);
		labelB = new JTextField("Average Time for snakes and one flower: "+typeB);
		labelC = new JTextArea(typeA+"\n"+typeB);
		//labelC = new JTextField("Difference of Times: "+(typeA-typeB));
		
		labelA.setEditable(false); // as before
		labelA.setBackground(null); // this is the same as a JLabel
		labelA.setBorder(null); // remove the border
		
		labelB.setEditable(false);
		labelB.setBackground(null);
		labelB.setBorder(null); 
		
		labelC.setEditable(false);
		labelC.setBackground(null);
		labelC.setBorder(null); 

		add(labelA);
		add(labelB);
		add(labelC);
	}
	
}
