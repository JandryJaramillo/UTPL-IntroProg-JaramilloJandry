import java.util.Scanner;

public class ValidarOrden1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Validar orden de números \n=============================");
		System.out.println("Ingrese el primer número entero:");
		n1 = sc.nextInt();
		System.out.println("Ingrese el segúndo número entero:");
		n2 = sc.nextInt();
		System.out.println("Ingrese el tercer número entero:");
		n3 = sc.nextInt();

		if (n1 > n2 & n2 > n3) {
			System.out.println("Los números están en orden ascendente");
		} else {
			System.out.println("Los números no están en orden ascendente");
			
			}
		}
			}