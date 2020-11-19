import java.util.Scanner;

public class DuracionDescarga1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double gb, mbps, tiempo, mb, mbits, horas, minutos, segundos;
		
		System.out.println("Duración de descarga de un archivo \n=============================");
		System.out.println("Ingrese el tamaño del archivo en GB:");
		gb = sc.nextDouble();
		System.out.println("Ingrese la velocidad de descarga en Mbps:");
		mbps = sc.nextInt();
		
		mb = gb * 1024;
		mbits = mb * 8;
		tiempo = mbits / mbps;

		horas = tiempo % 3600;
        minutos = horas % 60;
        segundos = minutos % 60;

        System.out.println("El tiempo de descarga del archivo son:" + horas + " horas,"
                + minutos + " minutos, "
                + segundos + " segundos");
			}
		}
			