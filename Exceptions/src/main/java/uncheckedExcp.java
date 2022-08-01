
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class uncheckedExcp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean loop=true;
        do{
            String a=JOptionPane.showInputDialog("Numerador:");
        String b=JOptionPane.showInputDialog("Denominador:");
        
        try{
        int result=div(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado:"+result);
        loop=false;
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Entrada invalida, informe um numero");
        }
        catch(ArithmeticException error){
            JOptionPane.showMessageDialog(null,"Entrada invalida, Não é possivel dividir um numero por 0(zero)");            
        }
        finally{
            System.out.println("Saida do Finally");
        }
        }while(loop==true);
      
        
    }

    private static int div(int a, int b) {
        return a/b;
    }
}


