package decimalabinario3;
import java.util.Scanner;
public class DecimalABinario3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Introduce un numero: ");                                                
        numero = sc.nextInt();
        System.out.print("El número en binario es: " + bin(numero) );
        System.out.println();
    }

    public static int bin(int n){
        int numero, exp, digito;
        int bn;
        exp=0;
        bn=0;
        numero = n;
        while(numero < 0){
        exp=0;
        bn=0;
        }
        while(numero!=0){
                digito = numero % 2;           
                bn = bn + (int)(digito * Math.pow(10, exp));                                                   
                exp++;
                numero = numero/2;
        }
        return bn; 
    }
}