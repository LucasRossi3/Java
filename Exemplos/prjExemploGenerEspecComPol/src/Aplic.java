
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1979", 15.80);
        FuncionarioMensalista funcMens = new FuncionarioMensalista(1020, "João da Silva", "05/03/1997", 1200);
        
        funcHor.setQtdeHorTrab(90);
        funcMens.setNumSalMin(3);
        funcHor.setCargo("Analista");
        funcMens.setCargo("Contador");
        
        System.out.println("Registro            =>  " + funcHor.getRegistro());
        System.out.println("Nome                =>  " + funcHor.getNome());
        System.out.println("Data admissão       =>  " + funcHor.getDtAdmisao());
        System.out.println("Cargo               =>  " + funcHor.getCargo());
        System.out.println("Salario Bruto       =>  " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto            =>  " + df.format(funcHor.calcDesconto()));
        System.out.println("Gratificação        =>  " + df.format(funcHor.calcGratificacao()));
        System.out.println("Salario Líquido     =>  " + df.format(funcHor.calcSalLiquido()) + "\n");
        
        System.out.println("Registro            =>  " + funcMens.getRegistro());
        System.out.println("Nome                =>  " + funcMens.getNome());
        System.out.println("Data admissão       =>  " + funcMens.getDtAdmisao());
        System.out.println("Cargo               =>  " + funcMens.getCargo());
        System.out.println("Salario Bruto       =>  " + df.format(funcMens.calcSalBruto()));
        System.out.println("Desconto            =>  " + df.format(funcMens.calcDesconto()));
        System.out.println("Salario Líquido     =>  " + df.format(funcMens.calcSalLiquido()));
        
    }
    
}
