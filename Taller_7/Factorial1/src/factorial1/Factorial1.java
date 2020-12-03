package factorial1;

import java.util.Scanner;

public class Factorial1 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double factorial,n;
      factorial = 1;
      
      System.out.println("Ingrese un número entero: ");
      n = sc.nextDouble();
      
      while ( n !=0 ) {
        factorial=factorial*n;
        n--;
      }
      System.out.println(factorial);
    }
    
}
