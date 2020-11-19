import java.util.Scanner;

public class Bisiesto1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int anio;

		System.out.println("Ingrese el año deseado: ");
		anio = sc.nextInt();

		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
	System.out.println("El año es bisiesto");
else
	System.out.println("El año no es bisiesto");
} }