
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1979", 15.80);
        FuncionarioMensalista funcMens = new FuncionarioMensalista(1020, "João da Silva", "05/03/1997", 1200);
        FuncionarioComissionado funcComis = new FuncionarioComissionado(1020, "Carlos Alberto", "05/03/1957", 15);
        
        funcHor.setQtdeHorTrab(90);
        funcMens.setNumSalMin(3);
        funcComis.setSalBase(1000);
        funcComis.setCargo("Programador");
        funcHor.setCargo("Analista");
        funcMens.setCargo("Contador");
        
        System.out.println("        Funcionário Horista        ");
        System.out.println("Registro            =>  " + funcHor.getRegistro());
        System.out.println("Nome                =>  " + funcHor.getNome());
        System.out.println("Data admissão       =>  " + funcHor.getDtAdmisao());
        System.out.println("Cargo               =>  " + funcHor.getCargo());
        System.out.println("Salario Bruto       =>  " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto            =>  " + df.format(funcHor.calcDesconto()));
        System.out.println("Gratificação        =>  " + df.format(funcHor.calcGratificacao()));
        System.out.println("Salario Líquido     =>  " + df.format(funcHor.calcSalLiquido()) + "\n");
        
        System.out.println("        Funcionário Mensalista       ");
        System.out.println("Registro            =>  " + funcMens.getRegistro());
        System.out.println("Nome                =>  " + funcMens.getNome());
        System.out.println("Data admissão       =>  " + funcMens.getDtAdmisao());
        System.out.println("Cargo               =>  " + funcMens.getCargo());
        System.out.println("Salario Bruto       =>  " + df.format(funcMens.calcSalBruto()));
        System.out.println("Desconto            =>  " + df.format(funcMens.calcDesconto()));
        System.out.println("Salario Líquido     =>  " + df.format(funcMens.calcSalLiquido()) + "\n");
        
        funcComis.addVendas(6000);
        funcComis.addVendas(2000);
        funcComis.addVendas(4000);
        
        System.out.println("        Funcionário Comissionado        ");
        System.out.println("Registro            =>  " + funcComis.getRegistro());
        System.out.println("Nome                =>  " + funcComis.getNome());
        System.out.println("Data admissão       =>  " + funcComis.getDtAdmisao());
        System.out.println("Cargo               =>  " + funcComis.getCargo());
        System.out.println("Salario Base        =>  " + df.format(funcComis.getSalBase()));
        System.out.println("Taxa comissão       =>  " + funcComis.getTaxaComissao() + "%");
        System.out.println("Total Vendas        =>  " + funcComis.getTotalVendas());
        System.out.println("Salario Bruto       =>  " + df.format(funcComis.calcSalBruto()));
        System.out.println("Desconto            =>  " + df.format(funcComis.calcDesconto()));
        System.out.println("Gratificação        =>  " + df.format(funcComis.calcGratificacao()));
        System.out.println("Salario Líquido     =>  " + df.format(funcComis.calcSalLiquido()));
        
    }
    
}
