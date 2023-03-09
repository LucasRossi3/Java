package fatec.poo.model;

public class Livro {
    private int identificacao;
    private boolean situacao;
    private double valMultaDiaria;

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public double getValMultaDiaria() {
        return valMultaDiaria;
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }
 
    public void emprestar(){
        situacao = true;
    }
    
    public double devolver(int a){
        situacao = false;
        return(valMultaDiaria * a);
    }
    
    
}
