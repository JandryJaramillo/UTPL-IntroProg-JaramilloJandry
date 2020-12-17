package edadexacta1;

import java.util.Scanner;

public class EdadExacta1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_na,a_ac,m_na,m_ac,d_na,d_ac,edad_a,edad_m,edad_d;
        
        System.out.println("Ingrese el año de nacimiento: ");
        a_na = sc.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        m_na = sc.nextInt();
        System.out.println("Ingrese el dia de nacimiento: ");
        d_na = sc.nextInt();
        System.out.println("Ingrese el año actual: ");
        a_ac = sc.nextInt();
        System.out.println("Ingrese el mes actual: ");
        m_ac = sc.nextInt();
        System.out.println("Ingrese el dia actual: ");
        d_ac = sc.nextInt();
        
        if(d_ac<d_na){
            d_ac = d_ac + 30;
            m_ac = m_ac - 1;
        }
        if(m_ac<m_na){
            m_ac = m_ac + 12;
            a_ac = a_ac - 1;
        }
        if(a_ac<a_na){
          System.out.println("Error con la fecha ingresada");  
        }else{
            edad_a = a_ac - a_na;
            edad_m = m_ac - m_na;
            edad_d = d_ac - d_na;
            System.out.println("Su edad exacta es: "+edad_a+" años "+edad_m+" meses "+edad_d+" dias.");
        }
    }
    
}
