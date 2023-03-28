
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.text.DecimalFormat;

public class Aplic {

    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat ("0.00");
       
       Instrutor objInstrutor = new Instrutor(1, "José", "15 91234-5678");
       Cliente objCliente = new Cliente("1234567891-0", "Carlos Tijolo", "15 94321-9876");
       
        objInstrutor.setAreaAtuacao("Tecnologia");
        System.out.println("Identificação: " + objInstrutor.getIdentificacao());
        System.out.println("Nome: " + objInstrutor.getNome());
        System.out.println("Telefone: " + objInstrutor.getTelefone());
        System.out.println("Area atuação: " + objInstrutor.getAreaAtuacao());
        
        objCliente.setAltura(1.76);
        objCliente.setPeso(60);
        System.out.println("\nCPF: " + objCliente.getCpf());
        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Telefone: " + objCliente.getTelefone());
        System.out.println("Altura: " + objCliente.getAltura());
        System.out.println("Peso: " + objCliente.getPeso());
        System.out.println("IMC: " + df.format(objCliente.calcIMC()));
    }
    
}
