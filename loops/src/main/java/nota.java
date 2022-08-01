/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Note
 */
public class nota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        Scanner scan=new Scanner(System.in);
        
        while(true){
        
            
            System.out.println("Digite uma nota entre 0 e 10");
            nota=scan.nextInt();        
            if(nota>=0 && nota<=10)break;
            
            System.out.println("Informe um valor valido:");
        }
    }
    
}
