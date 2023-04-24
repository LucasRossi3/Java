
package fatec.poo.model;


public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private Funcionario[] funcionarios;
    private int numFunc;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[10];
        numFunc = 0;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }
    
    public void addFuncionarios(Funcionario func){
        funcionarios[numFunc] = func;
        numFunc++;
    }
    
    public void listarFuncionarios(){
       System.out.println("\nCodigo: " + codigo);
       System.out.println("Descricao: " + descricao);
       System.out.println("Data início: " + dtInicio);
       System.out.println("Data término: " + dtTermino);
       System.out.println("Número de funcionários: " + numFunc + "\n");
       System.out.println("Registro" + "\t" + "Nome" + "\t\t\t" + "Cargo" + "\t\t\t" + "Departamento");
        for(int i = 0; i < numFunc; i++){
            System.out.println(funcionarios[i].getRegistro() + "\t\t" + funcionarios[i].getNome() + "\t\t" + funcionarios[i].getCargo() 
                               + "\t\t" + funcionarios[i].getDepartamento().getNome());
        }
    }
    
    
}
