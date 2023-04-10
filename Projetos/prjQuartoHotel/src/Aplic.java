
import fatec.poo.model.QuartoHotel;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        QuartoHotel[] matQuarto = new QuartoHotel[3];
        int i;
        
        for(i=0;i<3;i++){
            System.out.println("\nDigite o numero do quarto: ");
            numero = entrada.nextInt();
            System.out.println("\nDigite o numero do saldo: ");
            saldo = entrada.nextDouble();
            
            matConta[i] = new ContaCorrente(numero, saldo);

        }
        
        
    }
    
}
