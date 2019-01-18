 import java.util.Scanner;
 class This{
	 private int roll;
	 private String name;
	 Scanner sc= new Scanner(System.in);
	 void getdata(){
		 System.out.println("Enter the roll number :");
		 roll=sc.nextInt();
		 System.out.println("Enter name :");
		 name=sc.next();
	 }
	 void setdata(int roll, String name){
		 this.roll=roll;
		 this.name=name;
	 }
	 void display(){
		 System.out.println(roll +" " + name);
	 }
 }
class ThisTest {
	public static void main(String[] args) {
			This t=new This();
			This t1=new This();
			t.getdata();
			t1.getdata();
		//	t.setdata(101, "Rishabh");
		//	t1.setdata(102, "Ramiz");
			t.display();
			t1.display();
	}

}
