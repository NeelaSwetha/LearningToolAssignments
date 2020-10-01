import java.util.Scanner;

public class Three_methods {

	public static void main(String[] args) {
		
		Three_methods tm=new Three_methods();
		tm.inputValues();
		tm.multiplication();
		tm.display();
	}
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	public void inputValues()
	{
		System.out.println("enter a,b values");
		a=sc.nextInt();
		b=sc.nextInt();	
	}
	public void multiplication()
	{
		c=a*b;
	}
	public void display()
	{
		System.out.println("a*b="+c);
	}

}
