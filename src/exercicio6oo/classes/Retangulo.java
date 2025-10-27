package exercicio6oo.classes;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo() {
        this.largura = 0.0;
        this.altura = 0.0;
    }

    public Retangulo(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }

    public String toString() {
        return "Dados do retângulo"
                + "\nLargura: " + this.largura
                + "\nAltura: " + this.altura
                + "\nÁrea: " + this.calcularArea();
    }

    public double calcularArea() {
        double area = largura * altura;
        return area;
    }

    public void setLargura(double largura) {
        if (largura <= 0 || largura >= 1000) {
            System.out.println("Largura(" + largura + ") inválida, deve estar entre 0 e 1000");
            System.exit(0);
        } else {
            this.largura = largura;
        }
    }

    public void setAltura(double altura) {
        if (altura <= 0 || altura >= 1000) {
            System.out.println("Altura(" + altura + ") inválida, deve estar entre 0 e 1000");
            System.exit(0);
        } else {
            this.altura = altura;
        }
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }


}
