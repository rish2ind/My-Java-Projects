   		import java.util.Scanner;
   		
public class Calculator {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the value of a and b ");
			float a=sc.nextInt();
			float b=sc.nextInt();
			
			System.out.println(" 1. Addition \n 2. Subtraction\n 3. Multiplication\n4. Division\n\nEnter your choice : ");
			int ch=sc.nextInt();
			float result = 0.0f;
						
			switch (ch) {
			case 1:
				 result=addValues(a, b);
				break;
			case 2:
			    result=subtractValues(a, b);
			    break;
			case 3:
			     result=multiplyValues(a, b);
			break;
			case 4:
			     result=divideValues(a, b);
			break;
			default:
				System.out.println("Wrong choice");
				return;
			}
			System.out.println("The answer is " +result);
	}
		static float addValues(float x, float y){
		float result;
		result=x+y;
		return result;
	    }
		
		private static float subtractValues(float x, float y) {
			float result;
			result=x-y;
			return result;
		}
		private static float multiplyValues(float x, float y) {
			float result;
			result=x*y;
			return result;	
		}
		private static float divideValues(float x, float y) {
			float result;
			result=x/y;
			return result;
		}
		
		

}
