package fatec.poo.model;


public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmisao;

    public Funcionario(int registro, String nome, String dtAdmisao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmisao = dtAdmisao;
    }
    
    abstract public double calcSalBruto(); 
    
    public double calcDesconto(){
        return (0.1 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return (calcSalBruto() - calcDesconto());
    }
    
}
