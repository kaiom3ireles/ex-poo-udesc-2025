package exercicio4oo.testes;

import exercicio4oo.classes.Aluno;

public class TesteAluno {
    public static void main(String[] args) {

        Aluno kaio = new Aluno();
        kaio.setMatricula("123456789");
        kaio.setNome("Kaio Meireles");
        kaio.setIdade(21);
        kaio.setNota1(7);
        kaio.setNota2(7);
        kaio.setNota3(7);
        kaio.setNota4(7);

        System.out.printf("Matricula: .... %s\n", kaio.getMatricula());
        System.out.printf("Nome: .... %s\n", kaio.getNome());
        System.out.printf("Idade: .... %d\n", kaio.getIdade());
        System.out.printf("Nota1: .... %d\n", kaio.getNota1());
        System.out.printf("Nota2: .... %d\n", kaio.getNota2());
        System.out.printf("Nota3: .... %d\n", kaio.getNota3());
        System.out.printf("Nota4: .... %d\n", kaio.getNota4());

        System.out.println("Média final "+ kaio.calcularMedia());

        kaio.imprimirSituacao();

    }
}
