package assignment11;

public class MainClass1 {

	public static void main(String[] args) {

		int result = new Calculate() { 
			@Override 
			int add(int a, int b) { 
			return a+b; } }.add(11010, 22011); 
			System.out.println(result);

	}

}
