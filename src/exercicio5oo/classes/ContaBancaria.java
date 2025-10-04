package exercicio5oo.classes;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(){
        this.numeroConta = "";
        this.titular = "";
        this.saldo = 0.0;
    }

    public ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String toString(){
        return "Dados da conta"
                +"\nTitular: " + this.titular
                +"\nNumero da conta: " + this.numeroConta
                +"\nSaldo: R$" + this.saldo;
    }
    public void depositar(double valor) {
        this.saldo+=valor;
    }

    public void sacar(double valor){
        this.saldo-=valor;
    }

    public void imprimirSaldo(){
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
        this.saldo = saldo;
    }
}
