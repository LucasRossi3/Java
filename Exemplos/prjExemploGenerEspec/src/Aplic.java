
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;

public class Aplic {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat ("#,##0.00");
        
        Aluno objAluno = new Aluno (1010, "Carlos Silveira", "15/03/1978");
        Professor objProfessor = new Professor (2020, "Carlos Alberto", "09/07/1976");
                
        objAluno.setMensalidade(1500);
        System.out.println("Registro Escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data Nascimento: " + objAluno.getDataNascimento());
        System.out.println("Mensalidade: " + df.format(objAluno.getMensalidade()));
        
        objProfessor.setSalario(4000);
        System.out.println("\nRegistro Funcional: " + objProfessor.getRegFuncional());
        System.out.println("Nome: " + objProfessor.getNome());
        System.out.println("Data Nascimento: " + objProfessor.getDataNascimento());
        System.out.println("Salário: " + df.format(objProfessor.getSalario()));
        
        
    }
    
}
