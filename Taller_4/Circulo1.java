import java.util.Scanner;

public class Circulo1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		float radio;
		float diametro;
		double area;
		double area2;

		System.out.println("Circunferencia y area de un circulo \n=============================");
		System.out.println("Ingrese el diametro del circulo en cm:");
		diametro = sc.nextFloat();
		
		radio = diametro / 2;
		area = 3.1416 * (Math.pow(radio,2));
		area2 = area * 100;

		System.out.println("El area de un circulo en cm es de " + area + " y en cm2 es igual a: " + area2);
		

	}
}