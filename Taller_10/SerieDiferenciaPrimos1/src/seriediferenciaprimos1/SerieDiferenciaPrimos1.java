package seriediferenciaprimos1;

import java.util.Scanner;

public class SerieDiferenciaPrimos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,c,k,j=0,s=2,m,aux=1,res;
        boolean band,a;
        System.out.println("Ingrese el numero de datos a comparar: ");
        n = sc.nextInt();
        
        System.out.println("Los "+n+" primeros numeros de la serie son: ");

            for(int x=0; x<= n; x++){
                    a = false;
                    while (!a){
                    m=2;
                    band = true;
                    while ((band)&&(m<s)){
                        if(s%m==0){
                            band = false;
                        }else{
                            m=m+1;
                        }
                    }
                        if(band){
                            
                            res=s-aux;
                            aux=s;
                            System.out.println(res);
                            j=j+1;
                            a = true;
                        }
                        s=s+1;
                    }        
                }
            }
            
        }