
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
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
public class ordMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-----------------------------");
        System.out.println("Ordem aleatoria Autor e Titulo");
        Map<String, Livro> myBook=new HashMap<String, Livro>(){{
            put("Miura",new Livro("Berserk Era de ouro",250));
            put("Alan Moore",new Livro("Watchmen",500));
            put("Neil Gaiman",new Livro("Sandman",500));
        }};
        for(Map.Entry<String, Livro> livro:myBook.entrySet())
        System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        
        System.out.println("-----------------------------");
        
        System.out.println("Ordem Inserção");
        Map<String, Livro> myBook2=new LinkedHashMap<String, Livro>(){{
            put("Miura",new Livro("Berserk Era de ouro",250));
            put("Alan Moore",new Livro("Watchmen",500));
            put("Neil Gaiman",new Livro("Sandman",500));
        }};
        for(Map.Entry<String, Livro> livro:myBook2.entrySet())
        System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        
        System.out.println("-----------------------------");
        System.out.println("Ordem alfabetica autores");
        Map<String, Livro> myBook3=new TreeMap<String, Livro>(myBook2);
        for(Map.Entry<String, Livro> livro:myBook3.entrySet())
        System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        
        
        System.out.println("-----------------------------");
        System.out.println("Ordem alfabetica nome do livro");
        Set<Map.Entry<String, Livro>>myBook4=new TreeSet<>(new ComparatorNome());
        myBook4.addAll(myBook.entrySet());
        for(Map.Entry<String,Livro>livro:myBook4)
        System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
            
        
        System.out.println("-----------------------------");
        System.out.println("Ordem numero de paginas");
        
        
    }
    
}


class Livro{
    private String nome;
    private int pag;

    public Livro(String nome,  int pag) {
        this.nome = nome;
        
        this.pag = pag;
    }

    public String getNome() {
        return nome;
    }

    

    public int getPag() {
        return pag;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.pag);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        
        if (!Objects.equals(this.pag, other.pag)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", pag=" + pag + '}';
    }
     
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{
 
    @Override
    public int compare(Map.Entry<String,Livro>l1, Map.Entry<String, Livro>l2){
    
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}


