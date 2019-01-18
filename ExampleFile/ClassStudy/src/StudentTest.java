		
	
class StudentTest {
     static	int sum(int x, int y){
		return (x+y);
	}
     static	float sum(float a, float b){
		return (a+b);
	}
	public static void main(String[] args) {
		int add;
		add= sum(5, 6);
		float addd=sum(5.5f, 6.6f);
		System.out.println("The result is : " +add);
		System.out.println("The result is : " +addd);

	}

}
