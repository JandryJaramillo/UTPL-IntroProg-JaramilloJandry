import java.util.Scanner;

public class BoletoAutobus1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double km,precio,dia,precio_total,precio_final;
		
		System.out.println("BOLETO DE AUTOBUS \n=============================");
		System.out.println("Ingrese el recorrido en KM:");
		km = sc.nextDouble();
		System.out.println("Seleccione el tipo de día (Laboral (1) o Festivo (2)):");
		dia = sc.nextDouble();

		precio = km * 0.05;

		if (km > 80) {
			precio_total = precio - (precio * 0.15);
		} else {
			precio_total = precio;
		} if (dia == 1) {
			precio_final = precio_total - (precio_total * 0.05);
		} else {
			precio_final = precio_total;
		}
		
		System.out.println("El precio final del boleto en USD es: ",precio_final);
		 			}
		}
			