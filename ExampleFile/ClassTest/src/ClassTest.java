	import java.util.Scanner;
class Student{
	private String name;
	private int roll;
	Scanner sc=new Scanner(System.in);
	void getdata(){
		System.out.print("Enter the Name and Roll No. of student : ");
		name=sc.nextLine();
		roll=sc.nextInt();
	}
	void setdata(String name, int roll){
		this.name=name;
		this.roll=roll;
	}
	void display(){
		System.out.println("The details of students are : " +name +" "+roll);
	}
}
class ClassTest {

	public static void main(String[] args) {
			Student s1, s2;
			s1=new Student(); s2=new Student();
			s1.getdata();
			s2.getdata();
			s1.display();
			s2.display();

	}

}
