     import java.util.Scanner;
class A {
			private int x;
			private float y;
			Scanner sc=new Scanner(System.in);
			void getdata(){
				System.out.println("Enter the two numbers :\n");
				x=sc.nextInt();
				y=sc.nextFloat();
			}
			void setdata(int x1, float y1){
				x=x1;
				y=y1;
			}
			void display(){
				System.out.println("The value of x and y is :" +x +" ," +y);
			}
}
	class ATest{
	public static void main(String[] args) {
			A a=new A();
			a.getdata();
			//a.setdata(5, 5.4f);
			a.display();

	}
	}

