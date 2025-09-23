package exercicio4oo.testes;

import exercicio4oo.classes.Retangulo;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo x = new Retangulo();
        x.setLargura(10.85);
        x.setAltura(20.40);

        System.out.printf("Dados do retângulo: \n");
        System.out.printf("Largura: %.2f\n", x.getLargura());
        System.out.printf("Altura: %.2f\n", x.getAltura());

        System.out.printf("Área de %.2f", x.calcularArea());
    }
}
