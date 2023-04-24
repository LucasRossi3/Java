
package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private int numFunc;
    private Funcionario[] funcionarios;
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[10];
        numFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario (Funcionario func){
        funcionarios[numFunc] = func;
        numFunc++;
    }

    public int getNumFunc() {
        return numFunc;
    }

    public void listarFunc(){
       System.out.println("\nSigla: " + sigla);
       System.out.println("Nome: " + nome);
       System.out.println("Número de funcionários: " + numFunc + "\n");
       System.out.println("Registro" + "\t" + "Nome" + "\t\t\t" + "Cargo");
        for(int i = 0; i < numFunc; i++){
            System.out.println(funcionarios[i].getRegistro() + "\t\t" + funcionarios[i].getNome() + "\t\t" + funcionarios[i].getCargo());
        }
    }
    
    
    
    
}
