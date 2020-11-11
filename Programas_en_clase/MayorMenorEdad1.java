import java.util.Scanner;

public class MayorMenorEdad1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int nacimiento, actualidad, edad, mayormenor;
		
		System.out.println("Ingrese su año de nacimiento: ");
		nacimiento = sc.nextInt();
		System.out.println("Ingrese el año actual: ");
		actualidad = sc.nextInt();
		
		edad = actualidad -	nacimiento;

		if (edad < 18) {
			System.out.println("Usted es menor de edad.");
		} else {
			System.out.println("Usted es mayor de edad.");
		}
		
		
	}
}