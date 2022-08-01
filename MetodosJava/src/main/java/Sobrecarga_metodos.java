/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class Sobrecarga_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        quad(5);
        ret(2,3);
        trap(5,3,6);
    }
    
    public static void quad(double l){
        double area=l*l;
        System.out.println("Area de um quadrado:\nTamanho dos lados: "
        +l+"\n Tamanho da area: "+area);
    }
    
    public static void ret(double l1,double l2){
        double area=l1*l2;
        System.out.println("Area de um retangulo:\nTamanho dos lados: "
        +l1+" e "+ l2+"\n Tamanho da area: "+area);
    }
    
    public static void trap(double bma,double bme, double alt){
        double area=(bma+bme)*alt;
        System.out.println("Area de um Trapezio:\nTamanho dos lados:\n "
        +"Base Maior"+bma+"\n Base menor "+ bme+
               "\nAltura"+alt+"\n Tamanho da area: "+area);
    }
            
    
}
