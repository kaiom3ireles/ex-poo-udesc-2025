package exercicio3oo.testes;

import exercicio3oo.classes.Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo y = new Circulo();
        y.setRaio(9.5);

        System.out.printf("O círculo indicado é de raio %.2f\n", y.getRaio());
    }
}
