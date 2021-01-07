package ordenarnumeros1;

import java.util.Scanner;

public class OrdenarNumeros1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,aux,n,m ,lim;
        System.out.print("Ingrese el tamaño del vector: ");
        n = sc.nextInt();
        int vector[]= new int[n];
        for (i = 1; i <= n; i= i + 1) {
            System.out.print("Ingrese el elemento: " + i + ":");
            vector[i] = sc.nextInt();
        }
        for (i = 0;i <= n-1;i = i++ ) {
            for (j = 0;j <= n-1 ;j++) {
                if (vector[i] > vector[i+1]) {
                    aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i+1] = aux;   
                }
           }          
        }
       System.out.print("La Lista Ordenada: ");
       for (i = 1; i <= n; i= i + 1) {
        System.out.println(vector[i]);      
        } 
    }
    
}