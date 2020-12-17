package decimalabinario1;

import java.util.Scanner;

public class DecimalABinario1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,ex,d;
        double b;
        do{
            System.out.println("Introduzca un número entero positivo: ");
            n = sc.nextInt();
        }while(n<0);
        ex = 0;
        b = 0;
        while(n!=0){
            d = n % 2;
            b = b + d * Math.pow(10,ex);
            ex++;
            n = n / 2;
        }
        System.out.println("El número entero a binario es: "+b);
    }
    
}
