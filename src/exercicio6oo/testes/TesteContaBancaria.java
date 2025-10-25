package exercicio6oo.testes;

import exercicio6oo.classes.ContaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria cbx = new ContaBancaria();
        ContaBancaria cby = new ContaBancaria("258739814672", "Fulano Parametrizado", 1000.00);

        cbx.setNumeroConta("182546789271");
        cbx.setTitular("Seu Madruga");
        cbx.setSaldo(10);

        System.out.println(cbx);

        cbx.depositar(500);
        cbx.imprimirSaldo();

        System.out.println("-----Parametrizando-----\n\n");
        System.out.println(cby);
    }
}
