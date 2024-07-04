package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalgoLivros {
    // atributo

    private List<Livro> livrolist;

    public CatalgoLivros() {
        this.livrolist = new ArrayList<>();
    }
    public void adicionarlivro(String titulo, String autor, int anoPublicacao){
        livrolist.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrolist.isEmpty()) {
            for (Livro l : livrolist){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrolist.isEmpty()) {
            for (Livro l : livrolist){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorLivro(String titulo){
        Livro livroPorTitulo = null;
        if (!livrolist.isEmpty()){
            for (Livro l : livrolist){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalgoLivros catalgoLivros = new CatalgoLivros();
        catalgoLivros.adicionarlivro("Livro 1", "autor 1", 2010);
        catalgoLivros.adicionarlivro("Livro 1", "autor 2", 2015);
        catalgoLivros.adicionarlivro("Livro 3", "autor 3", 2000);
        catalgoLivros.adicionarlivro("Livro 4", "autor 3", 2011);
        catalgoLivros.adicionarlivro("Livro 5", "autor 5", 2009);

        System.out.println(catalgoLivros.pesquisarAutor("autor 3"));
        System.out.println(catalgoLivros.pesquisarPorIntervaloAnos(2000, 2011));
        System.out.println(catalgoLivros.pesquisarPorLivro("Livro 1"));
    }
}
