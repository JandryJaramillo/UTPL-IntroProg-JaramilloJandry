package cuentacifras1;

import java.util.Scanner;

public class CuentaCifras1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant,tmp,n;
        
        System.out.println("Ingrese un número entero: ");
        n = sc.nextInt();
        cant = 0;
        tmp = n;
        
        while (tmp>0){
            tmp = tmp /10;
            cant++;
        }
        System.out.println(n+" tiene "+cant+" cifras.");
    }
    
}
