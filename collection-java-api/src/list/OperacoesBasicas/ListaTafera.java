package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTafera {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTafera(){
        this.tarefaList = new ArrayList<>();
    }

    // metado
    // metado de adicior
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    // metodo de remover
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }

        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // metodo de obter numeros
    public int obterNumeroTarefas(){
        return tarefaList.size();
    }

    // metodo de obter descriçoes

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTafera listaTafera = new ListaTafera();
        
        listaTafera.adicionarTarefa("Tarefa 1");
        listaTafera.adicionarTarefa("Tarefa 1");
        listaTafera.adicionarTarefa("Tarefa 3");
        listaTafera.adicionarTarefa("Tarefa 4");
        listaTafera.adicionarTarefa("Tarefa 5");
        System.out.println("O numero total de elemento na lista é " + listaTafera.obterNumeroTarefas());
        listaTafera.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elemento na lista é " + listaTafera.obterNumeroTarefas());

        listaTafera.obterDescricaoTarefas();
    }
}

