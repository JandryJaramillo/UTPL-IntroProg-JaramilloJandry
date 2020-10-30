public class Saludo2 {
	public static void main(String[] args) {
		String nombre;
		System.out.print("Por favor, dime como te llamas: ");
		nombre = System.console().readLine();
		System.out.print("Hola " + nombre);
		System.out.println(", ¡encantado de conocerte!");
	}
}