package assignment5;

import java.util.Scanner;

public class PalidromeDemo {
      int sum;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PalidromeDemo pd=new PalidromeDemo();
		int i=pd.getInput(sc);
		pd.polidrome(i);
		
	}
	
	public int getInput(Scanner sc1) {
		System.out.println("Enter the number ");
		int num=sc1.nextInt();
	//	System.out.println(num);
		return num;
			}
	public void polidrome(int num)
	{    int temp=num;
		  while(num>0){    
		 int r=num%10;  //getting remainder  
	     sum=(sum*10)+r;    
		 num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(temp + " is palindrome number ");    
		  else    
		   System.out.println(temp +" is not palindrome");    
	}
}
