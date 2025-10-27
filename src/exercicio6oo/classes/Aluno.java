package exercicio6oo.classes;

public class Aluno {
    //ATRIBUTOS PRIVADOS
    private String matricula, nome;
    private int idade;
    private double nota1, nota2, nota3, nota4;

    public String getMatricula() { return this.matricula; }
    public String getNome(){ return this.nome; }
    public int getIdade() { return this.idade; }
    public double getNota1() { return this.nota1; }
    public double getNota2() { return this.nota2; }
    public double getNota3() { return this.nota3; }
    public double getNota4() { return this.nota4; }

    public void setMatricula(String matricula) { this.matricula = matricula; }
    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setNota1(double nota1) {
        if (nota1>=0 && nota1<=10){
            this.nota1 = nota1;
        }
        else {
            System.out.println(this.nome+", Nota 1("+nota1+") deve estar entre 0 e 10");
            System.exit(0);
        }
    }
    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        }
        else {
            System.out.println(this.nome+", Nota 2("+nota2+") deve estar entre 0 e 10");
            System.exit(0);
        }
    }
    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota3 <= 10) {
            this.nota3 = nota3;
        }
        else {
            System.out.println(this.nome+", Nota 3("+nota3+") deve estar entre 0 e 10");
            System.exit(0);
        }
    }
    public void setNota4(double nota4) {
        if (nota4 >= 0 && nota4 <= 10) {
            this.nota4 = nota4;
        }
        else {
            System.out.println(this.nome+", Nota 4("+nota4+") deve estar entre 0 e 10");
            System.exit(0);
        }
    }

    //CONSTRUTORES

    public Aluno(){
        this.matricula = "";
        this.nome = "";
        this.idade = 0;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
        this.nota4 = 0.0;
    }

    public Aluno(String matricula, String nome, int idade,  double nota1,
                 double nota2, double nota3, double nota4){
        setMatricula(matricula);
        setNome(nome);
        setIdade(idade);
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
        setNota4(nota4);
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
        return "\n------ Aluno ------"
                +"\nMatrícula: " + this.matricula
                +"\nNome: "+this.nome
                +"\nIdade: "+this.idade
                +"\nNota1: "+this.nota1
                +"\nNota2: "+this.nota2
                +"\nNota3: "+this.nota3
                +"\nNota4: "+this.nota4
                +"\nMédia total: "+this.calcularMedia();
    }
}
