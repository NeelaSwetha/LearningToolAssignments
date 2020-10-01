package assignment5;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
	    Power pp=new Power();
	    int n=pp.getInput(sc);
	    int m=pp.getInput1(sc);
	    pp.numPower(n, m);
	    
	}
	
	public int getInput(Scanner sc1) {
		System.out.println("Enter the number ");
		int n=sc1.nextInt();
	//	System.out.println(num);
		return n;
			}
	public int getInput1(Scanner sc1) {
		System.out.println("Enter the number ");
		int m=sc1.nextInt();
	//	System.out.println(num);
		return m;
			}
    public void numPower(int n,int m)
    {
    	double result = Math.pow(n, m);
    	System.out.println("Answer = " + result);
    	
    }
}
