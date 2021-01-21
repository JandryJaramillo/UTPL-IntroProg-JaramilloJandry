package muestraprimos1;
import java.util.Scanner;
public class MuestraPrimos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num;
        int j,i,aux,c;
        System.out.print("Ingrese el numero de elementos del vector: ");
        num = sc.nextByte();
        int ele[] = new int[num];
        for ( i = 0;i< num ;i++ ) {
            System.out.print("\nIngrese el elemento " + (i + 1) + " del vector ");
            ele[i] = sc.nextInt();   
        }
        for (i = 0;i < num; i++ ) {
            for (j = 1;j < num-i ;j++) {
                if (ele[j-1] > ele[j]) {
                    aux = ele[j-1];
                    ele[j-1] = ele[j];
                    ele[j] = aux;   
                }
           }          
        }
        System.out.print("Los números primos encontrados en el vector son: " ); 
        for (i = 0;i<num ;i++ ) {
            c = 0;
            if (i==0) {
                for(j= 1; j <= ele[i]; j++) {
                        if (ele[i]%j == 0) {
                            c = c + 1;
                        }
                    }
                
            }else {
                if (ele[i] != ele[i-1] ) {
                    for(j= 1; j <= ele[i]; j++) {
                        if (ele[i]%j == 0) {
                            c = c + 1;
                        }
                    }     
                  }
            }
            if (c==2) {
                System.out.print(" " + ele[i] );    
            } 
        }
        System.out.println();
    }    
}