package estadnumeros2;

import java.util.Scanner;

public class EstadNumeros2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num,suma,cn,cp,prom,c,promp;
        System.out.println("Ingrese números positivos y negativos (para "
                + "termimar digite 0): ");
        num = 1;
        suma = 0;
        cn = 0;
        cp = 0;
        c = 0;
        prom = 0;
        promp = 0;
        while (num != 0) {
            num = sc.nextInt();
            if (num < 0) {
            cn = cn + 1;
        } else {
              cp = cp + 1;  
            }
            suma = suma + num;
        }
        c = cn + cp;
        prom = suma / c;
        promp = suma / cp;
        
    System.out.println("En total usted ingresó "+c+" números");
    System.out.println("En total usted ingresó "+cp+" números positivos");    
    System.out.println("En total usted ingresó "+cn+" números negativos");
    System.out.println("El promedio de total es de "+prom);
    System.out.println("El promedio de total es de "+promp);
    }
    
}
