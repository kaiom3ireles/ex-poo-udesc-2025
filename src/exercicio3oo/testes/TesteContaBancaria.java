package exercicio3oo.testes;

import exercicio3oo.classes.ContaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria cbx = new ContaBancaria();

        cbx.numeroConta = "182546789271";
        cbx.titular = "Homer Simpson";
        cbx.saldo = -2000;

        System.out.println("Olá Homer! Dados da sua conta:");
        System.out.println("Titular: " + cbx.titular);
        System.out.println("Nº conta: "+cbx.numeroConta);
        System.out.println("Saldo: "+cbx.saldo+" $$");

        if (cbx.saldo < 0){
            System.out.printf("Você está endividado %s !\n\n",cbx.titular);
        }
    }
}
