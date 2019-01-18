import java.util.Scanner;


class Rect extends Shape {
	private int l, b, area;
	
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length and beadth of rectangle : ");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	void calc_area() {
		area=l*b;
	}
	void display() {
		System.out.println("Area of Rectangle is : " +area);
	}
}
