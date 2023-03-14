
import fatec.poo.model.ContaCorrente;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
       int opcao;
       double depositar, sacar;
       Scanner entrada = new Scanner(System.in);
        
       System.out.println("\nDigite o numero e o saldo da conta, respectivamente: ");
       ContaCorrente objConta = new ContaCorrente(entrada.nextInt(), entrada.nextDouble());
       
       do{
          
           System.out.println("\n1 - Depositar");
           System.out.println("2 - Sacar");
           System.out.println("3 - Consultar Saldo");
           System.out.println("4 - Sair\n");
           
           System.out.println("\nDigite a opcao: ");
           opcao = entrada.nextInt();
           
           switch (opcao){
                case 1: System.out.println("\nInsira o valor para depositar: \n");
                objConta.depositar(entrada.nextDouble());
                break;
                case 2: System.out.println("\nInsira o valor para sacar: \n");
                sacar = entrada.nextDouble();
                if (sacar <= objConta.getSaldo()){
                    objConta.sacar(sacar);
                }
                else{
                    System.out.println("\nSaldo insuficiente\n");
                }
                break;
                case 3: 
                    System.out.println("\nSeu saldo é de: " + objConta.getSaldo());
                    
                    break;
                case 4: 
                    break;
           }
              
           
       }while(opcao <4);
        
        
        
        
    }
    
}
