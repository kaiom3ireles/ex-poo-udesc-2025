package exercicio4oo.classes;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

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
