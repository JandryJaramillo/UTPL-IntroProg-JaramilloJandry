package seriepi1;

import java.util.Scanner;

public class SeriePi1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num_pi, val_ele;
        double n,c,x;
        System.out.println("Ingrese el número de elementos de la serie: ");
        n = sc.nextInt();
        num_pi=3;
        x=2;
        c=1;
        while (c<n) {
            c=c+1;
            val_ele = 4/(x*(x+1)*(x+2));
            if((c+1) % 2!=0) {
                num_pi = num_pi + val_ele;
            } else {
                num_pi = num_pi - val_ele;
            }
            x=x+2;
        }
        System.out.println("Valor de Pi obtenido: "+num_pi);
        
    }
    
}
