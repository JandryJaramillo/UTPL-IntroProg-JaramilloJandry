import javax.swing.*;
public class xd{
     
    void mostrarFraccionSimplificada(int numerador, int denominador)
    {
        int div=0;
        if((numerador % denominador)==0)
        {
            div=numerador/denominador;
            JOptionPane.showMessageDialog(null,""+div);
        }
        else if((denominador % numerador)==0)
        {
            div=denominador/numerador;
            JOptionPane.showMessageDialog(null,"1/"+div);
        }
        else
            JOptionPane.showMessageDialog(null,""+numerador+"/"+denominador);
         
         
    }
 
    void ingresaFraccion()
    {
        int numerador=0, denominador=0;
        String cadena;
        cadena=JOptionPane.showInputDialog("Ingrese Numerador : ");
        numerador=Integer.parseInt(cadena);
        cadena=JOptionPane.showInputDialog("Ingrese Denominador : ");
        denominador=Integer.parseInt(cadena);
        mostrarFraccionSimplificada(numerador,denominador);
    }
    public static void main(String[] args)
    {
        String cadena;
        int opcion=0;
        xd fraccional = new xd();
        do
        {
            cadena=JOptionPane.showInputDialog("0. Salir.  -----   [Otro] Continuar");
            opcion=Integer.parseInt(cadena);
            if(opcion==0)
                System.exit(0);
            else       
                fraccional.ingresaFraccion();
             
        }while(opcion!=0);      
    }
}