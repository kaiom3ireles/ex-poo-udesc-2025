package exercicio5oo.classes;

public class Circulo {
    private double raio;

    public double calcularDiametro(){
        double diametro = 2*this.raio;
        return diametro;
    }
    public double calcularArea(){
        double area = Math.PI*(this.raio*this.raio);
        return area;
    }
    public double calcularPerimetro(){
        double perimetro = 2*Math.PI*(this.raio*this.raio);
        return perimetro;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
