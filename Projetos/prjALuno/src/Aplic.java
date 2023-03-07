
import fatec.poo.model.Aluno;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        int ra;
        double ntPrv1;
        double ntPrv2;
        double ntTrab1;
        double ntTrab2;
        int i = 0;
        
        Aluno objAluno = new Aluno();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o seu RA: ");
        ra = entrada.nextInt();
        System.out.print("Insira a nota da prova 1: ");
        ntPrv1 = entrada.nextDouble();
        System.out.print("Insira a nota da prova 2: ");
        ntPrv2 = entrada.nextDouble();
        System.out.print("Insira a nota do trabalho 1: ");
        ntTrab1 = entrada.nextDouble();
        System.out.print("Insira a nota do trabalho 2: ");
        ntTrab2 = entrada.nextDouble();
        
        objAluno.setNtPrv1(ntPrv1);
        objAluno.setNtPrv2(ntPrv2);
        objAluno.setNtTrab1(ntTrab1);
        objAluno.setNtTrab2(ntTrab2);
         
        while(i <= 4){
            System.out.println("\n1 - Exibir Nota das provas/Trabalhos");
            System.out.println("2 - Exibir Média das provas/Trabalhos");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            
            i = entrada.nextInt();
            
            if(i == 4){
                break;
            }
            else if (i == 1){
               System.out.print("\nNota das provas/Trabalhos:\n");
               System.out.println(objAluno.getNtPrv1() + "\n" + objAluno.getNtPrv2() + "\n" + objAluno.getNtTrab1() + "\n" + objAluno.getNtTrab2());
            }
            else if (i == 2){
               System.out.print("\nMédia das provas/Trabalhos:\n");
               System.out.println(objAluno.calcMediaProva() + "\n" + objAluno.calcMediaTrab());
            }
            else if (i == 3){
               System.out.print("\nMédia final\n");
               System.out.println(objAluno.calcMediaFinal());
            }
        }
    }
    
}
