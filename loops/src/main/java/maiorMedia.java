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
public class maiorMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        
        int num;
        int count=0;
        int maior=0;
        int soma=0;
        int media=0;
        do{
        System.out.println("Digite um numero:");
        num=scan.nextInt();
        soma=soma+num;
        
        if(num>maior)maior=num;
        count++;
        }while(count<5);
        System.out.println("Maior:"+maior);
        
        media=soma/5;
        System.out.println("Media:"+media);
    }
    
}
