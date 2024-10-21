package Pesquisa;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    //Evitar que o retorno seja o endereco de memoria da variavel
    @Override
    public String toString() {
//        return "Livro{" +
//                "titulo='" + titulo + '\'' +
//                ", autor='" + autor + '\'' +
//                ", anoPublicacao=" + anoPublicacao +
//                '}';
        return "Titulo do livro: " + titulo + '\n'
                + "Autor: " + autor + '\n'
                + "Ano da Publicacao: " + anoPublicacao;
    }
}
