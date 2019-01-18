      import java.util.Scanner;
public class Sum {
		static int sum(int x, int y){
			int s;
			s=x+y;
			return s;
		}
		
		static int sub(int x, int y){
			int s;
			s=x-y;
			return s;
		}
			
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the value of a and b : ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int ans;
			ans = sum(a,b);
			System.out.println("Sum is " + ans);
			
			System.out.print("Enter the value of a and b : ");
			int c=sc.nextInt();
			int d=sc.nextInt();
			int res;
			res = sub(c, d);
			System.out.println("Subtracton is " + res);

	}

}
