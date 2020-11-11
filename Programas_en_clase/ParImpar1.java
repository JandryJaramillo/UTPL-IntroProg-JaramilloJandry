import java.util.Scanner;

public class ParImpar1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Ingrese un numero entero: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("ES PAR");
		} else {
			System.out.println("ES IMPAR");
		}
		
	}
}