import java.util.Scanner;

public class Calculadora1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		        double res = 0;

        String operacion;

        boolean comprobar = false;

 

        do{

           String numero1;

            do {

                System.out.println("Ingrese el primer número de la operación: ");

                numero1 = sc.nextLine();

            } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));

            double nume1 = Double.parseDouble(numero1);

            double n1 = new Double(numero1);

            do {

                System.out.println("¿Que operación desea hacer? (Solo coloque un signo)");

                System.out.println("Teniendo en cuenta que: \n + = sumar \n - = restar \n"

                        + " x = multiplicar \n / = dividir \n % = residuo");

            operacion = sc.nextLine();

                if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") ||

                    operacion.equals("X") || operacion.equals("/") || operacion.equals("%")) {

                    comprobar = true;

                }else { comprobar = false; }

            } while (comprobar != true);

 

            String numero2;

            do {

                System.out.println("Ingrese el segundo número:");

                numero2 = sc.nextLine();

            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));

            double nume2 = Double.parseDouble(numero2);

            double n2 = new Double(numero2);

            do{

                comprobar = true;

                switch(operacion){

                    case "+":

                        res = n1 + n2;

                        break;

                    case "-":

                        res = n1 - n2;

                        break;

                    case "x":

                    case "X":

                        res = n1 * n2;

                        break;

                    case "/":

                        res = n1 / n2;

                        break;

                    case "%":

                        res = n1 % n2;

                        break;

                }

            }while(comprobar != true);

 

            System.out.println("(" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);

            

            }while(comprobar != true);
  }

}