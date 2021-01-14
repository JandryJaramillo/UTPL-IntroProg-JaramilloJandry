package listanumabundantes2;

import java.util.Scanner;

public class ListaNumAbundantes2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x;  
        System.out.println("Escriba el limite de números: ");
        n = sc.nextInt();
        System.out.print("\nLos números abundantes entre 0 y " + n + " son: ");
        for(x=0;x<n;x++){
                    if (abundante(x)) {
            System.out.println(x);
        }

        }       
    }
    //funcion para determinar si es abundante
    public static boolean abundante(int x){
        boolean esAbundante = false;
        int i,suma;                       
        suma = 0; 
            for (i = 1 ; i < x ; i++){
                if (x % i == 0){
                    suma += i;
                    }
            }
                if (suma > x){
                esAbundante = true;
            }
                        
        return esAbundante; 
    }   
}