
import java.util.Scanner;

public class Exemplo1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int codProd, qtdeVend;
        String descProd;
        double Desconto, valDesconto;
        double precUnit, valCompra;
        
        System.out.print("Digite o código do produto: ");
        codProd = entrada.nextInt();//scanf("%d", &codProd);
        
        System.out.print("Digite a descrição: ");
        descProd = entrada.next(); //scanf("%s", &descProd);
        
        System.out.print("Digite o preço unitário: ");
        precUnit = entrada.nextDouble();//scanf("%lf", &precUnit);
        
        System.out.print("Digite a quantidade vendida: ");
        qtdeVend = entrada.nextInt();//scanf("%d", &qtdeVend);
        
        valCompra = precUnit * qtdeVend;
        System.out.println("\nValor da compra: " + valCompra);
        
        if  (valCompra >= 850) {
            Desconto = 0.10;
        }
        else {
            Desconto = 0; 
        }
        valDesconto = Desconto * valCompra;
        valCompra = valCompra - (Desconto * valCompra);
        System.out.println("\nValor da compra com desconto: " + valDesconto);
        System.out.println("\nValor da compra com desconto: " + valCompra);
    }
    
}
