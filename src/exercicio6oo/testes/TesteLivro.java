package exercicio6oo.testes;

import exercicio6oo.classes.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("A mordida do tubarão banguela", "Fulano Parametrizado", "Terror", true);

        livro1.setTitulo("Dom Quixote");
        livro1.setAutor("Miguel de Cervantes");
        livro1.setGenero("Romance");
        //livro1.setEmprestado(true);

        System.out.printf("Dados do livro: \n");
        System.out.printf("Título: %s\n", livro1.getTitulo());
        System.out.printf("Autor: %s\n", livro1.getAutor());
        System.out.printf("Gênero: %s\n", livro1.getGenero());

        livro1.emprestarLivro(false);
        livro1.devolverLivro(false);
        livro1.verificar();

        System.out.println("-----Parametrizando-----");
        System.out.println(livro2);
        livro2.emprestarLivro(true);
    }
}
