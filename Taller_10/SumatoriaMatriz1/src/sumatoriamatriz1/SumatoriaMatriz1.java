package sumatoriamatriz1;

import java.util.Scanner;

public class SumatoriaMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n,i,j;
        int suma;
        System.out.print("Ingrese la dimencion de la matriz: ");
        n = sc.nextShort();
        suma = 0;
        int m[][]= new int[n][n];
        System.out.println("ingrese los elementos de la matriz");
        for ( i = 0;i <= n -1 ; i++ ) {
            for ( j = 0;j <= n -1 ;j++ ) { 
                System.out.print("Ingrese elemento de la posicion [" + (i + 1) + "," + (j + 1) + " ] :");
                m[i][j]=sc.nextInt();
            }
            
        }
        for ( i= 0; i <= n - 1 ; i++ ) {
            for ( j = 0; j <=n-1; j++ ) {
                if (i < j) {
                    suma = (int)(suma + m[i][j]); 
                }
            }
        }
        System.out.println("La sumatoria sobre la diagonal principal: " + suma);
    }
    
}