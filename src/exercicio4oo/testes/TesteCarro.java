package exercicio4oo.testes;

import exercicio4oo.classes.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro a = new Carro();

        a.setMarca("Chevrolet");
        a.setModelo("Chevette");
        a.setAno(1993);
        a.setVelocidade(300);

        System.out.printf("Dados do carro: \n");
        System.out.printf("%s %s %d\n",a.getMarca(),a.getModelo(),a.getAno());
        System.out.printf("Velocidade: %.2f km/h\n", a.getVelocidade());
    }
}
