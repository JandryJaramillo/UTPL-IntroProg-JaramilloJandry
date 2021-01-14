package rangomedio1;

import java.util.Scanner;

public class RangoMedio1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n,i,arriba,abajo;
       float sum,may,men,x,rm,rango;
       abajo=0;
       may=0;       
       sum=0;
       arriba=0;
       //ingreso de cantidad
       System.out.println("Ingrese la cantidad de numeros a comparar: ");
       n = sc.nextInt();
       float cantidad[]= new float[n];
       //ingreso de datos
       for (i = 0; i <= (n-1); i = i + 1) {
            System.out.print("Ingrese el numero: " + (i+1) + ":");
            cantidad[i] = sc.nextFloat();
        }
       //valor mas alto
       for (i = 0; i <= (n-1); i = i + 1) {
            if (may < cantidad[i]){
                may = cantidad[i];
            }
        }
       men = may;
       //valor mas bajo
       for (i = 0; i <=(n-1); i = i + 1) {
            if (men > cantidad[i]){
                men = cantidad[i];
            }
        }
       //rango
       rango=may-men;
       //rango medio
       for (x = men; x <= may; x = x + 1) {
           sum=sum+x;
        }
       rm=sum/(rango+1);
       //elementos por arriba de RM
       for (i = 0; i <= (n-1); i = i + 1) {
            if (cantidad[i]>rm){
                arriba=arriba+1;
            }
        }
       //elementos por debajo de RM
       for (i = 0; i <= (n-1); i = i + 1) {
            if (cantidad[i]<rm){
                abajo=abajo+1;
            }
        }
       //resultados
       System.out.println("RESULTADOS");
       System.out.println("==========");
       System.out.println();
       System.out.println("Rango: "+rango);
       System.out.println("Rango medio (RM): "+rm);
       System.out.println("# Elementos por arriba del RM: "+arriba);
       System.out.println("# Elementos inferiores al RM: "+abajo);       
    }    
}