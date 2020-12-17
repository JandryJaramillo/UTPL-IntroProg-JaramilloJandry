package listacuadradosperfectos1;

import java.util.Scanner;

public class ListaCuadradosPerfectos1 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int men,may,c;
         double sum,r;
         
         System.out.print("\n Ingrese el número menor: ");
         men = sc.nextInt();
         System.out.print("\n Ingrese el número mayor: ");
         may = sc.nextInt();
         
         for (c = men; c < may; c = c + 1){
            sum = Math.sqrt(c);
            r = sum;              
            if(r%2 == 0){
                if(sum*sum == c){
                    System.out.print(c+"/");
                }
            }
         }
    }
}
