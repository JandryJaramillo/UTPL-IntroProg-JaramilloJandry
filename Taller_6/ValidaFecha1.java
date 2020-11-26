import java.util.Scanner;

public class ValidaFecha1 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int m,d,dmax;
		
		System.out.println("Ingrese el año: ");
		a = sc.nextInt();
		System.out.println("Ingrese el mes: ");
		m = sc.nextInt();
		System.out.println("Ingrese el dia: ");
		d = sc.nextInt();

		if (a < 1970 || a > 2020 || m <= 0 || m > 12 || d < 1) {
			System.out.println("Fecha incorrecta");
		} else {
			dmax = 31;
			if ( m == 2) {
				if (a % 4 == 0) {
					dmax = 29;
					} else {
						dmax = 28;
					}
			if (m==4 || m==6 || m==9 || m==11) {
				dmax = 30;
			}		
			}
			if (d>dmax) {
				System.out.println("Fecha incorrecta");
			} else {
				System.out.println("Fecha correcta");
			}
		}
	}
}