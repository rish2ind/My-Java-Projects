	import java.util.Scanner;
class A{
		private int feet, inch;
	A(){
		feet=0;inch=0;
	}
	A(int feet, int inch){
		this.feet=feet;
		this.inch=inch;
	}
	void getdata(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter feet : ");
		feet=sc.nextInt();
		System.out.println("Enter inches : ");
		while(true){
		inch=sc.nextInt();
		if(inch<=11 && inch>0)
			break;
		else
			System.out.println("Wrong input");
		}
	}
	A sum(A b){
		A t=new A();
		t.feet=feet+b.feet;
		t.inch=inch+b.inch;
		if(t.inch>=12){
			t.inch-=12;
			++t.feet;
		}
		return t;
	}
	void display(){
		System.out.println("Sum of heights is :"+feet+"\'"+inch+"\"");
	}
	
}
class ATest {
	public static void main(String[] args) {
		A a1, a2, a3;
		a1 = new A();
		a2 = new A();
		a1.getdata();
		a2.getdata();
		a3=a1.sum(a2);
	//	a1=new A(5, 4);
	//	a2=new A(6, 2);
		a3=a1.sum(a2);
		a3.display();
		
	}

}
