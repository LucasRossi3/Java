
import fatec.poo.model.QuartoHotel;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        int numMat = 3;
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        QuartoHotel matQuarto[] = new QuartoHotel[numMat];
        int i, numQuarto, cont, RG, dias;
        double totalHotel = 0, valorDiaria;
        int opcao = 0;
        int s;
        
        for(i = 0; i<numMat; i++){
            s = i + 1;
            System.out.println("Digite o valor da diaria para o quarto de n° " + s + ":");
            valorDiaria = entrada.nextDouble();
            matQuarto[i] = new QuartoHotel(s, valorDiaria);
        }
        
        
            while (opcao != 6){
                System.out.println("\n1 – Consultar quarto");
                System.out.println("2 – Reservar quarto");
                System.out.println("3 – Liberar quarto");
                System.out.println("4 – Consultar faturamento quarto");
                System.out.println("5 – Consultar faturamento hotel");
                System.out.println("6 – Sair");
                System.out.println("");
                System.out.println("    Digite a opção: ");
                opcao = entrada.nextInt();
                
                switch (opcao){
                    case 1: 
                    System.out.print("\nDigite o numero do quarto: ");
                    numQuarto = entrada.nextInt();
                    for (cont=0; cont < numMat; cont++){
                        if (matQuarto[cont].getNumquarto() == numQuarto){
                            break;
                        }    
                    }
                    if (cont == numMat) { 
                        System.out.println("\nQuarto nao cadastrado!");
                    }
                    else{
                        if (matQuarto[cont].isSituacao()){
                            System.out.println("\nO quarto está ocupado.");
                        }
                        else {
                            System.out.println("\nO quarto está livre.");
                        }
                    }                    
                    break;
                   
                    case 2: 
                    System.out.print("\nDigite o numero do quarto: ");
                    numQuarto = entrada.nextInt();
                    for (cont=0; cont < numMat; cont++){
                        if (matQuarto[cont].getNumquarto() == numQuarto){
                            break;
                        }    
                    }
                    if (cont == numMat) { 
                        System.out.println("\nQuarto nao cadastrado!");
                    }
                    else{
                        if (matQuarto[cont].isSituacao()){
                            System.out.println("\nO quarto já foi reservado.");
                        }
                        else {
                            System.out.print("\nDigite o seu RG para reservar: ");
                            RG = entrada.nextInt();
                            matQuarto[cont].Reservar(RG);
                            System.out.println("\nVocê reservou o quarto de n° " + matQuarto[cont].getNumquarto());
                        }
                    }
                    break;
                    
                    case 3: 
                    System.out.print("\nDigite o numero do quarto: ");
                    numQuarto = entrada.nextInt();
                    for (cont=0; cont < numMat; cont++){
                        if (matQuarto[cont].getNumquarto() == numQuarto){
                            break;
                        }    
                    }
                    if (cont == numMat) { 
                        System.out.println("\nQuarto nao cadastrado!");
                    }
                    else{
                        if (matQuarto[cont].isSituacao()){
                            System.out.print("\nDigite o numero de dias que o hóspede ficou no quarto: ");
                            dias = entrada.nextInt();
                            System.out.println("\nO quarto de n° " + matQuarto[cont].getNumquarto() + " acabou de ser liberado");
                            System.out.println("O hóspede terá de pagar: " + matQuarto[cont].Liberar(dias));
                        }
                        else {
                            System.out.println("\nO quarto já está livre");
                        }
                    }
                    break;
                    
                    case 4: 
                    System.out.print("\nDigite o numero do quarto: ");
                    numQuarto = entrada.nextInt();
                    for (cont=0; cont < numMat; cont++){
                        if (matQuarto[cont].getNumquarto() == numQuarto){
                            break;
                        }    
                    }
                    if (cont == numMat) { 
                        System.out.println("\nQuarto nao cadastrado!");
                    }
                    else{
                        System.out.println("\nO valor de faturamento do quarto é de: " + df.format(matQuarto[cont].getTotalFaturado()));
                    }
                    break;
                    
                    case 5: 
                    for (cont=0; cont < numMat; cont++){
                        totalHotel += matQuarto[cont].getTotalFaturado();
                    }
                    System.out.println("\nO valor de faturamento do hotel é de: " + df.format(totalHotel));
                    break;
                    
                    case 6: 
                        break;
                        
                    default: 
                        System.out.println("\nOpção inválida. Digite novamente: ");
                        break;
                        
                }
                
            }
            
            
            
            
        
        
        
        
    }
    
}
