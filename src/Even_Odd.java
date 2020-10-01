import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
                if(num%2==0)
                 {
                 System.out.println("Given nember is even:"+num);
                  }else
                 {
                  System.out.println("Given nember is odd:"+num);
                   }
	}

}
