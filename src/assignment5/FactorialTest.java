package assignment5;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FactorialTest ft=new FactorialTest();
	        int factorialNo=ft.getInput(sc);
	       ft.factorial(factorialNo);

	}
	
	
	public int getInput(Scanner sc1) {
		System.out.println("Enter the number ");
		int num=sc1.nextInt();
	//	System.out.println(num);
		return num;
			}
	public void factorial(int i)
	{    int fact=1;
		while(i>=1)
		{
			fact=fact*i;
			i--;
		}
		System.out.println(fact);
	}

}
