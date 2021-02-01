package ordenarnumeros3;

import java.util.Scanner;

public class OrdenarNumeros3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Ingrese el tamanio del vector: ");
        x = sc.nextInt();
        int[] vector = new int[x];
        for (int c = 0; c < x; c++) {
            System.out.print("Ingrese el " + (c + 1) + " numero: ");
            vector[c] = sc.nextInt();
        }
        int cant = 0;

        imprimir(ordenar(vector, cant));
    }


    public static int[] ordenar(int[] vector, int cant) {
        int keeper = 0;
        if (cant < vector.length - 1) {
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i + 1] <= vector[i]) {
                    keeper = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = keeper;
                }
            }
            ordenar(vector, cant += 1);
        }

        return vector;
    }


    public static void imprimir(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.print("\n");
    }
}