		import java.util.Scanner;
class Reverse{
		private int a[];
		private int n;
		Scanner sc=new Scanner(System.in);
		void getdata(){
			System.out.println("Enter the size of array :");
			n=sc.nextInt();
			System.out.print("Enter the elements of array :");
			a=new int[n];
			for (int i = 0; i < n; i++) {
				a[i]=sc.nextInt();
			}
		}
		void set(int ... x) {
			a=x;
			n=x.length;
		}
		void reverse(){
			for(int i=0, j=n-1; i<j; i++, j--){
				int t=a[i]; a[i]=a[j]; a[j]=t;
			}
		}
		void display(){
			for (int e : a) {
				System.out.print(e+"\t");
			}
		}
}
class ReverseTest {
	public static void main(String[] args) {
		Reverse r=new Reverse();
		r.getdata();
		r.reverse();
		r.display();
	}

}
