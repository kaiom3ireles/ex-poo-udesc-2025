package exercicio4oo.classes;

public class Retangulo {
    private double largura;
    private double altura;

    public double calcularArea(){
        double area = largura * altura;
        return area;
    }

    public void setLargura(double largura) { this.largura = largura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getLargura() { return largura; }
    public double getAltura() { return altura; }


}
