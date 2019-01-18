import java.io.*;
public class File1 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileInputStream fis1=null;
		FileOutputStream fos=null;
		try{
			fis=new FileInputStream("a.txt");
			fis1=new FileInputStream("b.txt");
			fos=new FileOutputStream("c.txt");
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
		try {
		byte b[]=new byte[10];
		int cnt;		
			while ((cnt=fis.read(b))!=-1) {
				fos.write(b, 0, cnt);
			}
			while ((cnt=fis1.read(b))!=-1) {
				fos.write(b, 0, cnt);
			}
			fis.close();
			fis1.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
