
import fatec.poo.model.Livro;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
    int identificacao;
    boolean situacao;
    double valMultaDiaria;
    int opcao = 0;
    int diasAtraso;
    
    Livro objLivro = new Livro();
    Scanner entrada = new Scanner(System.in);
    
    
    System.out.print("Insira a identificação do livro: ");
    identificacao = entrada.nextInt();
    System.out.print("Insira a situação do livro: ");
    situacao = entrada.nextBoolean();
    System.out.print("Insira o valor da multa diária: ");
    valMultaDiaria = entrada.nextDouble();
    
    objLivro.setIdentificacao(identificacao);
    objLivro.setSituacao(situacao);
    objLivro.setValMultaDiaria(valMultaDiaria);
    
    while(opcao != 4){
        System.out.print ("----------------------------------------------");
        System.out.println("\n1 - Consultar livro");
        System.out.println("2 - Emprestar livro");
        System.out.println("3 - Devolver livro");
        System.out.println("4 - Sair");
        System.out.print ("----------------------------------------------");
        System.out.println("\n    Digite a opção:");

        opcao = entrada.nextInt();
        
        if (opcao == 4){
                break;
            }
            else if(opcao != 3 && opcao != 2 && opcao != 1){
                System.out.println("Opção errada, digite novamente: ");
            }
            else if (opcao == 1){
               System.out.print("\nA situação do livro se encontra:");
               if(situacao == true){
                   System.out.print("\nEmprestado\n");
               }
               else{
                   System.out.print("\nDisponível\n");
               }
            }
            else if (opcao == 2){
               if(situacao == true){
                   System.out.print("\nLivro emprestado, aguarde até ele estiver disponível.\n");
               }
               else{
                   System.out.print("\nEmprestado, agora ele é seu :)\n");
                   situacao = true;
               }
            }
            else if (opcao == 3){
               System.out.print("\nDigite a quantidade de dias em atraso: ");
               diasAtraso = entrada.nextInt();
               if(situacao == false){
                   System.out.print("Não tem como devolver, pois o livro não está emprestado.\n");
               }
               else{
                   if(objLivro.devolver(diasAtraso) == 0){
                   System.out.print("Não será necessário pagar multa\n");
                   situacao = false;
                   }
                    else{
                        System.out.print("Será necessário pagar " + objLivro.devolver(diasAtraso) + "R$" + "\n");
                        situacao = false;
                    }
               }
            }
    } 
    
    }
    
}

