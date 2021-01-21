package ordenarmatriz1;
import java.util.Scanner;
public class OrdenarMatriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,i,j,c,t,lim,x;
        System.out.println("Ingrese el número de filas de la matriz:");
        n = sc.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz:");
        m = sc.nextInt();
        int matriz[][] = new int[n][m];
        t = n * m;
        int vector[] = new int[t];
        
        System.out.println("Ingrese los elementos de la matriz: ");
        for(i = 0;i <= (n-1) ; i ++ ){
            System.out.println("Escriba los "+m+" elementos de la fila "+(i+1)+": ");
            for(j = 0;j <= (m-1) ; j ++ ){
                matriz[i][j] = sc.nextInt();
            }
        }
        c = 0;
        for(i = 0;i <= (n-1) ; i ++ ){
            for(j = 0;j <= (m-1) ; j ++ ){
                vector[c] = matriz[i][j];
                c=c+1;
            }
        }
        for(lim = t;lim <= 2 ; lim -- ){
            for(c = 0;c <= (lim-1) ; c ++ ){
                if(vector[c]>vector[c+1]){
                    x = vector[c];
                    vector[c] = vector[c+1];
                    vector[c+1] = x;
                }                
            }
        }
        c = 0;
        for(i = 0;i <= (n-1) ; i ++ ){
            for(j = 0;j <= (m-1) ; j ++ ){
                matriz[i][j] = vector[c];
                c=c+1;                
            }
        }
        System.out.println("Matriz ordenada:");
        for(i = 0;i <= (n-1) ; i ++ ){
            for(j = 0;j <= (m-1) ; j ++ ){
                System.out.println("Elemento [" + (i+1) + "," + (j+1) + "]: " + matriz[i][j]);                                
            }
        }
    }    
}