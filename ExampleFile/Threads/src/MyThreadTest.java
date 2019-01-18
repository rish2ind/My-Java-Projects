class MyThreads extends Thread{
	public void run(){
		while(true){
			System.out.println("Hello");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.getStackTrace();
		}
		}
	}
}
public class MyThreadTest {
	
	public static void main(String[] args)throws InterruptedException {
		MyThreads t1=new MyThreads();	
		t1.start();
		while(true){
			System.out.println("Bye");
		
		Thread.sleep(2000);
		}
	}

}
