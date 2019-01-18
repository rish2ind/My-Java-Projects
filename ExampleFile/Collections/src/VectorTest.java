	import java.util.*;
public class VectorTest {
	public static void main(String[] args) {
		Vector<Integer> v1=new Vector<>();
		v1.addElement(10);
		v1.addElement(20);
		v1.addElement(30);
		System.out.println(v1);
		for (int i = 0; i < v1.size(); i++) {
			v1.setElementAt(i+5, i);
			System.out.println(v1.elementAt(i));
		}
	}

}
