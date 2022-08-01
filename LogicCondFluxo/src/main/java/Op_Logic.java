/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class Op_Logic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean x1=true;
        boolean x2=false;
        boolean x3=true;
        boolean x4=false;
        
        System.out.println("True && True:"+(x1&&x3)+" True && False:"+(x1&&x4)+"  False && False:"+(x2&&x4));
        System.out.println("True || True:"+(x1||x3)+" True || False:"+(x1||x4)+"  False || False:"+(x2||x4));
        System.out.println("!(True && True):"+!(x1&&x3)+" !(True && False):"+!(x1&&x4)+"  !(False && False):"+!(x2&&x4));
        System.out.println("!(True || True):"+!(x1||x3)+" !(True || False):"+!(x1||x4)+"  !(False || False):"+!(x2||x4));

        
        double salMen=2000.00;
        double medSal=1200.00;
        int qtdDep=4;
        int medDep=5;

        boolean salBai=salMen<medSal;
        boolean mtDep=qtdDep>=medDep;
        
        boolean recebeAux=(salBai)&&(mtDep);
        System.out.println("RecebeAuxilio:"+recebeAux);
        
    }
    
}
