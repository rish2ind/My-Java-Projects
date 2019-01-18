import java.io.*;
public class File1 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
			fis=new FileInputStream("a.txt");
			fos=new FileOutputStream("b.txt");
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
		try {
			int n;
			while((n=fis.read()) != -1){
				n=Character.toUpperCase(n);
				fos.write(n);
			}
			fis.close();
			fos.close();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
