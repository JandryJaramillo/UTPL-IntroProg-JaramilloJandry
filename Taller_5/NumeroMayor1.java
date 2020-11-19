import java.util.Scanner;

public class NumeroMayor1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Validar orden de números \n=============================");
		System.out.println("Ingrese el primer número entero:");
		n1 = sc.nextInt();
		System.out.println("Ingrese el segúndo número entero:");
		n2 = sc.nextInt();
		System.out.println("Ingrese el tercer número entero:");
		n3 = sc.nextInt();

		if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: " + n1);                                             
            } else {
                System.out.println("el mayor es: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("el mayor es: " + n2);
        } else {
            System.out.println("el mayor es: " + n3);
        }
    }
}