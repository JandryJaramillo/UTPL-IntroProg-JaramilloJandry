import java.util.Scanner;

public class ConvertidorTemp1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double grados,temp;
		Boolean unidad,c,f;
				
		System.out.println("Convertidor de temperatura \n=============================");
		System.out.println("Ingrese los grados de temperatura:");
		grados = sc.nextDouble();
		System.out.println("Ingrese la unidad de temperatura (c o f):");
		unidad = sc.nextBoolean();

		c=true;
		f=false;

		if (unidad = true) {
			temp = (grados * 9/5) + 32;
			System.out.println("La temperatura en grados Fahrenheit es ",temp);
		} else {
			temp = (grados - 32) * 5/9;
			System.out.println("La temperatura en grados Celsius es ",temp);
		}
		 			}
		}