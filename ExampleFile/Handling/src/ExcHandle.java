
public class ExcHandle {
	public static void main(String[] args) {
			try {
				String[] strings = {"Welcome"};
				System.out.println(strings[1]);
			} catch (ArrayIndexOutOfBoundsException e) {
				//e.printStackTrace();
				System.out.println("There is an error");
			}
			System.out.println("The application stil working");
	}

}
