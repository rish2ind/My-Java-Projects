        import java.util.Scanner;
        
public class Binary {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter the size of array : ");
			int n=sc.nextInt();
			int i;
			int a[]=new int[n];
			for (i=0; i<n; i++){
				System.out.print("Enter element " +(i+1) + " :");
				a[i]=sc.nextInt();
			}
			
			System.out.print("Enter the number you want to search : ");
			int s=sc.nextInt();
			
			int low=0; int high= n-1; int mid=0;
			boolean flag=false;
			while(low<=high){
				mid = (low + high)/2;
				if (s==a[mid]){
					flag=true;
					break;
				}
				if (s<a[mid])
					high = mid-1;
				if (s > a[mid])
					low = mid + 1;
					
	}
				if (flag==true)
					System.out.println("Number is found");
				else 
					System.out.println("Number not found");
}
}
