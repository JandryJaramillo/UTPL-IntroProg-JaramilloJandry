package estadnumeros1;

import java.util.Scanner;

public class EstadNumeros1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,suma,cn;
        System.out.println("Ingrese números positivos y negativos (para "
                + "termimar digite 0): ");
        num = 1;
        suma = 0;
        cn = 0;
        while (num != 0) {
            num = sc.nextInt();
            if (num < 0) {
            cn = cn + 1;
        }
            suma = suma + num;
        }
    System.out.println("En total usted ingresó "+cn+" números negativos");
    System.out.println("La suma de los números ingresados es "+suma);
    }
}
