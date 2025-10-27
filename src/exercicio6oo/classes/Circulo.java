package exercicio6oo.classes;

public class Circulo {
    private double raio;

    public Circulo(){
        this.raio = 0.0;
    }

    public Circulo(double raio){
        setRaio(raio);
    }
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

    public String toString(){
        return "Dados do retângulo: "
                + "\nRaio: " + this.raio
                + "\nDiametro: " + this.calcularDiametro()
                + "\nArea: " + this.calcularArea()
                + "\nPerimetro: " + this.calcularPerimetro();
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        if(raio >=0 && raio<=1000) {
            this.raio = raio;
        }
        else{
            System.out.println("Raio("+raio+") inválido, deve estar entre 0 e 1000.");
            System.exit(0);
        }
    }
}
