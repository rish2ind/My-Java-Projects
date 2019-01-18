
public class Strings {

	public static void main(String[] args) {
			String s1="matrix", s2;
		    System.out.println(s1.charAt(3));
		    System.out.println("\n");
		    for (int i = 0; i < s1.length(); i++) {
				System.out.println(s1.charAt(i));
			}
		    System.out.println(s1.length());
		    System.out.println("\n");
		    s2=s1.toUpperCase();
		    System.out.println(s2);
		    
		    System.out.println(s1==s2);
		     	
			for (int i = 0; i <s1.length(); i++) {
				System.out.println(s1);
				s1=(s1.substring(1)+s1.charAt(0));
			}

			String s3="Mr. Rishabh Mathur";
			
			if (s3.startsWith("Mr.")) {
				System.out.println("Male");
								
			}
			else 
				System.out.println("Female");
				
	}


}
