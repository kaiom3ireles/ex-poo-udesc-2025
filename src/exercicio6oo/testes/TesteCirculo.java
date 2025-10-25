package exercicio6oo.testes;

import exercicio6oo.classes.Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo a = new Circulo();
        Circulo b = new Circulo(2.5);
        a.setRaio(9.5);

        System.out.printf("O círculo indicado é de raio %.2f\n",a.getRaio());

        System.out.printf("Área: %.2f\nPerímetro: %.2f\nDiâmetro: %.2f\n\n", a.calcularArea(),
                a.calcularPerimetro(), a.calcularDiametro());
        System.out.println("--------------------------");
        System.out.println(b);
    }
}
