package exercicio6oo.classes;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria() {
        this.numeroConta = "";
        this.titular = "";
        this.saldo = 0.0;
    }

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        setNumeroConta(numeroConta);
        setTitular(titular);
        setSaldo(saldo);
    }

    public String toString() {
        return "Dados da conta"
                + "\nTitular: " + this.titular
                + "\nNumero da conta: " + this.numeroConta
                + "\nSaldo: R$ " + this.saldo;
    }

    public void depositar(double valor) {
        if (valor >= 0) {
            System.out.println("Depositando...\n");
            this.saldo += valor;
        } else {
            System.out.println("Depósito inválido");
            System.exit(0);
        }
    }

    public void sacar(double valor) {
        if (valor >= 0) {
            System.out.println("Sacando...\n");
            this.saldo -= valor;
        } else {
            System.out.println("Saque inválido");
            System.exit(0);
        }
    }

    public void imprimirSaldo() {
        System.out.printf("R$ %.2f\n", this.saldo);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println(this.titular + ", saldo insuficiente");
            System.exit(0);
        }
    }
}
