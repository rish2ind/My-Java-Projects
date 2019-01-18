import java.net.*;
public class Net {
		public static void main(String args[]) throws UnknownHostException{
			
			//For Finding IP Address using Name
			InetAddress inet= InetAddress.getByName("Admin-PC"); 
			System.out.println(inet.getHostAddress());
			
			//For Finding Domain using IP Address
			byte b[]={(byte)192, (byte)168, 43, 50};
			InetAddress inet2= InetAddress.getByAddress(b);
			System.out.println(inet2.getHostName());
			
			//Finding both IP address and Domain using LocalHost
			InetAddress inet3= InetAddress.getLocalHost();
			System.out.println(inet3);
			
			InetAddress inet4[]= InetAddress.getAllByName("www.google.com");
			for (int i = 0; i < inet4.length; i++) {
				byte b2[]=inet4[i].getAddress();
				for (int j = 0; j < 4; j++) {
					System.out.print((b2[j] & 255)+ ".");
				}
				System.out.println();
			}
		}
}
