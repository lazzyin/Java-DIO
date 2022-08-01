/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class OpAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Prepos");
        prePos();
        System.out.println("Aritimeticos");
        artm();
        System.out.println("Atribuição");
        atrb();
        System.out.println("Procedencia");
        prcd();
        
        
    }
    
    private static void prePos(){
        int k=10;
        int i=++k;
        int j=k--;
        int x=k;
        
        System.out.println("i: "+1);
        System.out.println("j: "+j);
        System.out.println("x: "+x);

    }
    
    private static void artm(){
        int a=10;
        int b=20;
        int c=5;
        
        int r1=a+b;
        int r2=b-a;
        int r3=c*a;
        int r4=a/c;
        int r5=b%c;
        
        System.out.println("soma: "+r1);
        System.out.println("Subtração: "+r2);
        System.out.println("Multiplicação: "+r3);
        System.out.println("Divisão: "+r4);
        System.out.println("Resto de divisão: "+r5);
    }
    
    private static void atrb(){
        int i=1000;
        short j=15;
        long l=500L;
        int k=35;
        float m=3.14f;
        double n=m;
        
        System.out.println("i:" +i);
        System.out.println("j: "+j);
        System.out.println("l:"+l);
        System.out.println("k: "+k);
        System.out.println("m: "+m);
        System.out.println("n: "+n);
        
        i+=5;
        j-=8;
        n/=2;
        l*=3;
        k%=2;
        
        System.out.println("i:" +i);
        System.out.println("j: "+j);
        System.out.println("l:"+l);
        System.out.println("k: "+k);
        System.out.println("m: "+m);
        System.out.println("n: "+n);
    }
    
    private static void prcd(){
        int i=10;
        int j=20;
        int k=30;
        
        int a=i++ * --j * k;
        System.out.println("i++ * --j * k: "+a);
        
        int b=k/ --i % 3 + j;
        System.out.print("k/ --i % 3 + j: "+b);
        
        int c=2;
        
        c*=j+=5;
        System.out.println("c*=j+=5: "+c);
    }
}
