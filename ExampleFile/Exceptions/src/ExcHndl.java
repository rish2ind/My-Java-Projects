//	import java.util.Scanner;
public class ExcHndl {
	public static void main(String[] args) {
			int a=5, b=0, c;
		//	Scanner sc=new Scanner(System.in);
		//	System.out.print("Enter the value of a and b : ");
		//	a=sc.nextInt();
		//	b=sc.nextInt();
			try {
				c=a/b;
				System.out.println(c);
			} catch (ArithmeticException e) {
				System.out.println("Wrong choice ");
			}
	}

}
