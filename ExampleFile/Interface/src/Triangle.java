import java.util.Scanner;


public class Triangle implements Shape {
	private int h, b;
	private float area;
	@Override
	public void getdata() {
		System.out.println("Enter the height and base of Triangle : ");
		Scanner sc=new Scanner(System.in);
		h=sc.nextInt();
		b=sc.nextInt();
	}
	@Override
	public void calc_area() {
		area=(h*b)/2;
	}

	@Override
	public void display() {
		System.out.println("Area of triangle is : "+area);

	}

}
