
package fatec.poo.model;

public class QuartoHotel {
    private int numquarto;
    private double valorDiaria;
    private int numRg;
    private boolean situacao;
    private double totalFaturado;

    public QuartoHotel(int numquarto, double valorDiaria) {
        this.numquarto = numquarto;
        this.valorDiaria = valorDiaria;
        situacao = false;
    }
    
    public void Reservar(int RG){
        numRg = RG;
        situacao = true;
    }
    
    public double Liberar(int numDias){
        totalFaturado += numDias * valorDiaria;
        situacao = false;
        numRg = 0;
        return (numDias * valorDiaria);
    }

    public boolean isSituacao() {
        return situacao;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public int getNumquarto() {
        return numquarto;
    }
    
    
}
