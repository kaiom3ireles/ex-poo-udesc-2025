package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

public class TesteAluno {
    public static void main(String[] args) {

        Aluno kaio = new Aluno();
        kaio.setMatricula("123456789");
        kaio.setNome("Kaio Meireles");
        kaio.setIdade(21);
        kaio.setNota1(8);
        kaio.setNota2(7);
        kaio.setNota3(10);
        kaio.setNota4(9);

        System.out.println("Matricula: ...." + kaio.getMatricula());
        System.out.println("Nome: ...." + kaio.getNome());
        System.out.println("Idade: ...." + kaio.getIdade());
        System.out.println("Nota1: ...." + kaio.getNota1());
        System.out.println("Nota2: ...." + kaio.getNota2());
        System.out.println("Nota3: ...." + kaio.getNota3());
        System.out.println("Nota4: ...." + kaio.getNota4());
    }
}
