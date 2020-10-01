package assignment7;

public class MultipleConstructor {

	public static void main(String[] args) {
		MultipleConstructor mc=new MultipleConstructor();
		MultipleConstructor mc1=new MultipleConstructor(2,3);
		MultipleConstructor mc2= new MultipleConstructor(6,7,8);
		MultipleConstructor mc4=new MultipleConstructor(2,4,6,8);
		
	}
	
	public MultipleConstructor()
	{
		System.out.println("hello constructor");
	}
	public MultipleConstructor(int a,int b)
	{
		System.out.println(a+b);
	}
	public MultipleConstructor(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public MultipleConstructor(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
	

}
