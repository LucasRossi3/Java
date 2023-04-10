package fatec.poo.model;

public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private int numRG;
    private boolean situacao;
    private double totalFaturado;

    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
        situacao = false;
    }
    
    public void Reservar (int RG){
        numRG = RG;
        situacao = true;
    }
    
    public double Liberar (int numDias){
        totalFaturado += numDias * valorDiaria;
        numRG = 0;
        situacao = false;
        return (numDias * valorDiaria);
        
    }

    public boolean isSituacao() {
        return situacao;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
    
    
}
