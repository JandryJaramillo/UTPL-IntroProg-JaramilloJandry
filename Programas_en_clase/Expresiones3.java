public class Expresiones3 {
	public static void main(String[] args) {
		double resultado1;
		double resultado2;
		double resultado3;
		double resultado4;

		resultado1 = 12800 / 60;
		resultado2 = 50331.456 * 10;
		resultado3 = 32 + 16.6 + 200;
		resultado4 = 248.6 / 32;

		System.out.println("UNIDADES DE ALMACENAMIENTO");
		System.out.println("==========================");
		System.out.println("\nProblema 1:  \n----------- \nSuponga que su conexion de internet tiene una velocidad efectiva de descarga");
		System.out.print("de 5mbps (5 Mbits por segundo). ¿Cuantos minutos tardaria en descargarse una pelicula que pesa 8GB?");
		System.out.println("\nRESPUESTA: En total tardaria " + resultado1 + " minutos");
		System.out.println("\nProblema 2:  \n----------- \nSi en promedio en todo el mundo se envían 456 mil tweets por minuto y cada tweet");
		System.out.print("en promedio pesa 2100 KB. ¿De cuánto espacio de almacenamiento debe disponer la compañía Twitter Inc. para almacenar los tweets que se escribirán en los próximos 10 años?");
		System.out.println("\nRESPUESTA: Twitter requiere un total de " + resultado2 + " TB para almacenar los tweets de los proximos 10 años.");
		System.out.println("\nProblema 3:  \n----------- \nUn fotógrafo utiliza una cámara de alta definición para capturar fotos panorámicas en excursiones a reservas naturales. Para almacenar las fotos lleva Memory Sticks de 32GB cada una");
		System.out.print("¿Cuántos Memory Stick debe llevar para almacenar 500 fotos de alta definición de 64MB cada una, 2000 fotos de mediana definición de 8300KB cada una y 50 videos de 4GB cada uno?");
		System.out.println("\nRESPUESTA: El fotografo debe llevar" + resultado4 + " Memory sicks es decir 8 para poder almacenar los " + resultado3 + " GB de datos.");
		
	}
}