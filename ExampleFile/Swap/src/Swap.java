
public class Swap {
			static int swap(int x, int y){
				int t;
				t=x;
				x=y;
				y=t;
				return t;
			}
			public static void main(String[] args){
				int a=4, b=5, ans;
				ans= swap(a, b);
				System.out.println("After swap :" + ans);
			
	}

}
