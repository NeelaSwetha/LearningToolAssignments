import java.util.Scanner;

public class Greatest_Number {
	

	public static void main(String[] args) {
		int a, b, c, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter all three numbers:");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
       int greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c); 
       System.out.println("the greatest number is"+greatest);

	}

}
