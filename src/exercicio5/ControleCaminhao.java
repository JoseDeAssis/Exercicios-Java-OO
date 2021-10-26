package exercicio5;

import java.util.List;

public class ControleCaminhao extends Controle {

    public static void selecionaCaminhao(List<Caminhao> listaCaminhao) {
        Caminhao caminhaoSelecionado = new Caminhao("", 0);
        int maiorCapacidade = 0;

        for(Caminhao caminhao: listaCaminhao) {
            if(maiorCapacidade < caminhao.capacidadeTotalPluviometros()) {
                maiorCapacidade = caminhao.capacidadeTotalPluviometros();
                caminhaoSelecionado = caminhao;
            }
        }

        System.out.println("Tipo do caminhão selecionado: " + caminhaoSelecionado.getTipoCaminhao());
        System.out.println("Lista de pluviômetros transportados pelo caminhão:");
        for(Pluviometro pluviometro: caminhaoSelecionado.getListaPluviometro()) {
            System.out.println("Tipo do pluviômetro: " + pluviometro.getTipo());
            System.out.println("Capacidade do pluviômetro: " + pluviometro.getCapacidade() + "\n");
        }
    }
}
