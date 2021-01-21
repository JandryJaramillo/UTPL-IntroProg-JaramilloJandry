package maximocomundivisor2;
import java.util.Scanner;
public class MaximoComunDivisor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, residuo, mcd = 0;
System.out.println("Ingrese el primero numero: ");
		a =sc. nextInt ();
		System.out.println("Ingrese el segundo numero");
		b =sc. nextInt ();
                
                System.out.println("El maximo común divisor es: " + maximodivisor(a,b));
        }
       public static int maximodivisor (int a, int b) {
                   int temporal, mcd = 0;
                   while(b != 0){
                       temporal = b;
                       b = a%b; 
                       a = temporal;
                   }
                   
                   System.out.println("El maximo común divisor es: " + mcd);
                   return a;
                   
       }
}