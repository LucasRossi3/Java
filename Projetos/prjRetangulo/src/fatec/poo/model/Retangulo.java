package fatec.poo.model;


public class Retangulo {
    private double altura;
    private double base;
    
    public void setAltura(double a){
        altura = a;
    }
    public void setbase(double b){
        base = b;
    }
    
    public double calcArea(){
        return(altura*base);
    }
    
    public double calcPerimetro(){
        return(2 * (altura + base));
    }
    
    public double getAltura(){
        return(altura);
    }
    
    public double getBase(){
        return(base);
    }
}
