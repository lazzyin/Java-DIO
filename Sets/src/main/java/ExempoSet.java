
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class ExempoSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Dado uma lista de 7 notas de uma aluno [7,8.5,9.3,5,7,0,3.6] faça:
       
        /*
        Set notas=new HashSet();
        Set<Double> notas=new HashSet<>();
        HashSet<Double> notas= new HashSet<>();
        Set<Double> notas=new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7g,0d,3.6);
        Set<Double> notas=Set.of(7d,8.5,9.3,5d,7d,0d,3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
        
        
        */
        
        
        System.out.println("Crie uma lista e adicione as sete notas:");
        Set<Double> notas=new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas.toString());
        
        //APENAS COM LIST
        //System.out.println("Posição da nota 5.0:");
        
        
        //System.out.println("Adicionar a nota 8.0 na posição 4:");

        //System.out.println("Substituir a nota 5 pel nota 6:");
        
        
        System.out.println("Confira se a nota 5 esta na lista:"+notas.contains(5d));

        //System.out.println("Exiba todas as notas na ordem em foram informadas:");

       // System.out.println("Exiba a terceira nota adicionada: ");

        System.out.println("Exiba a menor nota:"+Collections.min(notas));
        
        System.out.println("Exiba a maior nota:"+Collections.max(notas));
        
        Iterator<Double> iterator=notas.iterator();
        Double soma=0.0;
        while(iterator.hasNext()){
            Double next= iterator.next();
            soma+=next;
        }
        System.out.println("Exiba a soma dos valores:"+soma);

        System.out.println("Exiba a media das notas:"+(soma/notas.size()));
        
        System.out.println("Remova a nota 0:");
        notas.remove(0d);
        System.out.println(notas);

        //System.out.println("Remova a nota na posição 0:");
        
        
        System.out.print("Remova as notas menores que 7 e exiba a lista:");
        Iterator<Double> iterator1=notas.iterator();
        while(iterator1.hasNext()){
            Double next=iterator1.next();
            if(next<7)iterator1.remove();
        }
        
        System.out.println(notas);
        
        System.out.println("Exiba todas as notas na ordem em que forma informadas:");
        Set<Double> notas2=new LinkedHashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas2);
        
        System.out.println("Exiba as notas em ordem crescente:");
        Set<Double> notas3=new TreeSet<>(notas2);
        System.out.println(notas3);
        
        
        System.out.println("Apague todo o conjunto");
        notas.clear();
        
        
        
        System.out.println("Confira se o conjunto 1 esta vazio:"+notas.isEmpty());
        System.out.println("Confira se o conjunto 2 esta vazio:"+notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 esta vazio:"+notas3.isEmpty());


    }
    
}
