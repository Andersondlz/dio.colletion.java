package map.Ordenacao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        //Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
       // Set<LocalDate> dateSet = eventosMap.keySet();
       // Collection<Evento> values = eventosMap.values();
       // eventosMap.get(values);
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento é : "+ proximoEvento + " acontecerá na data "+ proximaData);
                break;
            }
        }


    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        System.out.println(LocalDate.now());
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 19), "Matheus", "Aniversario");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 13), "Vanessa", "Aniversario");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 11, 1), "Anderson", "Aniversario");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 25), "Casa", "Natal");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 2), "Casa", "Carnaval");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }

}
