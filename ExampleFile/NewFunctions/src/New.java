   		import java.util.Scanner;
class New {
	static int multi(int x, int y){
		int m;
		m=x*y;
		return m;
	}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of a and b :");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int res;
			res=multi(a, b);
			System.out.println("The result is : " +res);
	}

}
