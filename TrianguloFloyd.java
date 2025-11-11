import java.util.Scanner;
public class TrianguloFloyd{
	public static void main(String[]args){
	Scanner leer = new Scanner(System.in);
	int i, n, j, num=0;
	System.out.println("Ingresa la altura de triangulo: ");
	n=leer.nextInt();
		
		for(i=1; i<=n; i++){
		for(j=1; j<=i; j++){
			System.out.print(num + " ");
			num++;
		}
			System.out.println();
		}
		}
}





		