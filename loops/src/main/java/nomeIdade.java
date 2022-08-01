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
public class nomeIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        
        String name;
        int age;
        
        while(true){
        System.out.println("Nome:");
        name=scan.next();
        if(name.equals("0"))break;
        
        System.out.println("Idade:");
        age=scan.nextInt();
        
       }
    }
    
}
