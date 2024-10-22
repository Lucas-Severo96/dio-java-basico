package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()) {
            for(Livro l: livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    //Adicionando livros na lista de livros do mesmo autor
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }

        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                //Retorna sempre o 1º livro encontrado na lista
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Harry Potter", "J. k. Rowling", 2003);
        catalogoLivros.adicionarLivro("Harry Potter", "J. k. Rowling", 2007);
        catalogoLivros.adicionarLivro("Avengers", "Alex Irvine", 2016);
        catalogoLivros.adicionarLivro("Thor Ragnarok", "Jim McCann", 2017);

        System.out.println(catalogoLivros.pesquisarPorAutor("J. k. Rowling"));
        System.out.println();
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010,2017));
        System.out.println();
        System.out.println(catalogoLivros.pesquisarPorTitulo("Harry Potter"));

    }

}
