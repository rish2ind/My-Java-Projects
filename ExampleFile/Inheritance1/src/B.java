import java.util.Scanner;


class B extends A {
		private int y;
		B(){
			super();
			y=0;
		}
		B(int x1, int y1){
			super(x1);
			y=y1;
		}
		void setdata(int x1, int y1){
			setdata(x1);
			y=y1;
		}
		void getdata(){
			super.getdata();
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the value of y : ");
			y=sc.nextInt();
		}
		void display(){
			super.display();
			System.out.print("The value of y is : " +y);
		}
}
