package exercicio5oo.classes;

public class Aluno {
    //ATRIBUTOS PRIVADOS
    private String matricula, nome;
    private int idade, nota1, nota2, nota3, nota4;

    public Aluno(){
        this.matricula = "";
        this.nome = "";
        this.idade = 0;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.nota4 = 0;
    }

    //Funçao para calcular média de aluno
    public double calcularMedia(){
        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        return media;
    }

    public void imprimirSituacao() {
        if (this.calcularMedia() >= 7) {
            System.out.printf("%s está APROVADO\n", this.nome);
        } else {
            System.out.printf("%s está REPROVADO\n", this.nome);
        }
    }

    @Override
    public String toString() {
        return "------ Aluno ------"
                +"\nMatrícula: " + this.matricula
                +"\nNome: "+this.nome
                +"\nIdade: "+this.idade
                +"\nNota1: "+this.nota1
                +"\nNota2: "+this.nota2
                +"\nNota3: "+this.nota3
                +"\nNota4: "+this.nota4
                +"\nMédia total: "+this.calcularMedia();
    }

    //MÉTODOS PÚBLICOS
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setNota1(int nota1) { this.nota1 = nota1; }
    public void setNota2(int nota2) { this.nota2 = nota2; }
    public void setNota3(int nota3) { this.nota3 = nota3; }
    public void setNota4(int nota4) { this.nota4 = nota4; }

    public String getMatricula() { return this.matricula; }
    public String getNome(){ return this.nome; }
    public int getIdade() { return this.idade; }
    public int getNota1() { return this.nota1; }
    public int getNota2() { return this.nota2; }
    public int getNota3() { return this.nota3; }
    public int getNota4() { return this.nota4; }
}
