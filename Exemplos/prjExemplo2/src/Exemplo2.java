
import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int Numero, Resultado;
        
        System.out.print("Digite o número: ");
        Numero = entrada.nextInt();//scanf("%d", &codProd);
        
        for (int x = 1; x<=10; x++){
             Resultado = Numero * x;
             System.out.println(Numero + "x" + x + "=" + Resultado);
        }
    }
    
}
