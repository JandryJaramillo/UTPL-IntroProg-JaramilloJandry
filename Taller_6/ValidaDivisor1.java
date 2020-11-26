import java.util.Scanner;

public class ValidaDivisor1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int val1, val2;
		
		System.out.println("Validar si es divisor \n=============================");
		System.out.println("Ingrese el número mayor:");
		val1 = sc.nextInt();
		System.out.println("Ingrese el número menor:");
		val2 = sc.nextInt();

		if (val1 % val2 == 0) {
			System.out.println("El número menor si es divisor");
		} else {
			System.out.println("El número menor no es divisor");
		}
		 			}
		}
			