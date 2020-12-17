package paresimpares1;

import java.util.Scanner;

public class ParesImpares1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N,par,impar;
        
        System.out.print("¿Cuantos números desea ingresar? ");
        N = sc.nextShort();
        
        int numeros[] = new int[N];
        
        for (int i = 0; i <= N - 1; i++) {
            System.out.print("Ingrese el valor "+ (i+1)+ " :");
            numeros[i] = sc.nextInt();
        }
        
        par=0;
        impar=0;
        for (int i = 0; i <= N - 1; i++) {
            if(numeros[i] % 2 == 0) {
                par = (short) (par + 1);
            } else {
                impar = (short) (impar + 1);
            }
        }    
        par = (short)((float)par / N*100);
        impar = (short) ((float)impar / N*100);
        
        System.out.println("El "+par+" % de números son pares y el "+impar+" % son impares");
    }
    
}
