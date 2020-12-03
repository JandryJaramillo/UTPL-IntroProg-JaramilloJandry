package venta2;

import java.util.Scanner;

public class Venta2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,c;
        double iva,precio,suma,total;
        c = 1;
        suma = 0;
                        
        System.out.println("Ingrese el número de artículos: ");
        n = sc.nextInt();
        
        while (c <= n) {
            System.out.println("Ingrese el precio del artículo: ");
            precio = sc.nextDouble();
            
            suma = suma + precio;
            c = c + 1;
        }
        iva = suma * 0.12;
        total = suma + iva;
        System.out.println("El precio total a pagar incluido IVA es de: "+total+" USD");
        
    }
    
}
