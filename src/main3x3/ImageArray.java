package main3x3;

import java.io.IOException;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageArray {
	private List<ImageIcon> imgArrayList;
	private ImageIcon[] imgArray;
	private int specialSlot;
	
	
	public ImageArray(String location, String locationSwitch){
		imgArrayList = new ArrayList<ImageIcon>();
		for(int i = 0; i<9; i++){
			try {
				imgArrayList.add(new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/images/"+location+i+".JPG"))));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		imgArray = new ImageIcon[9];

		shuffle(); //shuffle must go before switchPic
		switchPic(locationSwitch);
	}
	
	public ImageIcon[] getImageArray(){
		return imgArray;
	}
	
	public int getSpecialSlot(){
		return specialSlot;
	}
	
	private void shuffle(){
		Collections.shuffle(imgArrayList);
		copyArray();
	}
	
	private void copyArray(){
		for(int i = 0; i<9; i++){
			imgArray[i] = imgArrayList.get(i);
		}
	}
	
	private void switchPic(String locationSwitch){
		int i = (int) (9*Math.random());
		int j = (int) (9*Math.random());
		try {
			imgArray[i] = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/images/"+locationSwitch+j+".JPG")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		specialSlot=i;
	}
}

