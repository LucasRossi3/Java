
package fatec.poo.model;

public class FuncionarioMensalista extends Funcionario{
    private double valSalMin;
    private double numSalMin;

    public FuncionarioMensalista(double valSalMin, int registro, String nome, String dtAdmisao) {
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
