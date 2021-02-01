package estadisticasautos1;

import java.util.Scanner;

public class EstadisticasAutos1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        double n;
        System.out.print("Ingrese el numero de elementos a procesar: ");
        n = sc.nextInt();
        System.out.print("el valor de pi= " + pi(n));
    }

public static double pi(double n) {
    int c;
    double cpi, serie, elemento;
    serie =1;
    elemento = Math.sqrt(1/2);
    for (c=1;c <= n ;c++ ) {
      serie = serie * elemento;
      elemento = Math.sqrt((1/2)+(1/2)*elemento);
    }

    cpi = 2 /serie;
    return cpi;
  }
}