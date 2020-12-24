package cuentaprimos1;

import java.util.Scanner;

public class CuentaPrimos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros,c,primos,e;
        boolean primo = true;
       primos=0;
        
        System.out.println("Ingrese el número de elementos a comparar: ");
        e = sc.nextInt();
        for (c = 0; c < e; c++) {
            System.out.println("Ingrese un número: ");
            numeros = sc.nextInt();
            
            
            if (numeros % 2 == 0){
                primos = primos + 1; 
            }
            
            
        }
       System.out.println("De los elementos ingresados "+primos+" son primos"); 
    }
    
}
