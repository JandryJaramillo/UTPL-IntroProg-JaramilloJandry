package seriepiviete1;

import java.util.Scanner;

public class SeriePiViete1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cpi,serie,elemento;
        int n,c;
        System.out.print("Ingrese el numero de elementos a procesar: ");
        n = sc.nextInt();
        serie =1;
        elemento = Math.sqrt(1/2);
        for (c=1;c <= n ;c++ ) {
          serie = serie * elemento;
          elemento = Math.sqrt(1/2+1/2*elemento);         
        }
        cpi = 2 /serie;
        System.out.print("el valor de pi= " + cpi);
    }
}