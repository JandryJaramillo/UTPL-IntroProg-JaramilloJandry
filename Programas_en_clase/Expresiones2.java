public class Expresiones2 {
	public static void main(String[] args) {
		double resultado1;
		double resultado2;
		boolean resultado3;
		boolean resultado4;
		boolean resultado5;
		boolean resultado6;
		boolean resultado7;
		boolean resultado8;

		resultado1 = (((2 * 8) / 2) / 2) - ((22 * 4) / 8) - ((100 + 25) / (Math.pow(5,2)));
		resultado2 = ( 2 * 16 / (Math.pow(2,3)) - 4 ) + 32 - ( 125 / 5 / 5 + 3 );
		resultado3 = 12 >= 12 | 8 > 4 & 22 < 21;
		resultado4 = ( 12 >= 12 | 8 > 4 ) & 22 < 21;
		resultado5 = 1 + 8 * ( 12 - 3 + 9 / ( 9 - (Math.pow(4,5))) + 7 ) > (2.8 * 2) & true;
		resultado6 = ( 100 + (-12) * 4000 + 0 ) <= 0 * 5 * (-12) & ( 4000 / 100 + 0 - 5) < 0 + 5 - 4000 + (-12) * 100;
		resultado7 = true | false & (true | ! (false | true & true));
		resultado8 = false | true & !(0.5 < 0);


		System.out.println("EVALUACION DE EXPRESIONES");
		System.out.println("=========================");
		System.out.println("\nExpresion 1: \n2 * 8 / 2 / 2 - 22 * 4 / 8 - (100 + 25) / 5 ^ 2");
		System.out.println("Resultado:\n " + resultado1);
		System.out.println("\nExpresion 2: \n( 2 * 16 / 2 ^ 3 - 4 ) + 32 - ( 125 / 5 / 5 + 3 )");
		System.out.println("Resultado:\n " + resultado2);
		System.out.println("\nExpresion 3: \n12 >= 12 OR 8 > 4 AND 22 < 21");
		System.out.println("Resultado:\n " + resultado3);
		System.out.println("\nExpresion 4: \n( 12 >= 12 or 8 > 4 ) and 22 < 21");
		System.out.println("Resultado:\n " + resultado4);
		System.out.println("\nExpresion 5: \n1 + 8 * ( 12 – 3 + 9 / ( 9 – 4 ^ 5) + 7 )  > 2,8 * 2  and  3 ^ 4  =  100 – 19");
		System.out.println("Resultado:\n " + resultado5);
		System.out.println("\nExpresion 6: \n( a + b * c + e ) <= e * d * b AND ( c / a + e - d) < e + d – c + b * a");
		System.out.println("Resultado:\n " + resultado6);
		System.out.println("\nExpresion 7: \nV or F and (V or not (F or V and V))");
		System.out.println("Resultado:\n " + resultado7);
		System.out.println("\nExpresion 8: \nFalse OR 1 = (2 ^ 3 / 4) ^ 0 AND NOT(2 ^ -1 < 0)");
		System.out.println("Resultado:\n " + resultado8);


	}
}