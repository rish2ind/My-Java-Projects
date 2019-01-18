	import java.util.Scanner;
class Methods {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a=sc.nextInt();
		
		System.out.println("Enter the value of b ");
		int b=sc.nextInt();
		int sum= Sum(a,b);
		System.out.println("The sum is " +sum);
		
		System.out.println("Enter the value of c ");
		int c=sc.nextInt();
		
		System.out.println("Enter the value of d ");
		int d=sc.nextInt();
		int sub=Sub(c, d);
		System.out.println("The subtraction is " +sub);
		
	}
		private	static int Sum(int x, int y){     //Function of Sum
				int s;
				s=x+y;
				return s;
			}
		
			static int Sub(int x, int y ){        //Function of Subtraction
				int s;
				s=x-y;
				return s;
			}

	
	
}
