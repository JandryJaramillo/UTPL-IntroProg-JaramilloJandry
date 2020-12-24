package seriepiwallis1;

public class SeriePiWallis1 {

    public static void main(String[] args) {
    
        double pi = 0;
        double a = 0;
        double b = 1;
        double denom = 0;
        double num = 0;
        double temp = 0;
        double count = 0;
        double halfpi = 1;


        while(true) {
          temp = b;
          b = temp + 2;
          denom = temp*b;

          a += 2;
          num = a*a; 

          halfpi *= (num/denom);
          count++;

          System.out.println(halfpi*2);                    
        }    
    }
}