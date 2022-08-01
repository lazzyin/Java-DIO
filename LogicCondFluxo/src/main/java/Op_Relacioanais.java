/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class Op_Relacioanais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i1=10;
        int i2=20;
        float f1=4.5f;
        float f2=3.5f;
        char c1='x';
        char c2='y';
        String s1="Teste";
        String s2="Teste2";
        boolean b1=true;
        boolean b2=false;
        
       System.out.println("i1==i2:"+(i1==i2)+"  i1!=i2:"+(i1!=i2)+"   i1>i2:"+(i1>i2)+"   i1<=i2:"+(i1<=i2)); 
       System.out.println("f1==f2:"+(f1==f2)+"  f1!=f2:"+(f1!=i2)+"   f1>f2:"+(f1>=f2)+"   i1<=f2:"+(f1<f2));
       System.out.println("c1==c2:"+(c1==c2)+"  c1!=c2:"+(c1!=c2)+"   c1>c2:"+(c1>c2)+"   c1<=c2:"+(c1<=c2));
       System.out.println("s1==s2:"+(s1==s2)+"  s1!=s2:"+(s1!=s2)/*" RETORNA ERRO  s1>s2:"+(s1=>s2)+"   s1<=s2:"+(s1<s2)*/);
       System.out.println("b1==b2:"+(b1==b2)+"  b!=b2:"+(b1!=b2)/*" RETORNA ERRO   b1>b2:"+(b1>b2)+"   b1<=b2:"+(b1<=b2)*/);


    }
    
}
