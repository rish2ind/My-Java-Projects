	import java.util.Scanner;
class Complex{
	private int real, img;
	Scanner sc=new Scanner(System.in);
	Complex(){
		real=img=0;
	}
	Complex(int real, int img){
		this.real=real;
		this.img=img;
	}
	void getdata(){
		System.out.print("Enter the real number : ");
		real=sc.nextInt();
		System.out.print("Enter the imaginary number : ");
		img=sc.nextInt();
	}
	Complex sum(Complex b){
		Complex t=new Complex();
		t.real=real+b.real;
		t.img=img+b.img;
		return t;
	}
	void display(){
		System.out.println("The sum of complex number is : "+real+" + " + img +"i");
	}
}
class ComplexTest {
	public static void main(String[] args) {
		Complex c1,c2, c3;
		c1=new Complex();
		c2=new Complex();
		c1.getdata();
		c2.getdata();
		c3=c1.sum(c2);
		c3.display();
	}

}
