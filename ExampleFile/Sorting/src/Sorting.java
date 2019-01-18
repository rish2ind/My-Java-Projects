                 import java.util.Scanner;
public class Sorting {
	
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter the size of array : ");
			int n=sc.nextInt();
			
			int i, j;
			int a[]= new int[n];
			for (i=0; i<n; i++){
				System.out.print("Enter elements " +(i+1) + ": ");
				a[i]=sc.nextInt();
			}
			for (i=0; i<n-1; i++){
				for (j=i+1; j<n; j++){
					if (a[i]>= a[j]){
						a[i]=a[i] + a[j];
						a[j]=a[i] - a[j];
						a[i]=a[i] - a[j];
					}
				}
			}
			System.out.print("\n The new array after sorting is : ");
			for (i=0; i<n; i++)
				System.out.println(a[i]);
	}

}
