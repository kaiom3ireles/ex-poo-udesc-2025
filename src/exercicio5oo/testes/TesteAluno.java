package exercicio5oo.testes;

import exercicio5oo.classes.Aluno;

public class TesteAluno {
    public static void main(String[] args) {

        Aluno kaio = new Aluno();
        Aluno chaves = new Aluno("888888888", "Chaves del ocho",
                                 8, 1.0, 1.5, 4.2, 5.0);
        kaio.setMatricula("123456789");
        kaio.setNome("Kaio Meireles");
        kaio.setIdade(21);
        kaio.setNota1(8.5);
        kaio.setNota2(7);
        kaio.setNota3(6.5);
        kaio.setNota4(9.2);

        System.out.println(kaio);
        System.out.println(chaves);

    }
}
