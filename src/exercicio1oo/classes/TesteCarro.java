package exercicio1oo.classes;

public class TesteCarro {
    public static void main(String[] args) {
        Carro a = new Carro();

        a.marca = "Chevrolet";
        a.modelo = "Chevette";
        a.ano = 1993;
        a.velocidade = 300;

        System.out.println("Dados do carro: \n");
        System.out.printf("%s %s %d\n",a.marca,a.modelo,a.ano);
        System.out.println("Velocidade: "+a.velocidade+" km/h");
    }
}
