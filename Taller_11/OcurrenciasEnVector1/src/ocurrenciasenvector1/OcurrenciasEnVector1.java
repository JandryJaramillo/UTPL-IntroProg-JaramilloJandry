package ocurrenciasenvector1;

import java.util.Scanner;

public class OcurrenciasEnVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, num , i;
        System.out.print("Ingrese el numero de elementos del vector: ");
        num = sc.nextByte();
        int ele[] = new int[num];
        i = 0;
        System.out.print("\nIngrese el elemento " + (i + 1) + " del vector: ");
        ele[0] = sc.nextInt();
        for ( i = 0;i < num ; i ++ ) {
            ele[i]+=1;
            
        }
        for ( j = 0;i < num ; j ++ ) {
            
        }    
        
        System.out.println("ocurrencias del vector: " + ele[j]);      
    }
    
}