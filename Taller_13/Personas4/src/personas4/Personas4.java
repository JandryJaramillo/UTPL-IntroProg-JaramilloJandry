package personas4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Personas4 {

    public static void main(String[] args) {
        try {
            File Personas = new File("C:\\Users\\pc\\IntroProgramación\\UTPL-IntroProg-JaramilloJandry\\Taller_13\\Personas.txt");
            Scanner sc = new Scanner(Personas);
            System.out.println("Listado personas de más de 50 años");
            System.out.format("%20s%10s\n" , "Nombre" , "Edad");
            System.out.format("%20s%10s\n" , "--------------------" , " ---------");
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] valores = line.split(",");
                if (Integer.parseInt(valores[2].replace(" ",""))>50) {
                    System.out.format("%20s%10s\n" , valores[0] , valores[2]);       
                }
            }
            sc.close();
            
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e.toString());
        }
    }   
    
}