package assignment5;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       StarPattern sp=new StarPattern();
       int num=sp.getInput(sc);
       sp.stars(num);
       
       
	}
	public int getInput(Scanner sc1) {
		System.out.println("Enter the number ");
		int num=sc1.nextInt();
		return num;
			}
	public void stars(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");

			}
		System.out.println();
		}
		}

}
