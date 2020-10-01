package assignment7;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		int i,j=1,k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		while(j<=num)
		{
			i=num/j;
			i=i*i;
			j++;
		
		if(num == i) {
			k=+1;
			
		}
		}
		if(k>1)
		{
			System.out.println(num + " is perfect square");
		}
		else
			System.out.println(num+" is not perfect square");
		}

	}


