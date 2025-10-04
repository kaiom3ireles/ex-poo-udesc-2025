package exercicio5oo.classes;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo() {
        this.largura = 0.0;
        this.altura = 0.0;
    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public String toString(){
        return "Dados do retângulo"
                +"\nLargura: " + this.largura
                +"\nAltura: " + this.altura
                +"\nÁrea: " + this.calcularArea();
    }

    public double calcularArea(){
        double area = largura * altura;
        return area;
    }

    public void setLargura(double largura) { this.largura = largura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getLargura() { return largura; }
    public double getAltura() { return altura; }


}
