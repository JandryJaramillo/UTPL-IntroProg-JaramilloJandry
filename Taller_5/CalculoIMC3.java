import java.util.Scanner;

public class CalculoIMC3 {
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
		if (imc < 18.49){
			System.out.println("\nUsted tiene Infra peso");
		} else if (imc > 18.50 & imc < 24.99){
			System.out.println("\nUsted tiene Peso Normal");
		} else if (imc > 25 & imc < 29.99){
			System.out.println("\nUsted tiene Sobre peso");
		} else if (imc > 30 & imc < 34.99){
			System.out.println("\nUsted tiene Obesidad Leve");
		} else if (imc > 35 & imc < 39.99){
			System.out.println("\nUsted tiene Obesidad Media");
		} else if (imc > 40){
			System.out.println("\nUsted tiene Obesidad Morbida");
		}
	}
}