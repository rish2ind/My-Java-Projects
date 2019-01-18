		import java.io.Console;
    class ConsoleFlush {
	public static void main(String[] args) {
			Console con=System.console();
			System.out.println("Enter the number ");
			int a = Integer.parseInt(con.readLine());
			System.out.println("Enter the name ");
			String s=con.readLine();
			System.out.println("Integer is " +a);
			System.out.println("Name is " +s);
	}

}
