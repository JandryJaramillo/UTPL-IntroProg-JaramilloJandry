package listanumabundantes1;

import java.util.Scanner;

public class ListaNumAbundantes1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,c,a,i,suma;
  
        System.out.println("Escriba un número entero: ");
        n = sc.nextInt();
        a = 12;
        suma = 0;
                
        for (c = 12 ;c < n; c = c + 1){
            for (i = 1 ; i < c ; i++){
                if (c % i == 0){
                    suma = suma + i;
                    if (suma > c){
                        System.out.println("El número "+c+" es abundante");
                    }
                }
            }
        }
}
}
   