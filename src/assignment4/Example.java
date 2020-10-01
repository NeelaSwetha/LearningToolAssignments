package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		int i=0;
		Scanner scn = new Scanner(System.in);
	    System.out.println("Enter Corp values: ");
	    String input = scn.nextLine();
	    System.out.println(input);
	    Scanner tokenizer = new Scanner(input);
	    tokenizer.useDelimiter(" ");
	    ArrayList<Object> corp = new ArrayList<Object>();
	    while(tokenizer.hasNext())
	    {
	        corp.add(tokenizer.next());
	       // System.out.println(corp.get(corp.size()-1));
	    }
	    //System.out.println(corp); 
		  ArrayList<String> list=new ArrayList<String>();
		  //Creating arraylist 
		  list.add("Hptl");//Adding object in arraylist 
		  list.add("2000");
		  list.add("1800");
		  list.add("6500");
		//  System.out.println(list);
		  
		 for(Object corpVal:corp)
		 {
			 if(list.contains(corpVal))
			 {
				i++; 
			 }
		 }
		  if(i>=2) 
		  {
			  System.out.println("MULT");
		  }
		  else {
			  System.out.println(corp);
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		/*
		 * if(corp.equals(list)) { System.out.println("Corp and list are equl"+list);
		 * }else { System.out.println("corp and list are not equal"+corp); }
		 */
		  
		  
		  
		  
		/*
		 * for(int i=0;i<list.size();i++) { j=sc.nextLine(); corp.add(j); }
		 * 
		 * System.out.println(list); System.out.println(corp); if(corp.equals(list)) {
		 * 
		 * System.out.println("its equal"); } else { System.out.println("not equal"); }
		 */
		 
		
		
		
		
	}

}
