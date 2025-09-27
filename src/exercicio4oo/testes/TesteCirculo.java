package exercicio4oo.testes;

import exercicio4oo.classes.Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo y = new Circulo();
        y.setRaio(9.5);

        System.out.printf("O círculo indicado é de raio %.2f\n",y.getRaio());

        System.out.printf("Área: %.2f\nPerímetro: %.2f\nDiâmetro: %.2f\n\n", y.calcularArea(),
                y.calcularPerimetro(), y.calcularDiametro());
    }
}
