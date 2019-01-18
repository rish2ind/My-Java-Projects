import java.util.Scanner;

class Circle extends Shape {
		private int r;
		private float area;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius : ");
		r=sc.nextInt();
	}
	void calc_area() {
		area=PI*r*r;
	}
	void display() {
		System.out.println("The area of circle : "+area);
	}
}
