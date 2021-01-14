package paresenvector1;

import java.util.Scanner;

public class ParesEnVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n,c;
        int a,p=0;        
        int elemen[];
        System.out.print("Ingrese el numero de elementos del vector: ");
        n = sc.nextByte();
        elemen = new int[n];    
        //ingreso de datos
        for (c = 0; c < n; c++) {
            System.out.print("Ingrese el elemento " + (c + 1) + " del vector: ");
            elemen[c] = sc.nextInt();
        }   
        //llamar a la funcion y respuesta
        System.out.println("\nLos elementos del vector que son números pares son: ");
        for (c = 0; c < (n-1); c++) {
            if(par(c)){
                p=p+1;
            }
        }
        System.out.println(p);
    }
    //funcion para determinar si es par
    public static boolean par(int c){
        boolean esPar = false;        
        if (c % 2 == 0){
            esPar = true;
        }                        
        return esPar; 
    }     
}