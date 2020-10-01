package assignment9;

public class Child {
		
		public Child()
		 {
		 this("JIP");
		// super();
		 System.out.println("Child class no-args constructor");
		 }
		 public Child(String name)
		 {

		 System.out.println("Child class Parameterized constructor"+name);
		 }
		 public static void main(String args[])
		 {
			 Parent c = new Parent();

	}

}
