package exercicio5oo.testes;

import exercicio5oo.classes.Aluno;

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

        System.out.println(kaio);

    }
}
