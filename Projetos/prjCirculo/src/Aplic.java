
import fatec.poo.model.circulo;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        double raio;
        
        circulo objCirc = new circulo();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o valor do raio: ");
        raio = entrada.nextDouble();
        objCirc.setRaio(raio);
        
        System.out.println("\nO raio é igual a: " + objCirc.getRaio());
        System.out.println("A área do círculo é igual a: " + objCirc.calcArea());
        System.out.println("O perímetro do círculo é igual a: " + objCirc.calcPerimetro());
        System.out.println("O diametro do cícrulo é igual a: " + objCirc.calcDiametro());
        
    }
    
}
