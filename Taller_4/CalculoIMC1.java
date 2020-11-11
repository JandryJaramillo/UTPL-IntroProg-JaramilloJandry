import java.util.Scanner;

public class CalculoIMC1 {
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

		System.out.println("El IMC de " + nombre + " es igual a: " + imc);


	}
}