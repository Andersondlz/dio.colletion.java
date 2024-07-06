package set.OperacaoBasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos

    private Set<Convidado> convidadoSet;
   
    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();

    }
    public void adicionarPessoa(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));

    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite ){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidado(){
        return convidadoSet.size();
    }
    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existe "+ conjuntoConvidados.contarConvidado() + " convidados dentro do Set Convidados ");

        conjuntoConvidados.adicionarPessoa("Anderson da Luz", 1982);
        conjuntoConvidados.adicionarPessoa("Matheus Augusto", 2010);
        conjuntoConvidados.adicionarPessoa("Vanessa Angelia Da Luz", 1983);
        conjuntoConvidados.adicionarPessoa("Anderson da Luz", 1982);
        System.out.println("Existe "+ conjuntoConvidados.contarConvidado() + " dentro do Set Convidados ");
        conjuntoConvidados.exibirConvidado();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2010);
        System.out.println("Existe "+ conjuntoConvidados.contarConvidado() + " dentro do Set Convidados ");
        conjuntoConvidados.exibirConvidado();
    }


}