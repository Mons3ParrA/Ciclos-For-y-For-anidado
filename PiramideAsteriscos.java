public class PiramideAsteriscos{
	public static void main(String args[]){
		int n=10;
		
		for(int i=1; i<=n; i++){
		int espacios = n-i;
		int asteriscos = 2*i-1;
				
			for(int j=1; j<=espacios; j++){
			System.out.print(" ");
			}
			for(int j=1; j<=asteriscos; j++){
			System.out.print("*");
			}
			System.out.println();
		}
	}
}