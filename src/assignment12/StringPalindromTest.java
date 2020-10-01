package assignment12;

import java.util.Scanner;

public class StringPalindromTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		
		String s=sc.next();
		
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
		    s1=s1+s.charAt(i);
		  //  System.out.println(s.charAt(i));
			
		}
	    System.out.println(s1);

		
		if(s1.equals(s))
		{
			System.out.println("palindrom");
		}else {
		System.out.println("not palindrom");}		
	}}
