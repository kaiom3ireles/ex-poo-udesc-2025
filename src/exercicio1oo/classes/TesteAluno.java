package exercicio1oo.classes;

public class TesteAluno {
    public static void main(String[] args) {

        Aluno kaio = new Aluno();
        kaio.matricula = "123456789";
        kaio.nome = "Kaio Meireles";
        kaio.idade = 21;
        kaio.nota1 = 8;
        kaio.nota2 = 7;
        kaio.nota3 = 10;
        kaio.nota4 = 9;

        System.out.println("Matricula: ...." + kaio.matricula);
        System.out.println("Nome: ...." + kaio.nome);
        System.out.println("Idade: ...." + kaio.idade);
        System.out.println("Nota1: ...." + kaio.nota1);
        System.out.println("Nota2: ...." + kaio.nota2);
        System.out.println("Nota3: ...." + kaio.nota3);
        System.out.println("Nota4: ...." + kaio.nota4);
    }
}
