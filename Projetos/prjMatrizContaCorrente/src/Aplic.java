
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        ContaCorrente[] matConta = new ContaCorrente[3];
        double saldo, sacar;
        int numero, i, opcao = 0;
        int teste;
        
        for(i=0;i<3;i++){
            System.out.println("\nDigite o numero da conta: ");
            numero = entrada.nextInt();
            System.out.println("\nDigite o numero do saldo: ");
            saldo = entrada.nextDouble();
            
            matConta[i] = new ContaCorrente(numero, saldo);

        }
        
           
           
           do{
                  System.out.println("\n1 - Depositar");
                  System.out.println("2 - Sacar");
                  System.out.println("3 - Consultar Saldo");
                  System.out.println("4 - Listar Contas");
                  System.out.println("5 - Sair\n");
                        
                   System.out.println("\nDigite a opcao: ");
                   opcao = entrada.nextInt();
                   
                   switch (opcao){
                case 1: 
                    teste = 0;
                    System.out.println("\nDigite o numero da conta: ");
                    numero = entrada.nextInt();
                    
                    for(i=0;i<3;i++){
                        if(matConta[i].getNumero() == numero){
                            System.out.println("\nInsira o valor para depositar: ");
                            matConta[i].depositar(entrada.nextDouble());
                        }
                        else {
                            teste += 1;
                        }
                        
                    }
                    
                    if (teste == 2)
                    {
                        continue;
                    }
                    else{
                        System.out.println("\nConta não cadastrada");
                    }
                    
                break;
                case 2: 
                    teste = 0;
                    System.out.println("\nDigite o numero da conta: ");
                    numero = entrada.nextInt();
                    for(i=0;i<3;i++){
                        if(matConta[i].getNumero() == numero){
                            System.out.println("\nInsira o valor para sacar: ");
                            sacar = entrada.nextDouble();
                            if (sacar <= matConta[i].getSaldo()){
                                matConta[i].sacar(sacar);
                            }
                            else{
                                System.out.println("\nSaldo insuficiente\n");
                            }
                        }
                        else {
                            teste += 1;
                        }
                        
                    }  
                    if (teste == 2)
                    {
                        continue;
                    }
                    else{
                        System.out.println("\nConta não cadastrada");
                    }
                    break;
                case 3: 
                    teste = 0;
                    System.out.println("\nDigite o numero da conta: ");
                    numero = entrada.nextInt();
                    for(i=0;i<3;i++){
                        if(matConta[i].getNumero() == numero){
                            System.out.println("\nSeu saldo é de: " + matConta[i].getSaldo());
                        }
                        else {
                            teste += 1;
                        }
                    }
                    if (teste == 2)
                    {
                        continue;
                    }
                    else{
                        System.out.println("\nConta não cadastrada");
                    }
                    break;
                case 4: 
                    System.out.println("Numero da conta    Saldo");
                    for(i=0;i<3;i++){
                        System.out.println( "       "  + matConta[i].getNumero() + "           " +  df.format(matConta[i].getSaldo()));
                    }
                    break;
                case 5:
                    break;
                }
                   }while(opcao < 5);
               
           
           }
              
            
    }
    

