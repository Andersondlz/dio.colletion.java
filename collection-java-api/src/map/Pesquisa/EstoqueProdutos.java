package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;



public class EstoqueProdutos {

    //atributod
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto (long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));

    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p: estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco);
                    produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();
        estoque.adicionarProduto(1, "Maçã", 10, 2.6);
        estoque.adicionarProduto(2, "Banana", 15, 5.4);
        estoque.adicionarProduto(3, "Laranja", 5, 5.8);
        estoque.adicionarProduto(2, "Uva", 30, 1.4);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque é " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais barato é " + estoque.obterProdutoMaisCaro());

    }

}
