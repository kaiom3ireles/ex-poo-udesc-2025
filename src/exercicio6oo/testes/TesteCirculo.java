package exercicio6oo.testes;

import exercicio6oo.classes.Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo a = new Circulo();
        Circulo b = new Circulo(2.5);
        a.setRaio(800);

        System.out.printf("O círculo indicado é de raio %.2f\n",a.getRaio());

        System.out.println(a);
        System.out.println("--------------------------");
        System.out.println(b);
    }
}
