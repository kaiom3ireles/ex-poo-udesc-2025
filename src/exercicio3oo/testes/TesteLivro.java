package exercicio3oo.testes;

import exercicio3oo.classes.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Quixote";
        livro1.autor = "Miguel de Cervantes";
        livro1.genero = "Romance";
        livro1.emprestado = true;

        System.out.println("Dados do livro: ");
        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Gênero: " + livro1.genero+"\n");

        if (livro1.emprestado == true)
        {
            System.out.println("Status: EMPRESTADO");
        }
        else
        {
            System.out.println("Status: DISPONÍVEL");
        }
    }
}
//Exercicio 02 finalizado aqui