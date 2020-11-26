/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaimpares2;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ListaImpares2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c;
        System.out.println("Ingrese el número de elementos: ");
        n = sc.nextInt();
        c = 1;
        while(c > 0 & c <= n){
            System.out.println(c);
            c = c + 2;
        }
    }
    
}
