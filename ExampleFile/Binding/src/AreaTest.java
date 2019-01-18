  
abstract class Shape{
	final float PI=3.141f;
	abstract void getdata();
	abstract void calc_area();
	abstract void display();
}
class AreaTest {
	public static void main(String[] args) {
		Shape s1[]={new Circle(), new Rect(), new Triangle()};
		for (int i = 0; i < s1.length; i++) {
			s1[i].getdata();
			s1[i].calc_area();
			s1[i].display();
		}

	}

}
