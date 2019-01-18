
class MathodOverloading {
				int sum(int x, int y){
				System.out.println("Hello");
				return(x+y);
			}
			float sum(int x, int y, float z){
				return(x+y+z);
			}
	public static void main(String[] args) {
			MathodOverloading a=new MathodOverloading();
			System.out.println(a.sum(5, 6, 7.7f));
			
	}

}
