class A{
	synchronized void display(String msg){
		System.out.print("[ "+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
			System.out.println(" ]");
	}
}
class MyThread implements Runnable{
	Thread t;
	A obj;
	String msg;
	MyThread(String msg, A obj){
		t=new Thread(this);
		this.obj=obj;
		this.msg=msg;
		t.start();
	}
	public void run(){
		obj.display(msg);
	}
}
public class MyThreadTest {
	public static void main(String[] args) {
		A a1=new A();
		MyThread m1= new MyThread("Hello", a1);
		MyThread m2= new MyThread("Bye", a1);
		MyThread m3= new MyThread("Matrix", a1);
		
	}

}
