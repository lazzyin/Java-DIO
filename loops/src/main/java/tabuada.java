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
public class tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int num=0;
        
        System.out.println("Deseja ver a tabuada de qual numero?");
        num=scan.nextInt();
        for(int i=1;i<=10;i++){
           int numX=num*i;
           System.out.println(num+" * "+i+" = "+numX);
        }
        
    }
    
}
