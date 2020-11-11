import java.util.Scanner;

public class ConvierteMinutosDias1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int minutost, dias, horas, minutos;
		
        System.out.println("CONVERSION DE MINUTOS A DIAS,HORAS Y MINUTOS \n============================================");
		System.out.println("Ingrese los minutos deseados:");
		minutost = sc.nextInt();

		dias = minutost/24/60;
		horas = minutost % 24;
		minutos = minutost % 60;
		
		if (minutost <= 1440) {
			dias = 0;
		} else {
			dias = minutost/24/60;
		}

		System.out.println(dias + " dias, " + horas + " horas, " + minutos + " minutos");
		

	}
}