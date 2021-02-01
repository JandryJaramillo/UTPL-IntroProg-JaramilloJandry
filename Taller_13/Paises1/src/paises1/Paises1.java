package paises1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Paises1 {
    public static void main(String[] args) {
        try {
            int c = 0;
            File paises = new File("C:\\Users\\pc\\IntroProgramación\\UTPL-IntroProg-JaramilloJandry\\Taller_13\\Paises.csv");
            Scanner sc = new Scanner(paises);
            sc.useDelimiter(":");
            System.out.println("Paises con densidad poblacional mayor que 1000km2");
            System.out.format("%50s%10s%20s\n" , "Pais" , "Codigo" , " Densidad poblacional");
            System.out.format("%50s%10s%20s\n" , "--------------------" , " ---------","--------------");
            while(sc.hasNextLine()){
                c = c + 1;
                String line = sc.nextLine();
                if (c>1) {
                    String[] valores = line.split(":");
                    String poblacion = valores[2].replace(" ","");
                    String superficie = valores[3].replace(" ","");
                    double densidad =(Double.parseDouble(poblacion))/(Double.parseDouble(superficie));
                    if (densidad > 1000) {
                        System.out.format("%50s%10s%20s\n" , valores[0] , valores[1],densidad);       
                    }    
                }
            }
            sc.close();
            
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e.toString());
        }
    }   
    
}