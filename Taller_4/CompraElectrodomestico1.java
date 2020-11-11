import java.util.Scanner;

public class CompraElectrodomestico1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int pesolb;
		float precio;
		float km;
		double iva;
		double envio;
		double preiva;

		System.out.println("FACTURACION DE UN ELECTRODOMESTICO \n=================================");
		System.out.println("Ingrese el precio del electrodomestico:");
		precio = sc.nextFloat();
		System.out.println("Ingrese su peso en libras:");
		pesolb = sc.nextInt();
		System.out.println("Ingrese la distancia al domicilio en Km:");
		km = sc.nextFloat();

		iva = precio * 0.12;
		preiva = iva + precio;
		envio = preiva + (pesolb * 0.01) + (km * 0.01); 

		System.out.println("Total a pagar con IVA y entrega a domicilio: " + envio + " USD.");

	}
}