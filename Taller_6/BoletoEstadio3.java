import java.util.Scanner;

public class BoletoEstadio3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double lugar,edad,precio,preciof,sexo;
		
		System.out.println("Valor a pagar de un boleto \n=============================");
		System.out.println("Ingrese el lugar de su asiento (Palco=1,Tribuna=2,Preferencia=3,General=4:");
		lugar = sc.nextDouble();
		System.out.println("Ingrese su edad:");
		edad = sc.nextDouble();
		System.out.println("Ingrese su genero (M=1,F=2):");
		sexo = sc.nextDouble();

		if (lugar == 1) {
			precio = 35;
		} else if (lugar == 2) {
			precio = 25;
		} else if (lugar == 3) {
			precio = 20;
		} else {
			precio = 10;
		}
		if (sexo == 1) {
			if (edad < 13) {
				preciof = precio - (precio * 0.40);
			} else {
				preciof = precio;
			} System.out.println("El valor a pagar es de: ",preciof);
			if (sexo == 2) {
				if (edad < 13) {
					preciof = precio - (precio * 0.50);
				} else {
					preciof = precio - (precio * 0.25);
				} System.out.println("El valor a pagar es de: ",preciof);
			}

		}
		}
		 			}
		