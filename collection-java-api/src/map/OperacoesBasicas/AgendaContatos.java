package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Anderson da Luz", 999319090);
        agendaContatos.adicionarContato("Vanessa K da Luz", 999473070);
        agendaContatos.adicionarContato("Matheus Augusto K da Luz", 999737479);
        agendaContatos.adicionarContato("Olandir da Luz", 999319090);
        agendaContatos.adicionarContato("Vanessa K da Luz", 999473070);

        
        
        agendaContatos.exibirContatos();    
        agendaContatos.removerContato("Vanessa K da Luz");
        agendaContatos.exibirContatos();   

        System.out.println("Qual é o numero do telefone de Anderson da Luz?");
        System.out.println("O numero a ser pesquisado é " + agendaContatos.pesquisarPorNome("Anderson da Luz"));
    }
}

