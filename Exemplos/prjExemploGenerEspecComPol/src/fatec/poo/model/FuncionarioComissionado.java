
package fatec.poo.model;

public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdmisao, double taxaComissao) {
        super(registro, nome, dtAdmisao);
        this.taxaComissao = taxaComissao;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }
    
    public double getSalBase() {
        return salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addVendas (double valVenda){
        totalVendas += valVenda;
    } 
    
    public double calcSalBruto(){
        return (salBase + taxaComissao/100 * totalVendas);
    }
    
    public double calcGratificacao(){
        if (totalVendas <= 5000){
            return 0;
        }
        else if (totalVendas > 5000 && totalVendas <= 10000){
            return (0.03 * calcSalBruto());
        }
        else{
            return (0.05 * calcSalBruto());
        }
    }
    
    public double calcSalLiquido (){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
