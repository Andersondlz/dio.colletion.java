package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
     public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
     }

     public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
     }
     public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
     }

     public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(01, "Maça", 2.5, 20);
        cadastroProdutos.adicionarProduto(02, "Banana", 3.5, 10);
        cadastroProdutos.adicionarProduto(03, "Laranja", 4.5, 25);
        cadastroProdutos.adicionarProduto(04, "Pessego", 2.5, 20);
        
        System.out.println(cadastroProdutos.produtoSet);
        System.out.println("----------------------Listando Produto por Nome-----------------");
        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println("----------------------Listando Produto por Preço-----------------");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
     }
}
