package assignment4;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareTwoList {
	public static void main(String [] args)  
	{  
	//first arraylist  
	ArrayList<String> firstList= new ArrayList<String>(Arrays.asList("Good", "Morning", "Night","Students"));  
	//second arraylist  
	ArrayList<String> secondList= new ArrayList<String>(Arrays.asList("Night","Good","frineds"));  
	//storing the comparison output in thirdList  
	ArrayList<String> thirdList= new ArrayList<String>();  
	//iterator using for-each loop  
	for(String tempList : firstList)    //tempList is  a variable  
	thirdList.add(secondList.contains(tempList) ? "Yes" : "No");  
	System.out.println(thirdList);  
	}  
	}  


