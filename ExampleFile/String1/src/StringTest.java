 import java.util.Scanner;
public class StringTest {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the number of Strings : ");
			int n=sc.nextInt();
			String s[]=new String[n];
			for (int i = 0; i < n; i++) {
				System.out.print("Enter the Strings : "+(i+1)+ " ");
				s[i]=sc.next();
			}
			for (int i = 0; i < s.length; i++) {
				for (int j = i+1; j < s.length; j++) {
					if(s[i].compareTo(s[j])>0){
						String  t ;
						t=s[i];
						s[i]=s[j];
						s[j]=t;
					}		
				}
			}
			for (String e : s) {
				System.out.println(e);
			}
	}

}
