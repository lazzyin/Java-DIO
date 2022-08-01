/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class CtrlFlux {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dec="dir";
        
        
        System.out.println("Você vê uma bifurcação no seu caminho, por qual lado você segue?\n-Direita\n-Esquerda");
        if(dec=="esq"){
                System.out.println("Você segue pela esquerda e acaba retornado ao inicio, parece que esta andando em circulos");
            }
            else{
                System.out.println("Seguindo pela direita você consegue ver uma luz ao horizonte, seria a saida ou uma armadilha?");
                decTern();
            }
            
    }
    public static void decTern(){
        String dec2="s";
        
        System.out.println("Você continua em frente sozinho ou volta para chamar seus companheiros?\n-Sim\n-Não");
        switch(dec2) {
            case("s"):
                frente();
                break;
            
            case("n"):
                volta();
                break;
            
        }
}
    
    public static void frente(){
        System.out.println("Você consegue escutar o som do mar");
    }
    public static void volta(){
        System.out.println("Isto mesmo, você não pode deixar seus companheiros para tras");
    }
    }

    

