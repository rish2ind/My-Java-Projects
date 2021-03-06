	import java.util.*;
public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> s1=new Stack<Integer>();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		System.out.println(s1.elementAt(0));
		System.out.println(s1.elementAt(1));
		System.out.println(s1.elementAt(2));
		try {
			System.out.println("Element at top of stack is "+s1.peek());
			System.out.println(s1.pop());
			System.out.println(s1.pop());
			System.out.println(s1.pop());
		} catch (EmptyStackException e) {
			
			System.out.println("Your stack is empty !!");
		}
		System.out.println(s1.empty());
	}

}
