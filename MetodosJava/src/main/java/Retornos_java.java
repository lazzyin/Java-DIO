/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class Retornos_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        helloFriend();
        RetInt();
        quad(5);
        ret(2,3);
        trap(5,3,6);
    }
    
    public static String helloFriend(){
        String hf="Hello Friend!";
        return hf;
    }
    
    public static int RetInt(){
        int r=50*3;
        return r;
    }
    
        public static double quad(double l){
        double area=l*l;
        System.out.println("Area de um quadrado:\nTamanho dos lados: "
        +l+"\n Tamanho da area: "+area);
        return area;
    }
    
    public static double ret(double l1,double l2){
        double area=l1*l2;
        System.out.println("Area de um retangulo:\nTamanho dos lados: "
        +l1+" e "+ l2+"\n Tamanho da area: "+area);
        return area;
    }
    
    public static double trap(double bma,double bme, double alt){
        double area=(bma+bme)*alt;
        System.out.println("Area de um Trapezio:\nTamanho dos lados:\n "
        +"Base Maior"+bma+"\n Base menor "+ bme+
               "\nAltura"+alt+"\n Tamanho da area: "+area);
        return area;
    }
}
