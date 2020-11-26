import java.util.Scanner;

public class EstadViaje1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double km, horas, galones, lt, rendimiento, velocidad, m, seg;
		
		System.out.println("ESTADISTICAS DE VIAJE \n=============================");
		System.out.println("Ingrese los Km recorridos:");
		km = sc.nextDouble();
	    System.out.println("Ingrese la duración del viaje en horas:");
		horas = sc.nextDouble();
		System.out.println("Ingrese los galones consumidos:");
		galones = sc.nextDouble();
		
		lt = galones * 3.78541;
		rendimiento = km / lt;
		m = km * 1000;
		seg = horas * 3600;
		velocidad = m / seg;

        System.out.println("El rendimiento del auto en km/lt fue de: " + rendimiento);
        System.out.println("La velocidad media del viaje en m/s fue de : " + velocidad);
			}
		}
			