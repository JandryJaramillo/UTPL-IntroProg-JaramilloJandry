package piramideinvertida1;

import java.util.Scanner;

public class PiramideInvertida1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short pira, c;
        int i,j,a;
        System.out.println("Piramide Invertida");
        System.out.print("Ingrese la altura: \n ");
        pira = sc.nextShort();
        c = pira;
        System.out.println("");
        for ( i = 1;i <= pira ; i++ ) {
            for ( j = 1; j < i ; j++ ) {
                System.out.print(" ");
                
            }
            for ( a = 1;a <=(c*2) -1 ; a++ ) {
                System.out.print("*");
                
            }
            c = (short) (c-1);
            System.out.println("");
            
        }
    }
    
}