   import java.util.Scanner;
   class Array{
	   private int a[];
	   private int n;
	   Scanner sc=new Scanner(System.in);
	   void getdata(){
		   
		   System.out.println("Enter the size of array :");
		   n=sc.nextInt();
		   a=new int[n];
		   System.out.print("Enter the elements of array");
		   for(int i=0; i<n; i++){
			   a[i]=sc.nextInt();
		   }
	   }
	   void setdata(int ... x){
		   a=x;
		   n=x.length;
	   }
	 
	   void sort(){
		   for (int i=0; i<n-1; i++)
			   for (int j = i+1; j < n; j++) {
				if (a[i]>a[j]) {
					int t=a[i]; a[i]=a[j]; a[j]=t;
				}
			}
	   }
	   void display(){
		   for (int e : a) {
			System.out.print(e);
		}
	   }
   }
   
    class ArrayTest {
	public static void main(String[] args) {
		Array s= new Array();
		
		//s.getdata();
		s.setdata(5,6,1,2,3);
		s.sort();
		s.display();
	}

}
