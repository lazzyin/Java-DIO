
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class ExerciciosStreamApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String>numAleatorios=
                Arrays.asList("1","2","3","5","4","9");
        
        System.out.println("Imprima todos os elementos dessa lista de strings:");
        numAleatorios.stream().forEach((String s) -> {
            System.out.println(s);
        });
        
        System.out.println("Pegue as 5 primeiros numeros e coloque dentro de um Set:");
        numAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        
        System.out.println("Transforme esta lista de string em uma lista de numeros inteiros:");
                List<Integer>numAleatoriosInt=numAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());//.forEach(System.out::println);

//LAMBDA  //numAleatorios.stream().map((String s) -> Integer.parseInt(s));
        /*numAleatorios.stream().map(new Function<String, Integer>(){
            @Override
            public Integer apply(String s){
                return Integer.parseInt(s);
            }
        });*/
        
        
        System.out.println("Pegue os numeors pares e maiores que 2");
        numAleatorios.stream().map(Integer::parseInt).filter((Integer i) -> (i %2==0 && i>2)).collect(Collectors.toList());
        /*numAleatorios.stream().map(Integer::parseInt).filter(new Predicate<Integer>(){
            @Override
            public boolean test(Integer i){
                if(i %2==0 && i>2) return true;
                    return false;
            }
            }).collect(Collectors.toList());*/
        
        
        System.out.println("Mostre a media dos numeros:");
        numAleatorios.stream().mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
        /*numAleatorios.stream().mapToInt((String s) -> Integer.parseInt(s))
                .average()
                .ifPresent(new DoubleConsumer(){
                    @Override
                    public void accept(double v){
                        System.err.println(v);
                    }
                });*/
        /*numAleatorios.stream().mapToInt(new ToIntFunction<String>(){
            @Override
            public int applyAsInt(String s){
                return Integer.parseInt(s);
            }
        });*/
        
        System.out.println("Remova os valores impares:");
        numAleatoriosInt.removeIf((Integer integer) -> {
            if(integer %2!=0)return true;
            return false;
        });
        /*numAleatoriosInt.removeIf(new Predicate<Integer>(){
            @Override
            public boolean test(Integer integer){
                if(integer %2!=0)return true;
                    return false;
            }
        });*/
        
        
        }
    }
    
    
    

