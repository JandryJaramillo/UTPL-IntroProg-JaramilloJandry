package seriepi2;

import java.util.Scanner;

public class SeriePi2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma, valpi;
        double n,i,c;
        System.out.println("Ingrese un número entero: ");
        n = sc.nextInt();
        suma = 0;
        c=1;
        i=0;
        while (c<=n) {
            c=c+1;
            valpi = (Math.pow(-1,i))/(2*i + 1);
            suma = suma + valpi;
            i = i + 1;
        }
        suma = suma * 4;
        System.out.println("Valor de Pi obtenido: "+ suma);
    }
    
}
