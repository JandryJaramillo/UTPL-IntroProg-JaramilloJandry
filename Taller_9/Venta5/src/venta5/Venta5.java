
package venta5;

import java.util.Scanner;
public class Venta5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double subtotal, iva ,total;
        System.out.print(" Ingrese la cantidad de articulos: ");
        n = sc.nextInt();
        int cantidad[] = new int[n];
        String item[] = new String[n];
        double pUnitario[] = new double[n];
        double pTotal[] = new double[n];
        subtotal = 0;
        for (int i = 0;i < n ;i++) {
            System.out.print("Ingrese la cantidad del articulo " + (i+1) + " : ");
            cantidad[i] = sc.nextInt();
            System.out.print("Ingrese el nombre del articulo " + (i+1) + " : ");
            item[i] = sc.nextLine();
            System.out.print("Ingrese el precio unitario del articulo " + (i+1) + " : ");
            pUnitario[i] = sc.nextDouble();
            pTotal[i] = pUnitario[i] * cantidad[i];
            subtotal = subtotal + pTotal[i];           
        }
        iva = subtotal * 0.12;
        total = subtotal + iva;
        //Impresion de la factura 
        String leftAlignFormat = "| %-16s | %-16s | %-16s | %-16s |%n";

        System.out.format("+------------------+------------------+------------------+------------------+%n");
        System.out.format("|     Cantidad     |     Itemm         |  Precio Unitario |   Precio Total   |%n");
        System.out.format("+------------------+------------------+------------------+------------------+%n");
        for (int i = 0 ;i < n ;i++) {
            System.out.format(leftAlignFormat, cantidad[i],item[i],pUnitario[i],pTotal[i]); 
        }
        System.out.format("+------------------+------------------+------------------+------------------+%n");
        System.out.format(leftAlignFormat, null,null,"SUBTOTAL",subtotal);
        System.out.format("+------------------+------------------+------------------+------------------+%n");
        System.out.format(leftAlignFormat, null,null,"IVA",iva);
        System.out.format("+------------------+------------------+------------------+------------------+%n");
        System.out.format(leftAlignFormat, null,null,"Total",total);
        System.out.format("+------------------+------------------+------------------+------------------+%n");
    }
}