package map.Ordenacao;

public class Evento {
    // atributos

    private String nome;
    private String atracao;

    // metodo contrutor
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    // metodo get
    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Evento [nome=" + nome + ", atracao=" + atracao + "]";
    }

}
