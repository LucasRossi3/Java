
package fatec.poo.model;

public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncionarioHorista(int registro, String nome, String dtAdmisao, double valHorTrab) {
        super(registro, nome, dtAdmisao);
        this.valHorTrab = valHorTrab;
    }

    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }

    public double calcSalBruto(){
        return (qtdeHorTrab * valHorTrab);
    }
    
}
