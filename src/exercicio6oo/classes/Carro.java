package exercicio6oo.classes;

public class Carro {
    private String marca, modelo;
    private int ano;
    private double velocidade;

    public void acelerar(){
        System.out.println("Acelerando...");
        this.velocidade+=10;
    }

    public void desacelerar(){
        System.out.println("Desacelerando...");
        this.velocidade-=10;
    }

    public void imprimirVel(){
        System.out.println("Velocidade atual: "+velocidade);
    }

    public Carro(){
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
        this.velocidade = 0.0;
    }

    public Carro(String marca, String modelo, int ano, double velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }
    public String toString(){
        return "Carro"
                + "\nMarca: "+ marca
                + "\nModelo: "+ modelo
                + "\nAno: "+ ano
                + "\nVelocidade: "+ velocidade;
    }


    public String getMarca() { return this.marca; }
    public String getModelo() { return this.modelo; }
    public int getAno() { return this.ano; }
    public double getVelocidade() { return this.velocidade; }

    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAno(int ano) { this.ano = ano; }
    public void setVelocidade(double velocidade) { this.velocidade = velocidade; }


}
