package numarmstrong1;
import java.util.Scanner;
public class NumArmstrong1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,dig,cos,res,sum;
        System.out.println("Ingrese un número entero positivo: ");
        num = sc.nextInt();
        cos = num;
        dig = 1;
        while (cos > 9) {
            cos = cos / 10;
            dig = dig + 1;
        }
        cos = num;
        res = cos % 10;
        sum = (int)Math.pow(res,dig);
        while (cos > 9) {
            cos = cos / 10;
            res = cos % 10;
            sum = sum + (int)(Math.pow(res,dig));
        }
        if (sum == num){
            System.out.println(num+" SI es un número Armstrong");
        }else{
            Arm(num);
        }        
    }     
    public static void Arm(int num){
        System.out.println(num+" NO es un número Armstrong");
    }    
}