package sueldomasalto1;

import java.util.Scanner;

public class SueldoMasAlto1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,c;        
        double sueldoMayor;
        String nombreMayor,nombre2=null;
        
        
        System.out.println("Ingrese el número de empleados a comparar: ");
        n = sc.nextInt();
        String[] nombres = new String[n];
        double[] sueldo = new double[n];
        c=0;
                      
        System.out.print("Ingrese el sueldo del empleado "+(c+1)+" : ");
        sueldo[c]= sc.nextDouble();
        System.out.print("Ingrese el nombre: " );
        nombres[c]=sc.nextLine();  
        
        sueldoMayor = sueldo[c];
        nombreMayor = nombres[c];
        
        for (c = 1; c < nombres.length; c++) {
            sc.nextLine(); 
            
            System.out.print("Ingrese el nombre: " );
            nombres[c]=sc.nextLine();
            System.out.print("Ingrese el sueldo: ");
            sueldo[c]= sc.nextDouble();
              
            
            if (sueldo[c] > sueldoMayor) {
                sueldoMayor = sueldo[c];
                nombreMayor = nombres[c];
            }if (sueldo[c]==sueldoMayor){
                nombre2 = nombres[c];
            } 
            
        }
        
        System.out.println("Empleado con mayor sueldo: " + nombreMayor+" , "+nombre2);                                         
        System.out.println("Sueldo: " + sueldoMayor);
        
    }
}

    