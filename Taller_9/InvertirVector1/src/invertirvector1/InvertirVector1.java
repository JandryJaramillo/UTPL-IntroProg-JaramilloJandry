
package invertirvector1;

import java.util.Scanner;

public class InvertirVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
        
        System.out.println("¿Cuántos números va a ingresar?");
        n = sc.nextInt();
        int[] number = new int[n];
        
        for(i=0;i<n;i=i+1){
            System.out.println("Ingrese un número: ");
            number[i] = sc.nextInt();
        }
    for(i=n;i<1;i=i-1){
    System.out.println(number[i]);
           
    }
    }
    
}
