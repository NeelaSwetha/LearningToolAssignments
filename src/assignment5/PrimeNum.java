package assignment5;

import java.util.Scanner;

public class PrimeNum {
	
	 public static void main(String args[]) 
	    { 
	    	Scanner sc=new Scanner(System.in);
	       PrimeNum pn=new PrimeNum();
	        int primeNo=pn.getInput(sc);
	        pn.isPrime(primeNo);
	    } 
	
	
	public int getInput(Scanner sc1) {
		System.out.println("Enter the number ");
		int num=sc1.nextInt();
	//	System.out.println(num);
		return num;
			}

	static boolean isPrime(int n) 
    { 
		int n1=0; 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) { 
            	n1=1;
            	System.out.println("false");
            	break;
            }
        if(n1==0)System.out.println("true");
        return true;
  
    } 
  
   

}
