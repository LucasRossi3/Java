
import fatec.poo.model.Retangulo;
import java.util.Scanner;


public class Aplic {
    public static void main(String[] args) {
        double medAlt, medBase;
        
        //Instanciação dos objetos
        Scanner entrada = new Scanner (System.in);
        Retangulo objRet = new Retangulo();
        
        //Entrada de dados
        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        //Passagem de mensagens para o objeto da classe retangulo
        objRet.setAltura(medAlt);
        objRet.setbase(medBase);
        
        //Exibição dos métodos que calculam o perímetro e a área do retângulo
        System.out.println("\nMedida do perimetro é: " + objRet.calcPerimetro());
        System.out.println("Medida da área é: " + objRet.calcArea());
        
        //Exibição dos métodos que acessam o conteúdo dos atributos altura e area
        System.out.println("\nMedida da altura é: " + objRet.getAltura());
        System.out.println("Medida da base é: " + objRet.getBase());
    }
    
}
