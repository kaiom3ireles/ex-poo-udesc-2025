package exercicio3oo.testes;

import exercicio3oo.classes.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Dom Quixote");
        livro1.setAutor("Miguel de Cervantes");
        livro1.setGenero("Romance");
        livro1.setEmprestado(true);

        System.out.printf("Dados do livro: \n");
        System.out.printf("Título: %s\n", livro1.getTitulo());
        System.out.printf("Autor: %s\n", livro1.getAutor());
        System.out.printf("Gênero: %s\n", livro1.getGenero());

        if (livro1.isEmprestado() == true) {
            System.out.printf("Status: EMPRESTADO\n");
        } else {
            System.out.printf("Status: DISPONÍVEL\n");
        }
    }
}
//Exercicio 02 finalizado aqui