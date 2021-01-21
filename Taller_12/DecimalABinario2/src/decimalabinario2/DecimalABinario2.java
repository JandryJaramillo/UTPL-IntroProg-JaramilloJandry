package decimalabinario2;
import java.util.Scanner;
public class DecimalABinario2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Introduce un numero entero positivo: ");                                                
        numero = sc.nextInt();
        System.out.print("El número representado en el sistema binario es: " + binario(numero) );
        System.out.println();
    }

    public static int binario(int n){
        int numero, exp, digito;
        int binario;
        exp=0;
        binario=0;
        numero = n;
        while(numero < 0){
        exp=0;
        binario=0;
        }
        while(numero!=0){
                digito = numero % 2;           
                binario = binario + (int)(digito * Math.pow(10, exp));                                                   
                exp++;
                numero = numero/2;
        }
        return binario; 
    }
}