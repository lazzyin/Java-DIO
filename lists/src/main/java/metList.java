
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class metList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        List notas=new ArrayList();//antes do java 5
        List<Double> notas=new ArrayList<Double>();//Generics(jdk 5)-Diamond Operator
        ArrayList<Double> notas=new ArrayList<>();
        List<Double> notas= Array.asList(7d,8.5,9.3,5d,7d,0d,3.6);/*
        
        
        /*List<Double> notas=new ArrayList<>(Arrays,asList());
        notas.add(10d);
        System.out.println(notas);*/
        
        /*List<Double> notas=List.of();
        notas.add(1d);
        notas.remobe(5d);
        System.out.println(notas);
        */
        
        System.out.println("Crie uma lista e adicione as sete notas:");
        
        List<Double> notas= new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(8.0);
        notas.add(3.6);
        
        System.out.println(notas);
        
        System.out.println("Posição da nota 5.0:"+notas.indexOf(5d));
        
        System.out.println("Adicionar a nota 8.0 na posição 4:");
        notas.add(4,8d);
        System.out.println(notas);
        
        System.out.println("Substituir a nota 5 pel nota 6:");
        notas.set(notas.indexOf(5d),6.0);
        System.out.println(notas);
        
        System.out.println("Confira se a nota 5 esta na lista:"+notas.contains(5d));
        
        System.out.println("Exiba todas as notas na ordem em foram informadas:");
        for(Double nota:notas) System.out.println(nota);
        
        System.out.println("Exiba a terceira nota adicionada: "+ notas.toString());
        System.out.println(notas.toString());
        
        System.out.println("Exiba a menor nota:"+ Collections.min(notas));
        
        System.out.println("Exiba a mainor nota:"+Collections.max(notas));
        
        System.out.println("Exiba a soma dos valores:");
        Iterator<Double> iterator=notas.iterator();
        Double soma=0d;
        while(iterator.hasNext()){
            Double next=iterator.next();
            soma+=next;
        }
        System.out.println(soma);
        
        System.out.println("Exiba a media das notas:"+(soma/notas.size()));
        
        
        
        System.out.println("Remova a nota 0:");
        notas.remove(0d);
        System.out.println(notas);

        
        System.out.println("Remova a nota na posição 0:");
        notas.remove(0);
        System.out.println(notas);
        
        System.out.print("Remova as notas menores que 7 e exiba a lista:");
        Iterator<Double> iterator1=notas.iterator();
        while(iterator1.hasNext()){
            Double next=iterator1.next();
            if(next<7)iterator1.remove();
        }
        System.out.println(notas);
        
        System.out.println("Apague a lista:");
        notas.clear();
        System.out.println(notas);
        
        
        System.out.println("Confira se a lista esta vazia:"+notas.isEmpty());
        
        
        /*USAR LINKED LIST:
        
        System.out.println("Crie uma lista chamada notas2");
        
        System.out.println("Mostre a primeira nota da nova lista sem remove-lo:");
        
        System.iut.println("Mostre a primeira noya da nova lista removendo-o:");
        
        */
    }
    
}
