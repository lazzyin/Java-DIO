
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
Dadas as seguintes informações crie um conjunto e ordene exibindo:
(nome - genero - temp do episodio);

serie 1= nome:Breaking Bad genero:drama tempoEpisodio:50
serie 2= nome:MrRobot genero:drama tempoEpisodio:50
serie 3= nome:Sons Of Anarchy genero:drama tempoEpisodio:50;
 */

/**
 *
 * @author Note
 */
public class ordSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ordem aleatoria");
        Set<Serie> mySerie=new HashSet<Serie>(){{
            add(new Serie("BB","Drama",50));
            add(new Serie("Mr.Robot","Drama",50));
            add(new Serie("SoA","Drama",50));
        }};
        for(Serie serie:mySerie){
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempoEp());
        }
        System.out.println("----------------------------");
        System.out.println("Ordem inserção");
        Set<Serie> mySerie2=new LinkedHashSet<Serie>(){{
            add(new Serie("BB","Drama",60));
            add(new Serie("Mr.Robot","Drama",50));
            add(new Serie("SoA","Drama",50));
        }};
        for(Serie serie:mySerie2){
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempoEp());
        }
        System.out.println("----------------------------");

        System.out.println("Ordem natural(Tempo de episodio)");
        Set<Serie> mySerie3=new TreeSet<>(mySerie);
        for(Serie serie:mySerie3){
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempoEp());
        }
        
        
        System.out.println("----------------------------");

        System.out.println("Ordem Nome/Gen/Temp");
        Set<Serie> mySerie4=new TreeSet<>(new ComparatorNameGenEp());
        mySerie4.addAll(mySerie);
        
        for(Serie serie:mySerie4){
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempoEp());
        }
        
        System.out.println("Ordem genero");
        
        System.out.println("Ordem Tempo Episodio");
    }
    
    
    
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private int tempoEp;

    public Serie(String nome, String genero, int tempoEp) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEp = tempoEp;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getTempoEp() {
        return tempoEp;
    }

    @Override
    public String toString() {
        return "Serie{" + "nome=" + nome + ", genero=" + genero + ", tempoEp=" + tempoEp + '}';
    }

    @Override
    public boolean equals(Object o){
    if(this==o) return true;
    if(o==null||getClass()!=o.getClass()) return false;
    Serie serie=(Serie)o;
    return serie.nome.equals(nome) && genero.equals(serie.genero) && tempoEp.equals(serie.tempoEp);
        }

    @Override
    public int hashCode() {
    return Objects.hash(nome,genero,tempoEp);
        }
    
    @Override
    public int compareTo(Serie serie){
                
        int tempoEp=Integer.compare(this.getTempoEp(), serie.getTempoEp());
        if(tempoEp!=0)return tempoEp;
        
        
        return this.getGenero().compareTo(serie.getGenero());
}
    
    
    
}

class ComparatorNameGenEp implements Comparator<Serie>{
    @Override
    public int compare(Serie s1, Serie s2){
        int nome=s1.getNome().compareTo(s2.getNome());
        if(nome!=0)return nome;
        
        int genero=s1.getGenero().compareTo(s2.getGenero());
        if(genero!=0)return genero;
        
        
        return Integer.compare(s1.getTempoEp(), s2.getTempoEp());
        
 
    }
}
