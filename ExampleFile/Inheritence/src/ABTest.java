class A{
	private int x;
	void setdatax(int x1){
		x=x1;
	}
	void displayx(){
		System.out.println("The value of x is : "+ x);
	}
}
class B extends A{
		private int y;
		void setdata(int y){
			this.y=y;
		}
		void display(){
			System.out.println("The value of y is : "+ y);
		}
}
public class ABTest {

	public static void main(String[] args) {
			B b1=new B();
			A a1=new B();
			b1.setdata(5);
			a1.setdatax(6);
			b1.display();
			a1.displayx();

	}

}
