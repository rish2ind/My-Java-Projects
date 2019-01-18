	import java.util.Scanner;
class Triangle extends Shape {
	private int h, b;
	private float area;
	void getdata() { 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the height and base of triangle : ");
		h=sc.nextInt();
		b=sc.nextInt();
	}
	void calc_area() {
		area=(h*b)/2;
	}

	void display() {
		System.out.println("Area of triangle is : "+area);
	}

}
