
package fatec.poo.model;

public class FuncionarioMensalista extends Funcionario{
    private double valSalMin;
    private double numSalMin;
    

    public FuncionarioMensalista(int registro, String nome, String dtAdmisao, double valSalMin) {
        super(registro, nome, dtAdmisao);
        this.valSalMin = valSalMin;
    }

    public void setNumSalMin(double numSalMin) {
        this.numSalMin = numSalMin;
    }
    
    public double calcSalBruto(){
        return(numSalMin * valSalMin);
    }
    
   
    
}
