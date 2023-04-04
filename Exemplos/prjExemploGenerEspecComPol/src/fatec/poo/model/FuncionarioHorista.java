
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

    
    public double calcGratificacao(){
        return (0.075 * calcSalBruto());
    }
    
    //Aplicando o polimorfismo
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
