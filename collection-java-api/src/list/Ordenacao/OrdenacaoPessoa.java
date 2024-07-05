package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    // atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

public void adicionarPessoa(String nome, int idade, double altura){
    pessoaList.add(new Pessoa(nome, idade, altura));
}

public List<Pessoa> ordenarPorIdade(){
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
}

public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort (pessoasPorAltura, new ComparatorPorAltura());
    return pessoasPorAltura;
}

public static void main(String[] args) {
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
    ordenacaoPessoa.adicionarPessoa("Anderson da Luz", 42, 1.61);
    ordenacaoPessoa.adicionarPessoa("Matheus Augusto Luz", 13, 1.57);
    ordenacaoPessoa.adicionarPessoa("Vanessa A. da Luz", 43, 1.59);
    ordenacaoPessoa.adicionarPessoa("Jefferson da Luz", 32, 1.79);
    ordenacaoPessoa.adicionarPessoa("Anderson da Luz", 42, 1.61);
    System.out.println("--------------Ordenado Normal------------------");
    System.out.println(ordenacaoPessoa.pessoaList);
    System.out.println("------------Ordenado Por Altura--------------------");
    System.out.println(ordenacaoPessoa.ordenarPorAltura());
    System.out.println("-------------Ordenado por Idade-------------------");
    System.out.println(ordenacaoPessoa.ordenarPorIdade());
}


} 
