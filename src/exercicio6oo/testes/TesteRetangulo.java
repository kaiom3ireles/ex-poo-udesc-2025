package exercicio6oo.testes;

import exercicio6oo.classes.Retangulo;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo x = new Retangulo();
        Retangulo y = new Retangulo(25.2,28.2);
        x.setLargura(10.85);
        x.setAltura(20.40);

        System.out.printf("Dados do retângulo: \n");
        System.out.printf("Largura: %.2f\n", x.getLargura());
        System.out.printf("Altura: %.2f\n", x.getAltura());

        System.out.printf("Área de %.2f\n", x.calcularArea());

        System.out.println("-----Parametrizando-----\n");

        System.out.println(y);
    }
}
