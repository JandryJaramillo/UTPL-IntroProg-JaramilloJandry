/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaimpares1;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ListaImpares1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c, impar;
        System.out.println("Ingrese el número de elementos: ");
        n = sc.nextInt();
        c = 1;
        impar = 1;
        while(c <= n){
            System.out.println(impar);
            impar = impar + 2;
            c = c + 1;
        }
    }
    
}
