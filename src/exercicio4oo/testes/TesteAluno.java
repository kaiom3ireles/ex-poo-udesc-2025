package exercicio4oo.testes;

import exercicio4oo.classes.Aluno;

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

        System.out.printf("Matricula: .... %i\n", kaio.getMatricula());
        System.out.printf("Nome: .... %s\n", kaio.getNome());
        System.out.printf("Idade: .... %i\n", kaio.getIdade());
        System.out.printf("Nota1: .... %i\n", kaio.getNota1());
        System.out.printf("Nota2: .... %i\n", kaio.getNota2());
        System.out.printf("Nota3: .... %i\n", kaio.getNota3());
        System.out.printf("Nota4: .... %i\n", kaio.getNota4());
    }
}
