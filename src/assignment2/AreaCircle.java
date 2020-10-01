package assignment2;

import java.util.Scanner;

public class AreaCircle {
	double area;
	void circle(double r)
	{
	 area= (22*r*r)/7;
	}
   public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the radius:");
      double rad= s.nextDouble();      
      AreaCircle  a=new AreaCircle();
      a.circle(rad);
      System.out.println("Area of Circle is: " + a.area);      
   }

}
