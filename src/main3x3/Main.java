package main3x3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class Main{
	
    public static void main(String[] args) {
    	JFrame mainFrame=new JFrame(); //creates frame
    	mainFrame.setTitle("Test");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int rounds = 20; //number of trials
    	double[] timeFlower = new double[rounds];
    	double[] timeSnake = new double[rounds];
    	StringArray stringArray = new StringArray(rounds);
    	
    	
    	Test test = new Test(stringArray);
    	for (int i=0; i<3; i++){
    		int time = (i==0) ? 5500 : 1000;
    		mainFrame.setContentPane(new StartScreen(i));
        	mainFrame.pack(); //sets appropriate size for frame
            mainFrame.setVisible(true); //makes frame visible
            try {
    		       Thread.sleep(time);
    		    } catch(InterruptedException e) {
    		    }
    	}
    	
       
    	for (int i=0; i<rounds; i++){
    		
        	
        	test.updateTest(i);
        	mainFrame.setContentPane(test.returnTestFrame());
        	mainFrame.pack(); 
        	
        	
            test.runTest();
        	    	
        	//TODO changed to f from flowers
        	if(stringArray.getLocation(i).equals("f")){
        		timeFlower[i]=test.returnTime();
        	} else {
        		timeSnake[i]=test.returnTime();
        	}

    	}
    	
    	mainFrame.setContentPane(new EndScreen(getAverageTime(timeFlower),getAverageTime(timeSnake)));
    	mainFrame.pack();
    }

    public static double getAverageTime(double[] d){
    	double sum=0;
    	int count=0;
    	for (int i=0; i<d.length;i++){
    		if(d[i]>0){
    			count++;
    		}
    		sum+=d[i];
    	}
    	return sum/count/1000000000;
    }
}
