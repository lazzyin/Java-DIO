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
public class parImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int qtdNum=0;
        int num;
        int count=0;
        int countPar=0;
        int countImpar=0;
        
        System.out.println("Quantos numeros deseja digitar?");
        qtdNum=scan.nextInt();
        
        while(count<qtdNum){
            System.out.println("Digite um numero:");
            num=scan.nextInt();
            if(num%2==0)countPar++;
            else{ countImpar++;}
            count++;
        }
        System.out.println("Quantidade pares:"+countPar);
        System.out.println("Quantidade impares:"+countImpar);
    }
    
}
