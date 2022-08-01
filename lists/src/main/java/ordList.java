
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Dadas as seguintes informações sobre meus gatos
crie uma lista e ordene essa lista exibindo:
(nome - idade - cor)

gato 1= nome: Jon, idade: 18, cor:preto
gato 2= nome: Jane, idade:12, cor:branca 

 */

/**
 *
 * @author Note
 */
public class ordList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Gato> myCat=new ArrayList<Gato>(){{
        add(new Gato("Jon", 18, "preto"));
        add(new Gato("Jane",12,"branco"));
        add(new Gato("Jon",6,"rajado"));
        }};
            
        
        
        System.out.println("Ordem de Inserção");
        System.out.println(myCat);
        
        System.out.print("Ordem aleatoria");
        Collections.shuffle(myCat);
        System.out.println(myCat);
        
        
        System.out.println("Ordem natural(nome"); 
        Collections.sort(myCat);
        System.out.println(myCat);
        
        System.out.println("Ordem idade");
        //Collections.sort(myCat,new ComparatorIdade());
        myCat.sort( new ComparatorIdade());
        System.out.println(myCat);
        //
        
        
        System.out.println("Ordem cor");
        myCat.sort(new ComparatorCor());
        System.out.println(myCat);
        
        
        System.out.println("Ordem nome/cor/idade");
        myCat.sort(new ComparatorNomeCorIdade());
        System.out.println(myCat);
    
    }
    
    private static class Gato implements Comparable<Gato>{
        private String nome;
        private int idade;
        private String cor;

        public Gato(String nome, int idade, String cor) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public String getCor() {
            return cor;
        }

        @Override
        public String toString() {
            return "Gato{" + "nome=" + nome + ", idade=" + idade + ", cor=" + cor + '}';
        }

        @Override
        public int compareTo(Gato gato) {
            return this.getNome().compareToIgnoreCase(gato.getNome());
                    }
        
       
       
       
     }
   static class ComparatorIdade implements Comparator<Gato>{
            @Override
            public int compare(Gato g1, Gato g2){
                return Integer.compare(g1.getIdade(),g2.getIdade());
            }
        }
  static  class ComparatorCor implements Comparator<Gato>{
           
           @Override
           public int compare(Gato g1,Gato g2){
               return g1.getCor().compareToIgnoreCase(g2.getCor());
           }
       }
  
  static class ComparatorNomeCorIdade implements Comparator<Gato>{
      @Override
      public int compare(Gato g1,Gato g2){
          int nome=g1.getNome().compareToIgnoreCase(g2.getNome());
          if(nome!=0) return nome;
          
          int cor=g1.getCor().compareToIgnoreCase(g2.getCor());
          if(cor!=0) return cor;
          
          return Integer.compare(g1.getIdade(),g2.getIdade());

          
      }
  }
}
