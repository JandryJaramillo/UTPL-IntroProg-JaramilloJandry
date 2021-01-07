package analisistemperaturas1;

import java.util.Scanner;

public class AnalisisTemperaturas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp,sum=0,med,temp2,temc=0;
        int[] temperatura = new int[7];
        for(int i=0;i<=7-1;i++){
            System.out.println("Ingrese la temperatura C° del dia "+(i+1)+" : ");
            temperatura[i] = sc.nextInt();            
        }
        //Cálculo de la media
        int media = temperatura[0];
        for (int i = 0; i <= 7-1; i++) {
            sum = sum + temperatura[i];
        }
        med = sum/7;
        System.out.println("La temperatura media es de : "+med+" grados C°");
        
        //Temperatura más baja
        int baja = temperatura[0];
        for (int i = 0; i <= 7-1; i++) {
            if (temperatura[i] < baja) {
                baja = temperatura[i];
            }
        }
        System.out.println("La temperatura mas baja es de : "+baja+" grados C°");
        
        //Temperatura más alta
        int alta = temperatura[0];
        for (int i = 0; i <= 7-1; i++) {
            if (temperatura[i] > alta) {
                alta = temperatura[i];
            }
        }
        System.out.println("La temperatura mas alta es de : "+alta+" grados C°");
        
        //Temperatura cercana a ingresada por teclado
        int mediar = temperatura[0];                
        System.out.println("Ingrese una temperatura en grados C°: ");
        temp2 = sc.nextInt();
        for (int i = 0; i <= 7-1; i++) {
            if (temperatura[i] > temp2 || temperatura[i] < temp2){
                temc = temperatura[i];
            }          
            }      
        System.out.println("La temperatura mas cercana es de : "+temc+" grados C°");

        
    }
    
}
