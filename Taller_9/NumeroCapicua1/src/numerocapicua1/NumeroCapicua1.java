package numerocapicua1;

import java.util.Scanner;
public class NumeroCapicua1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, aux, inverso = 0, cifra;
        do {
            System.out.print("Ingrese un número mayor a 10: ");                                                 
            n = sc.nextInt();
        } while (n < 10);
       
        aux = n;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
    
        if(n == inverso){
            System.out.println("El numero " + n + " Es capicua");
        }else{
            System.out.println("El numero" + n + " No es capicua");
        }
    }
}