package exercicio5oo.classes;

public class Livro {
    private String titulo, autor, genero;
    private boolean emprestado;

    public Livro(){
        this.titulo = "";
        this.autor = "";
        this.genero = "";
        this.emprestado = false;
    }
    public Livro(String titulo, String autor, String genero, boolean emprestado){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.emprestado = emprestado;
    }
    public String toString(){
        return "Dados do livro"
                +"\nTitulo: " + this.titulo
                +"\nAutor: " + this.autor
                +"\nGenero: " + this.genero;
    }

    public void emprestarLivro(boolean emprestar){
        if (emprestar == true ){
            this.emprestado = true;
            System.out.println("Realizando novo empréstimo...");
            System.out.println("Empréstimo realizado");
        }
        else{
            this.emprestado = false;
        }
    }
    public void devolverLivro(boolean devolver){
        if (devolver == true ){
            this.emprestado = false;
            System.out.println("Realizando nova devolução...");
            System.out.println("Devolução realizada");
        }
        else{
            this.emprestado = true;
        }
    }

    public void verificar(){
        System.out.println("Verificando situação atual\n........................");
        if (emprestado == true ){
            System.out.println("Livro indisponível");
        }
        else{
            System.out.println("Livro disponível");
        }
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
