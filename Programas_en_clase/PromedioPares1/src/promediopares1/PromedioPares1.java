/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promediopares1;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class PromedioPares1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c, suma, prom, par;
        System.out.println("Ingrese el número de elementos: ");
        n = sc.nextInt();
        c = 1;
        par = 0;
        suma = 0;
        while(c <= n){
            par = par + 2;
            suma = suma + par;
            c = c + 1;
    }
            prom = suma / n;
            System.out.println("El promedio de los numeros pares es de: " + prom);
}
}
