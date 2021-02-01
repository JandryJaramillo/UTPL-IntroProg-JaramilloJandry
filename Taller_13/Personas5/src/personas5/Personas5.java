package personas5;

import java.io.*;
import java.util.*;

public class Personas5 {
    // Programa que lee arcivo de datos personales y calcula 
    // la edadpromedio solo de mujere
    public static void main(String[] args) {
        try {
            File archivo = new File("C:\\Users\\pc\\IntroProgramación\\UTPL-IntroProg-JaramilloJandry\\Taller_13\\Personas.txt");
            Scanner f = new Scanner(archivo);
            String[] persona;
            ArrayList<String> nombres = new ArrayList();
            ArrayList<String> generos = new ArrayList();
            ArrayList<Integer> edades = new ArrayList();
            while (f.hasNextLine()) {
                persona = f.nextLine().split(",");
                nombres.add(persona[0]);
                generos.add(persona[1]);
                int edad = Integer.parseInt(persona[2].replace(" ",""));
                if (edad > 0) {
                    edades.add(edad);  
                }else {
                    throw new Exception("edad negativa: " + edad);
                }
            }
            f.close();
            int suma = 0, cf = 0;
            for (int i = 0; i <= edades.size() - 1; i++) {
                if (generos.get(i).equals("F")) {
                    suma += edades.get(i);
                    cf++;
                }
            }
            double media = (double) suma / cf;
            System.out.println("Promedio: " + media);
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado\n ERROR:\n" + e.toString());
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

}