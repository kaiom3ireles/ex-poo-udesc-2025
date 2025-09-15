package exercicio3oo.testes;

import exercicio3oo.classes.Retangulo;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo x = new Retangulo();
        x.largura = 10.85;
        x.altura = 20.40;

        System.out.println("Dados do retângulo: ");
        System.out.println("Largura: " + x.largura);
        System.out.println("Altura: " + x.altura);
    }
}
