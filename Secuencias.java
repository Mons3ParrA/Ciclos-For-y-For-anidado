import java.util.Scanner;
public class Secuencias{
	public static void main(String[]args){
		Scanner leer = new Scanner(System.in);
		int i, base, pot, re=1;
		System.out.println("Ingrese la base: ");
		base = leer.nextInt();
		System.out.println("Ingrese la potencia: ");
		pot = leer.nextInt();

		for (i=1; i<pot; i++){
			re = re*base;
		}
		System.out.println(base + " elevado a la " + pot + " es: " + re);
	}
}