import java.io.Console;
public class ConsoleTest {
	public static void main(String[] args) {
		Console con=System.console();
		System.out.println("Enter your name : ");
		String s=con.readLine();
		System.out.println("Your name is : "+s);
	}

}
