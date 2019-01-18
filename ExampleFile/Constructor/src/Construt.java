	
class Construt {
		private int x;
		private float y;
		Construt(){
			x=5;
			y=5;
		}
		Construt(int n){
			x=n;
			y=n;
		}
		Construt(int n, float m){
			x=n;
			y=m;
		}
		void display(){
			System.out.println("The value of x and y is : "+x +", " +y);
		}
	public static void main(String[] args) {
			Construt c=new Construt(6, 5.5f);
			c.display();
	}

}
