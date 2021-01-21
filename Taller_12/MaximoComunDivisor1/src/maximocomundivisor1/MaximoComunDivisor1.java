package maximocomundivisor1;
import java.util.Scanner;
public class MaximoComunDivisor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r,n,m;
        System.out.print("Ingrese el valor de M: ");
        m = sc.nextDouble();
        System.out.print("Ingrese el valor de N: ");
        n = sc.nextDouble();
        r = m%n;
        while (r != 0 ){
            m = n;
            n = r;
            r = m % n;
        }
        System.out.print("MCD: " + n );
    }    
}