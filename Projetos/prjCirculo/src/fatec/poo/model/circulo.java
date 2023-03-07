package fatec.poo.model;


public class circulo {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calcArea(){
        return (3.1416 * (Math.pow(raio, 2)));
    }
    
    public double calcPerimetro (){
        return (2* 3.1416 * raio);
    }
    
    public double calcDiametro (){
        return (2 * raio);
    }
}