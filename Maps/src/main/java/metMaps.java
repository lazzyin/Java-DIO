
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class metMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Map carPop=new HashMap();
        Map<Strig, Double> carPop=new HashMap<>();
        HashMap<String, Double> carPop=new HashMap<>();
        Map<String, Double> carPop=Map.of("gol",14.4,"uno",15.6,"mobi",16.1);
        */
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carPop=new HashMap<String, Double>(){{
           put("Gol",14.4);
           put("Uno",15.6);
           put("Mobi",16.1);
           put("Hb20",14.5);
           put("kwid",15.6);
        }};
        System.out.println(carPop);
        
        System.out.println("Substitua o consumo do gol por 15.2km/l");
        carPop.put("Gol",15.2);
        System.out.println(carPop);
        
        
        System.out.println("Confira se o modelo tucson esta no dicionario:"+ carPop.containsKey("Tucson"));
        
        
        System.out.println("Exiba o consumo do uno:"+carPop.get("uno"));
        
        
        //System.out.println("Exiba o terceiro modelo adicionado:");
        
        System.out.println("Exiba os modelos:");
        Set<String> models=carPop.keySet();
        System.out.println(models);
        
        System.out.println("Exiba os consumos:");
        Collection<Double> cons=carPop.values();
        System.out.println(cons);
        
        System.out.println("Exiba o models mais economico e seu consumo:");
        Double consEf=Collections.max(carPop.values());
        Set<Map.Entry<String, Double>>entries=carPop.entrySet();
        String modeloEf="";
        
        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consEf)){
                modeloEf=entry.getKey();
                System.out.println("Modelo mais eficiente: "+modeloEf+" - "+consEf);
            }
        }
        
        
        System.out.println("Exiba o modelo menos economico e seus consumo:"+Collections.min(carPop.values()));
        Double consMef=Collections.min(carPop.values());
        String modMe="";
        for(Map.Entry<String, Double> entry:carPop.entrySet()){
            if(entry.getValue().equals(consMef)) modMe=entry.getKey();
            System.out.println("Modelo menos eficiente:"+modMe+" - "+consMef);
        };
        
        
        
        Iterator<Double> iterator=carPop.values().iterator();
        Double soma=0d;
        
        while(iterator.hasNext()){
            soma+=iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: "+soma);
        
        
        System.out.println("Exiba a media do consumo deste dicionario de carros:" +(soma/carPop.size()));
        
        
        System.out.println("Remova os modelos com consumo iqual iqual a 15.6");
        Iterator<Double> iterator2=carPop.values().iterator();
        while(iterator2.hasNext()){
            if(iterator2.next().equals(15.6))iterator2.remove();
        }
        System.out.println(carPop);
        
      System.out.println("Exiba todos os carros na ordem que foram informados");
        Map<String, Double> carPop2=new LinkedHashMap<String, Double>(){{
           put("Gol",14.4);
           put("Uno",15.6);
           put("Mobi",16.1);
           put("Hb20",14.5);
           put("kwid",15.6);
        }};
        System.out.println(carPop2);
      
      
        System.out.println("Exiba o dicionario ordenado pelo modelo:");
        Map<String, Double> carPop3=new TreeMap<String, Double>(carPop){{
           put("Gol",14.4);
           put("Uno",15.6);
           put("Mobi",16.1);
           put("Hb20",14.5);
           put("Kwid",15.6);
        }};
        System.out.println(carPop3);
        
        System.out.println("Apague o conjunto de carros");
        carPop.clear();
        System.out.println("Confira se a lista esta vazia:"+carPop.isEmpty());
        
        
        /*System.out.println("");
        */
    }
    
}
