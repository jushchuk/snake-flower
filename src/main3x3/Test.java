package main3x3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Test implements ActionListener{
	private JPanel frame;
	private StringArray stringArray;
	
	private double startTime;
	private double endTime; 
	private double time;
	private long sleepTime;
	
	private boolean testComplete;
	
	
	public Test(StringArray stringArray){
		frame=new JPanel();
		this.stringArray=stringArray;
		testComplete=false;
		time=0.0;
	}
	
	public void updateTest(int i){
		if (frame!=null){
			frame.removeAll();
		}
		frame.add(new ButtonGrid(new ImageArray(stringArray.getLocation(i),stringArray.getLocationSwitch(i)),this), BorderLayout.CENTER);
	}
	
	public JPanel returnTestFrame(){
		return frame;
	}
	
	public void runTest(){
		sleepTime = 2500;
		startTime = System.nanoTime();
		try {
		       Thread.sleep(sleepTime);
		    } catch(InterruptedException e) {
		    }
		if(!testComplete){
			time=sleepTime*1000000;
		}
		testComplete=false;
    	return;
	}
	
	public double returnTime(){
		return time;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String answer = e.getActionCommand();
	    if (answer.equals("TRUE")) {
	    	if(!testComplete){
	    		endTime = System.nanoTime();
	    		time = endTime-startTime;
	    		testComplete = true;
	    	}  	
	    } else if (answer.equals("FALSE")) {
	    	//wait until true (nothing)
	    }
	}

}
