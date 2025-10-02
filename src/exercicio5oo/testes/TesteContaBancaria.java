package exercicio5oo.testes;

import exercicio5oo.classes.ContaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria cbx = new ContaBancaria();

        cbx.setNumeroConta("182546789271");
        cbx.setTitular("Seu Madruga");
        cbx.setSaldo(-2000);

        System.out.printf("Olá Seu Madruga! Dados da sua conta: \n");
        System.out.printf("Titular: %s\n", cbx.getTitular());
        System.out.printf("Nº conta: %s\n", cbx.getNumeroConta());
        System.out.printf("Saldo: %.2f $$\n", cbx.getSaldo());

        cbx.depositar(500);
        cbx.imprimirSaldo();

        if (cbx.getSaldo()< 0){
            System.out.printf("Pague-me o aluguel %s !\n\n",cbx.getTitular());
        }
    }
}
