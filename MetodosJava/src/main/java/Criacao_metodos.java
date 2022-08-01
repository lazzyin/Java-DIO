/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class Criacao_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v1=10;
        int v2=5;
        int hr=15;
        
        saudacao(hr);
        sum(v1,v2);
        sub(v1,v2);
        div(v1,v2);
        mult(v1,v2);
        
        emp(3000);
        emp(12000);
        
        
    }
    
    public static void saudacao(int hour){
        if((hour>=6)&&(hour<=12)){
            System.out.println("Bom dia");
        }
        if((hour>=12)&&(hour<=18)){
            System.out.println("Boa Tarde");
        }
        if((hour>=18)&&(hour<=23)){
            System.out.println("Boa Noite");
        }
    }
    
    public static void sum(int val1,int val2){
        int result=val1+val2;
        System.out.println(val1+" + "+val2+" = "+result);
    }
    public static void sub(int val1,int val2){
        int result=val1-val2;
        System.out.println(val1+" - "+val2+" = "+result);
    }
    public static void div(int val1,int val2){
        int result=val1/val2;
        System.out.println(val1+" / "+val2+" = "+result);
    }
    public static void mult(int val1,int val2){
        int result=val1*val2;
        System.out.println(val1+" * "+val2+" = "+result);
    }
    
    public static void emp(int valor){
        
        double jr=0.0;
        double valorJr=0;
        double valorFinal=0;
        
        if(valor<=5000){
            jr=0.03;
            double jrf=1+jr;
            valorJr=1+jr*valor;
            valorFinal=valor+valorJr;
            double parc=valorFinal/5;
            System.out.println("Um emprestimo de: "+valor+" pode ser dividido em"
                    + " ate 5 vezes, com juros de "+jr*100+" e um valor final de:"
          + valorFinal+" Reais e parcelas de:"+parc);
        }
        
        if((valor>5000)&&(valor<=15000)){
            jr=0.08;
           double jrf=1+jr;
            valorJr=1+jr*valor;
            valorFinal=valor+valorJr;
            double parc=valorFinal/8;
            System.out.println("Um emprestimo de: "+valor+" pode ser dividido em"
                    + " ate 8 vezes, com juros de "+jr*100+" e um valor final de:"
          + valorFinal+" Reais e parcelas de:"+parc );
        }
    }
    
}
