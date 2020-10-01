package assignment7;

import java.util.Scanner;
public class DecimalBinary {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int d=sc.nextInt();
		int i,n;
		String a="";
		
		while(d!=0) {
			
			i=d%2;
		//	n=i;
			a=i+" "+a;
			
			d=d/2;
			
			
			
			
		}

		System.out.print(a);

	}

}
