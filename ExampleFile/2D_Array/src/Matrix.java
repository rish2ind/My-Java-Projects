     
import java.util.Scanner;
     
public class Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int r=3, c=3, i, j;
		int m[][]= new int[r][c];
		for (i=0; i<r; i++){
			for(j=0; j<c; j++){
				
				System.out.print("Enter element " + (i+1) + "," +(j+1)+ "\t" );
				m[i][j]=sc.nextInt();
				
			}
			
		}
			System.out.println("\n Enter the elements of second array : \n");
			int r1=3, c1=3;
			int m2[][]=new int[r1][c1];
			for (i = 0; i < r1; i++) {
				for (j = 0; j <c1; j++) {
					System.out.print("Enter element " + (i+1) + "," +(j+1)+ " ");
					m2[i][j]=sc.nextInt();
				}
			}
						
	}

}
