   import java.util.Scanner;
   class Student{
	   Scanner sc=new Scanner(System.in);
	   private String name;
	   private int roll;
	   private int sub1;
	   private int sub2;
	   private float per;
	   void getdata(){
		   System.out.print("Enter the name : ");
		   name=sc.next();
		   System.out.print("Enter the roll no. : ");
		   roll=sc.nextInt();
		   System.out.print("Enter the marks of sub1 : ");
		   sub1=sc.nextInt();
		   System.out.print("Enter the marks of sub2 : ");
		   sub2=sc.nextInt();
		   System.out.print("\n");
	   }
	   void setdata(String name1, int roll1, int sub11, int sub21){
		   name = name1;
		   roll = roll1;
		   sub1= sub11;
		   sub2= sub21;
	   }
	   void calc_per(){
		   per = (sub1+sub2)/2;
	   }
	   void display(){
		   System.out.println(name+"\t"+ roll + "\t" + sub1 + "\t" + sub2 +"\t"+per);
	   }
   }
class Student1 {
	public static void main(String[] args) {
			Student s1=new Student();
			Student s2=new Student();
			
			s1.getdata();
			s2.getdata();
			
			s1.calc_per();
			s2.calc_per();
			System.out.println("Name\t Roll\t Sub1\t Sub2\t Per\t");
			s1.display();
			s2.display();
	}
}
/*
class Student1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students ");
		int n =sc.nextInt();
		Student a[]=new Student[n];
		for (int i=0; i<a.length; i++){
			a[i]=new Student();
			a[i].getdata();
			a[i].calc_per();
		}
		System.out.println("Name\t Roll\t Sub1\t Sub2\t Per");
		for (Student e : a) {
			e.display();
		}
	}
}
*/