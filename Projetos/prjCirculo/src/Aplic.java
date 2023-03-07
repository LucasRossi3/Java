
import fatec.poo.model.circulo;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        double raio;
        
        circulo objRet = new circulo();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o valor do raio: ");
        raio = entrada.nextDouble();
        objRet.setRaio(raio);
        
        System.out.println("\nO raio é igual a: " + objRet.getRaio());
        System.out.println("A área do círculo é igual a: " + objRet.calcArea());
        System.out.println("O perímetro do círculo é igual a: " + objRet.calcPerimetro());
        System.out.println("O diametro do cícrulo é igual a: " + objRet.calcDiametro());
        
    }
    
}
