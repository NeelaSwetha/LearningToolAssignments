package assignment10;

public class OvaerlaodingTest {
	
	public static void staticMethod1()
	{
		System.out.println("Hello Static");
	}
	public void staticMethod()
	{
		System.out.println("Hello non-static");
	}
    public static void main(String args[]) {  
    	OvaerlaodingTest aa= new OvaerlaodingTest();
        aa.staticMethod();
    	
    } 
} 


