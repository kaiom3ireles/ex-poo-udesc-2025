package exercicio5oo.testes;

import exercicio5oo.classes.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro a = new Carro();

        a.setMarca("Chevrolet");
        a.setModelo("Chevette");
        a.setAno(1993);
        a.setVelocidade(300);

        Carro b = new Carro("Volkswagen", "Fusca", 1966, 110.0);
        System.out.println(a);
        a.acelerar();
        a.imprimirVel();
        System.out.println("\n\n");

        System.out.println(b);
        b.desacelerar();
        b.imprimirVel();
        System.out.println("\n\n");

    }
}
