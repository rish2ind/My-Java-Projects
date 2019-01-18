	import java.util.Scanner;
class A{
	private int x;
	A(){
		x=0;
	}
	A(int x1){
		x=x1;
	}
	void setdata(int x1){
		x=x1;
	}
	void getdata(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of x : ");
		x=sc.nextInt();
	}
	void display(){
		System.out.println("The value of x is : "+x);
	}
}
class ABTest {
	public static void main(String[] args) {
	//  B b1=new B();
	//	b1.setdata(5, 6);
	//  b1.getdata();
	//	b1.display();
		B b2=new B(5, 6);
		b2.display();
	}

}
