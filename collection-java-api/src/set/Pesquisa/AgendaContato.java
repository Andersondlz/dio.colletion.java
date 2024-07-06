package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    } 

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet){
            if  (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    // testar aplicação

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContato();

        agendaContato.adicionarContato("Anderson da Luz", 999319090);
        agendaContato.adicionarContato("Anderson da Luz", 0);
        agendaContato.adicionarContato("Vanessa da Luz", 999473070);
        agendaContato.adicionarContato("Matheus Koglin", 999474340);
        agendaContato.adicionarContato("Ani Maria da Luz", 991586558);

        agendaContato.exibirContato();

        System.out.println(agendaContato.pesquisarPorNome("Ani Maria da Luz"));

        System.out.println("Contato Atualizado: " + agendaContato.atualizarNumeroContato("Anderson da Luz",33330872));
        System.out.println(agendaContato.pesquisarPorNome("Anderson da Luz"));
        agendaContato.exibirContato();
    }
}
