
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class CustomExcp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numerador={4,5,8,10};
        int denominador[]={2,4,0,2,8};
        
        for(int i=0;i<denominador.length;i++){
            try{
            if(numerador[i]%2!=0) 
                throw new DivisaoNaoExataException("Divisão não exata!",numerador[i],denominador[i]);
            
            int result=numerador[i]/denominador[i];
            System.out.println(result);
            }catch(DivisaoNaoExataException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
            try{
                if(denominador[i]==0){
                    throw new ArithmeticException("Impossivel dividir por 0");
                }
            }catch(ArithmeticException e){
                e.printStackTrace();
            }
        }
        System.out.println("Resto do programa");
    }
    
}
