import java.util.Scanner;


public class B extends A {
		private int y;
		void getdata(){
			getdatax();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of y : " );
			y=sc.nextInt();
		}
		void setdata(int x1, int y){
			setdatax(x1);
			this.y=y;			
		}
		void display(){
			displayx();
			System.out.println("The value of y is : " +y);
		}
}
