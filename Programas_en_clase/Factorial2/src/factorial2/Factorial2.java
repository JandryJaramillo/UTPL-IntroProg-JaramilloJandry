package factorial2;

import java.util.Scanner;

public class Factorial2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int N,factorial,c;
        
        do {
            System.out.print("Ingrese un número entero positivo: ");
            N = sc.nextInt();
        } while (N<0);
               
        factorial = 1;
        for (c=2; c<=N; c=c+1) {
            factorial = factorial * c;
        }
        System.out.println("El factorial de "+N+" es "+factorial);
    }
    
}
