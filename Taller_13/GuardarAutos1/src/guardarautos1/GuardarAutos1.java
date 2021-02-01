package guardarautos1;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class GuardarAutos1 {
 static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String[]> autos = new ArrayList<String[]>();

        String[] atributosAuto = {"Placa", "Marca", "Año", "Litros"};

        System.out.println("Ingrese la cantidad de carros a revisar: ");
        int cantidad = read.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            autos.add(datosAuto(i));
        }

        try {
            File f = new File("autos" + (int) (Math.random() * 10) + ".txt");
            FileWriter file = new FileWriter(f);
            for (int i = 0; i < cantidad; i++) {
                file.write("\n=====Auto " + (i + 1) + "=====\n");
                String[] auto = autos.get(i);
                int index = -1;
                for (String linea : auto) {
                    file.write(atributosAuto[index += 1] + ": " + linea + "\n");
                }

                System.out.println("");
            }

            System.out.println("El archivo se guardo con el nombre de: " + f.getName());
            System.out.println("En la ruta: " + f.getPath());
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static String[] datosAuto(int AutoID) {
        String datos[] = new String[4];

        System.out.println("Ingrese los datos del auto " + AutoID);
        System.out.println("Ingrese la placa del auto: ");
        datos[0] = read.next().toUpperCase();
        System.out.println("Ingrese la marca del auto: ");
        datos[1] = read.next();
        System.out.println("Ingrese el año del auto: ");
        datos[2] = read.next();
        System.out.println("Ingrese los litros del auto: ");
        datos[3] = read.next();
        System.out.println("=================");

        return datos;
    }

}