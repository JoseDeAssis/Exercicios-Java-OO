package exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Caminhao {
    private List<Pluviometro> listaPluviometro;
    private String tipoCaminhao;
    private int qtdPluviometros;

    public Caminhao(String tipoCaminhao, int qtdPluviometros) {
        this.listaPluviometro = new ArrayList<>();
        this.tipoCaminhao = tipoCaminhao;
        this.qtdPluviometros = qtdPluviometros;
    }

    public List<Pluviometro> getListaPluviometro() {
        return listaPluviometro;
    }

    public String getTipoCaminhao() {
        return tipoCaminhao;
    }

    public int getQtdPluviometros() {
        return qtdPluviometros;
    }

    public int capacidadeTotalPluviometros() {
        int capacidadeTotal = 0;
        for(Pluviometro pluviometro: listaPluviometro) {
            capacidadeTotal += pluviometro.getCapacidade();
        }

        return capacidadeTotal;
    }

    public int compareTo(Caminhao caminhao) {
        return Integer.compare(caminhao.capacidadeTotalPluviometros(), this.capacidadeTotalPluviometros());
    }
}
