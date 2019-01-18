	import java.util.Scanner;
	class A{
		private int x;
		A(){
			x=0;
		}
		A(int x1){
			x=x1;
		}
		void setdatax(int x1){
			x=x1;
		}
		void getdatax(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of x : ");
			x=sc.nextInt();
		}
		void displayx(){
			System.out.println("The value of x is : "+ x);
		}
	}
public class ATest {

	public static void main(String[] args) {
				B b1=new B();
				b1.getdata();
			//	b1.setdata(5,6);
				b1.display();
	}

}
