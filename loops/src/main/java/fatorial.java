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
public class fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int num;
        int mult=1;
        
        System.out.println("Deseja ver o fatorial de qual numero?");
        num=scan.nextInt();
        for(int i=num;i>=1;i--){
            mult=mult*i;
        }
        System.out.println("Fatorial de: "+num+ " = "+mult);
    }
    
}
