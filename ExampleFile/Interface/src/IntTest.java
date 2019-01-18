		import java.util.Scanner;
interface Shape{
	float PI=3.14f;
	void getdata();
	void calc_area();
	void display();
}
class Circle implements Shape{
	private int r;
	private float area;
	public void getdata(){
		System.out.println("Enter the radius of circle : ");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
	}
	public void calc_area(){
		area=PI*r*r;
	}
	public void display(){
		System.out.println("Area of circle is : " + area);
	}
}
public class IntTest {
	public static void main(String[] args) {
		Shape s[]={new Circle(), new Triangle() };
		for (int i = 0; i < 2; i++) {
			s[i].getdata();
			s[i].calc_area();
			s[i].display();
		}
		
	}

}
