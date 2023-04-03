
import fatec.poo.model.FuncionarioHorista;
import java.text.DecimalFormat;

public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1979", 15.80);
        
        funcHor.setQtdeHorTrab(90);
        
        System.out.println("Salario Bruto  =>  " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto  =>  " + df.format(funcHor.calcDesconto()));
        System.out.println("Salario Líquido  =>  " + df.format(funcHor.calcSalLiquido()));
        
        
    }
    
}
