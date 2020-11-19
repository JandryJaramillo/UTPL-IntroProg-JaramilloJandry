import java.util.Scanner;

public class CuotaFija1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int plazo;
		double monto, interes_anual, interes_mensual;
		double cuota_parcial, seguro_des, cuota_final;

		System.out.println("Cálculo de la cuota fija de un préstamo \n=============================");
		System.out.println("Ingrese monto total del préstamo:");
		monto = sc.nextDouble();
		System.out.println("Ingrese plazo para pago de préstamo (en meses):");
		plazo = sc.nextInt();
		System.out.println("Ingrese el % de la taza de interés anual:");
		interes_anual = sc.nextDouble();
		
		if (plazo < 3) {
			System.out.println("Error, el plazo no puede ser inferior a 3");
		} else {
			if (plazo > 36 & monto < 20000) {
				System.out.println("Error, el plazo no puede ser mayor a 36 en prestamos inferiores a USD 20000");
			} else {
				interes_mensual = interes_anual / 12 / 100;
				cuota_parcial = monto * ((interes_mensual * (Math.pow(1 + interes_mensual,plazo)))/ (Math.pow(1 + interes_mensual,plazo - 1)));
				seguro_des = cuota_parcial * 0.05 / 100;
				cuota_final = cuota_parcial + seguro_des;
				System.out.println("LA CUOTA MENSUAL A PAGAR ASCIENDE A: " + cuota_final);
				} 
			}
		}
			}