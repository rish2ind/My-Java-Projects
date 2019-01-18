import java.io.*;
import java.util.Scanner;
class File6 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis=null;
		FileOutputStream fos = null;
		Scanner sc=null;
		try{
			fis = new FileInputStream("a.txt");
			fos= new FileOutputStream("temp.txt");
			sc=new Scanner(fis);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found !");
		}
		String s1;
		while (true) {
			if(sc.hasNext())
			s1=sc.next();		
			else
				break;
			if(s1.equals("is"))
				s1="was ";
			else
				s1+=" ";
			fos.write(s1.getBytes());
		}
		fis.close();
		fos.close();
		File f1=new File("a.txt");
		f1.delete();
		File f2=new File("temp.txt");
		f2.renameTo(f1);
	}

}
