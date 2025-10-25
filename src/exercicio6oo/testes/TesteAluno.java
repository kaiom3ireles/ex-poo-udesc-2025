package exercicio6oo.testes;

import exercicio6oo.classes.Aluno;

public class TesteAluno {
    public static void main(String[] args) {

        Aluno kaio = new Aluno();
        Aluno chaves = new Aluno("888888888", "Chaves",
                                 8, 1.0, 1.5, 4.2, 5.0);
        kaio.setMatricula("123456789");
        kaio.setNome("Kaio Meireles");
        kaio.setIdade(21);
        kaio.setNota1(10);
        kaio.setNota2(8);
        kaio.setNota3(9);
        kaio.setNota4(8.5);

        System.out.println(kaio);
        System.out.println(chaves);

    }
}
