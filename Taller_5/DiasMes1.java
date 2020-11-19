import java.util.Scanner;

public class DiasMes1{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int mes;

		System.out.println("Número de dias de cada mes \n=============================");
		System.out.println("Ingrese el mes (1 - 12):");
		mes = sc.nextInt();
		
		if (mes > 12 & mes < 1) {
            System.out.println("Número de mes incorrecto");
		    } else if (mes > 0 & mes < 2) {
            System.out.println("El mes tiene 31 días");
            } else if (mes > 2 & mes < 4) {
            System.out.println("El mes tiene 31 días");
            } else if (mes > 4 & mes < 6) {
            System.out.println("El mes tiene 31 días");
            } else if (mes > 6 & mes < 9) {
            System.out.println("El mes tiene 31 días");
            } else if (mes > 9 & mes < 11) {
            System.out.println("El mes tiene 31 días");
            } else if (mes > 11 & mes < 13) {
            System.out.println("El mes tiene 31 días");                                                  
            } else if (mes > 3 & mes < 5) {
            System.out.println("El mes tiene 30 días");
            } else if (mes > 5 & mes < 7) {
            System.out.println("El mes tiene 30 días");
            } else if (mes > 8 & mes < 10) {
            System.out.println("El mes tiene 30 días");
            } else if (mes > 10 & mes < 12) {
            System.out.println("El mes tiene 30 días");   
            }else if (mes > 1 & mes < 3){
        	System.out.println("El mes tiene 28 días");
            } else {
            System.out.println("Número de mes incorrecto");	
        }
        }
    }

            