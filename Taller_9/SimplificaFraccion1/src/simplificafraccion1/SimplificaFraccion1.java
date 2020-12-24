package simplificafraccion1;
import java.util.Scanner;
public class SimplificaFraccion1 {
    public static void main(String[] args) {
        int n,d,ns,ds;
        System.out.println("Escriba el numerador: ");
        n = sc.nextInt();
        System.out.println("Escriba el denominador: ");
        d = sc.nextInt();
        if (n == 0 % 2){
        ns = (n/2)/2;
        ds = (d/2)/2;         
       }else{
            ns = n/3;
            ds = d/3;                    
    }
        System.out.println(ns+"/"+ds);
    }
    }
    

