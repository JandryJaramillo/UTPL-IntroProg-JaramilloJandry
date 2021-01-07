package vectorsinrepetidos1;

import java.util.Scanner;

public class VectorSinRepetidos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         byte n, c;
        int a;
        
        int elemen[];
        System.out.print("Ingrese el numero de elementos del vector: ");
        n = sc.nextByte();
        elemen = new int[n];
        
        c = 0;
        System.out.print("\nIngrese el elemento " + (c + 1) + " del vector: ");
        elemen[0] = sc.nextInt();
        
        for (c = 1; c < n; c++) {
            System.out.print("Ingrese el elemento " + (c + 1) + " del vector: ");
            elemen[c] = sc.nextInt();
            for (a = c - 1; a >= 0; a--) {
                if (elemen[c] == elemen[a]) {
                    do {
                        System.out.print("Ingrese nuevamente el elemento " + (c + 1) + 
                                " del vector: ");
                        elemen[c] = sc.nextInt();
                        a = c;
                    }while (elemen[c] != elemen[a]);
                    
                }
            }
        }   
        
        System.out.println("\nEl vector final con los elementos no repetidos es: ");
        for (c = 0; c < n; c++) {
            System.out.print(elemen[c] + ", ");
        }
        
        System.out.println(" ");
        
    }
    
}