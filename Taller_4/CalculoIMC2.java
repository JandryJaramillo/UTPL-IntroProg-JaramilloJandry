import java.util.Scanner;

public class CalculoIMC2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		int pesokg;
		float estaturaM;
		double imc;

		System.out.println("CALCULO DEL IMC \n===============");
		System.out.println("Ingrese su nombre:");
		nombre = sc.nextLine();
		System.out.println("Ingrese su peso en Kg:");
		pesokg = sc.nextInt();
		System.out.println("Ingrese su estatura en metros:");
		estaturaM = sc.nextFloat();

		imc = pesokg / (Math.pow(estaturaM,2));

		System.out.println("\nEl IMC de " + nombre + " es igual a: " + imc);
		System.out.println("\nTabla IMC*");
		System.out.println(" _____________________________________ ");
		System.out.println(" | Valor del IMC  | Estado           | ");
		System.out.println(" _____________________________________ ");
		System.out.println(" | Menos de 18.49 | Infra Peso       | ");
		System.out.println(" _____________________________________ ");
		System.out.println(" | 18.50 a 24.99  | Peso Normal      | ");
		System.out.println(" _____________________________________ ");
		System.out.println(" | 25 a 29.99     | Sobre peso       | ");
		System.out.println(" _____________________________________ ");
		System.out.println(" | 30 a 34.99     | Obesidad Leve    | ");
		System.out.println(" _____________________________________ ");
		System.out.println(" | 35 a 39.99     | Obesidad Media   | ");
		System.out.println(" _____________________________________ ");
		System.out.println(" | 40 o mas       | Obesidad Morbida | ");
		System.out.println(" _____________________________________ ");
		System.out.println("\nClasificacion de la OMS de acuerdo con el IMC");

	}
}