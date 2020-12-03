package primo2;

import java.util.Scanner;

public class Primo2 {

    public static void main(String[] args, boolean True) {
        Scanner sc = new Scanner(System.in);
        int n,c;
        boolean esPrimo;
        
        System.out.println("Ingrese un número entero: ");
        n = sc.nextInt();
        
        esPrimo = True;
        c = n - 1;
        while (c >= 2) {
            if (n % c == 0) {
                esPrimo = True;
                c = 1;
            } else {
                c = c - 1;
            }
        }
    if (esPrimo == True) {
        System.out.println("El número " + n + " es primo.");
    } else {
        System.out.println("El número " + n + " no es primo.");
    }
    }
    
} 
