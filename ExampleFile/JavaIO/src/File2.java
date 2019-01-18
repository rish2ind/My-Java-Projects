import java.io.*;
public class File2 {
	public static void main(String[] args) throws IOException {
		Console con=System.console();
		FileReader f1=null;
		FileReader f2=null;
		BufferedReader b1=null;
		BufferedReader b2=null;	
		try{
			f1=new FileReader("country.txt");
			f2=new FileReader("capital.txt");
			b1=new BufferedReader(f1);
			b2=new BufferedReader(f2);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found !");
			System.exit(1);
		}
		String country=" ", capital= " ", countrysearch;
		boolean found=false;
		System.out.print("Enter the country you want to search : ");
		countrysearch=con.readLine();
		while(true){
			country=b1.readLine();
			capital=b2.readLine();
			if(country==null)
				break;
			if(country.equalsIgnoreCase(countrysearch)){
				found=true;
				break;
			}
		}
		if(found==true)
			System.out.println("Capital is "+capital);
		else
			System.out.print("Country not found in your record !");
		f1.close();f2.close();b1.close();b2.close();
	}

}
