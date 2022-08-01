/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class DivisaoNaoExataException extends Exception {
    
    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message,int numerador, int denominador){
        super(message);
        this.numerador=numerador;
        this.denominador=denominador;
    }
}
