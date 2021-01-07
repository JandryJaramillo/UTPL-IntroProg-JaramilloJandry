package sumatoriamatriz2;

import java.util.Scanner;

public class SumatoriaMatriz2 {

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
        System.out.println("La matriz que usted ingresó es la siguiente: ");
        System.out.println();
        
        for ( i= 0; i < m.length ; i++ ) {
            for ( j = 0; j < m[i].length; j++ ) {                
                System.out.print("|"+m[i][j]+"|");
                if(j!=m[i].length-1)System.out.print("\n");              
            }
        }    
        for ( i= 0; i <= n - 1 ; i++ ) {
            for ( j = 0; j <=n-1; j++ ) {
                if (i < j) {
                    suma = (int)(suma + m[i][j]); 
                }
            }
        }
        System.out.println();
        System.out.println("\n"+"La sumatoria sobre la diagonal principal: " + suma);
    }        
}