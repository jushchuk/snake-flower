package main3x3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;

public class StringArray {
	private List<String> stringArrayList;
	private String[] stringArray;
	private int rounds;
	
	public StringArray(int r){
		rounds=r;
		stringArrayList = new ArrayList<String>();
		stringArray = new String[rounds];
		for(int i=0; i<rounds/2; i++){
			stringArrayList.add("f-s-1");
			stringArrayList.add("s-f-2");
		}
		shuffle(); //shuffle must go before switchPic
	}
	
	public String[] getImageArray(){
		return stringArray;
	}

	public String getLocation(int i){
		String[] parts = stringArray[i].split("-");
		return parts[0];
	}
	
	public String getLocationSwitch(int i){
		String[] parts = stringArray[i].split("-");
		return parts[1];
	}
	
	public String getTypeOfSwitch(int i){
		String[] parts = stringArray[i].split("-");
		return parts[2];
	}
	
	private void shuffle(){
		Collections.shuffle(stringArrayList);
		copyArray();
	}
	
	private void copyArray(){
		for(int i = 0; i<rounds; i++){
			stringArray[i] = stringArrayList.get(i);
		}
	}
	
}

