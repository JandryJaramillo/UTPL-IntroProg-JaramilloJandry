package notas2;

import java.util.Scanner;

public class Notas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n,nota,c;
        c=1;
        
        System.out.println("¿Cuántas notas desea registrar?: ");
        n = sc.nextDouble();        
        
        while (c <= n) {
            System.out.println("Ingrese la nota del alumno: ");
            nota = sc.nextDouble();
            
            if (nota < 5) {
                System.out.println("** DEFICIENTE **");
            } else if (nota >= 5 && nota < 7) {
                System.out.println("** REGULAR **");
            } else if (nota >= 7 && nota < 8.5) {
                System.out.println("** BUENO **");
            } else if (nota >= 8.5 && nota <= 10) {
                System.out.println("** MUY BUENO **");
            } 
            c = c + 1;
            
        }
    }
    
}
