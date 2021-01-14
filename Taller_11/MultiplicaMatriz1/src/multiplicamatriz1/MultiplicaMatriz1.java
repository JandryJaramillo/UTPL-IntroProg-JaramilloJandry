package multiplicamatriz1;

import java.util.Scanner;

public class MultiplicaMatriz1 {
    private static Scanner sc;
    public static void main(String[] args) {       
        int n ;
        System.out.println("Ingrese la dimencion de la matriz:");
        n = sc.nextInt();
        int[][] matriz = new int[n][n];
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println("\nMatriz multiplicada por: " + num);
        multiplicarEscalar(matriz, num);
        visualizar(matriz);
    }
     
    static void multiplicarEscalar(int[][] pMatriz, int escalar){
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                pMatriz[i][j] *= escalar;
            }
        }
    }
     
    static void inicializar(int[][] pMatriz){
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                pMatriz[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
    }
     
    static void visualizar(int[][] pMatriz){
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                System.out.print("\t" + pMatriz[i][j]);
            }
            System.out.println();
        }
    }
}