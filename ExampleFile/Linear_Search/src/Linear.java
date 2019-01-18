    /* Linear search
       of a number in an array
     */

       import java.util.Scanner;
public class Linear {
	
	public static void main(String[] args) {		
            Scanner sc=new Scanner(System.in);    //Declare the object
            
            System.out.print("Enter the length of array");    //Enter the length of array
            int n= sc.nextInt();
            int i;     
            // Declaring the array
            int a[]=new int[n];
            
            //Input the elements of array
            for( i=0; i<n; i++){
            	System.out.print("Enter element "+ (i+1) + ":");
            	a[i]=sc.nextInt();
            }
                              
            System.out.print("Enter the element you want to search :");
            int s=sc.nextInt();
                  
            // Searching a number
            for( i=0; i<n; i++){
            	if(s==a[i]){
            		System.out.print( a[i] +" Number is found at position " +(i+1) );
            	    break;
            }
            	
        }
           if (i==n){
        	   System.out.println("Number not found");
           }
	}
}