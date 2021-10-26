package menu;

import exercicio1.Pessoa;
import exercicio2.Agenda;
import exercicio3.Elevador;
import exercicio4.ControleRemoto;
import exercicio4.Televisao;
import exercicio5.Caminhao;
import exercicio5.Controle;
import exercicio5.ControleCaminhao;
import exercicio5.Pluviometro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static void menuExercicios() {
        Scanner input = new Scanner(System.in);
        String option;

        System.out.println("Digite o exercício que você deseja realizar(1-5):");
        option = input.nextLine().toLowerCase();

        while(!option.equals("sair")) {
            Random random = new Random();

            switch (option) {
                case "1" -> {
                    Pessoa pessoa = new Pessoa("José", LocalDate.of(1995, 1, 21), 1.76f);
                    pessoa.getAge();
                    pessoa.personInfo();
                }
                case "2" -> {
                    Agenda agenda = new Agenda();
                    agenda.armazenaPessoa("Winter Wyvern", 400, 3.49f);
                    agenda.armazenaPessoa("Magnus", 35, 2.2f);
                    agenda.armazenaPessoa("Terrorblade", 2000, 2.3f);
                    agenda.armazenaPessoa("Bane", 200, 1.75f);
                    agenda.armazenaPessoa("Ember Spirit", 500, 1.76f);
                    agenda.armazenaPessoa("Tiny", 157, 5.2f);
                    agenda.armazenaPessoa("Lycan", 28, 1.9f);
                    agenda.armazenaPessoa("Kunkka", 48, 1.88f);
                    agenda.armazenaPessoa("Skyrath Mage", 25, 1.7f);
                    agenda.armazenaPessoa("Enchantress", 20, 2.1f);
                    agenda.armazenaPessoa("Mona", 19, 1.58f);
                    agenda.removePessoa("Lycan");
                    agenda.armazenaPessoa("Hu Tao", 18, 1.56f);
                    int index = agenda.buscaPessoa("Hu Tao");
                    agenda.imprimePessoa(index);
                    agenda.imprimeAgenda();
                }
                case "3" -> {
                    Elevador elevador = new Elevador();
                    elevador.inicializa(6, 10);
                    for (int i = 0; i < 20; i++) {
                        switch (random.nextInt(4)) {
                            case 0 -> elevador.sobe();
                            case 1 -> elevador.desce();
                            case 2 -> elevador.entra();
                            case 3 -> elevador.sai();
                        }
                    }
                }
                case "4" -> {
                    Televisao televisao = new Televisao();
                    ControleRemoto controleRemoto = new ControleRemoto(televisao);
                    for (int i = 0; i < 20; i++) {
                        switch (random.nextInt(6)) {
                            case 0 -> controleRemoto.volumeUp();
                            case 1 -> controleRemoto.volumeDown();
                            case 2 -> controleRemoto.nextChannel();
                            case 3 -> controleRemoto.previousChannel();
                            case 4 -> controleRemoto.changeChannel(random.nextInt(100) + 1);
                            case 5 -> controleRemoto.consultTv();
                        }
                    }
                }
                case "5" -> Menu.menuCaminhao();
                default -> System.out.println("opção inexistente");
            }

            System.out.println("Digite o exercício que você deseja realizar(1-5) ou 'sair' caso queira sair:");
            option = input.nextLine().toLowerCase();
        }
    }

    private static void menuCaminhao() {
        System.out.println("A seguir digite as informações sobre os caminhões.");
        String tipoCaminhao;
        int qtdPluviometros;
        List<Caminhao> listaCaminhao = new ArrayList<>();

        do{
            do {
                System.out.println("Qual o tipo do caminhão?(Alfa ou Beta)");
                tipoCaminhao = Controle.leString();
            } while(!tipoCaminhao.equals("Alfa") && !tipoCaminhao.equals("Beta"));

            System.out.println("Qual a capacidade do caminhão?");
            qtdPluviometros = Controle.leInteiro();

            Caminhao caminhao = new Caminhao(tipoCaminhao, qtdPluviometros);

            Menu.menuPluviometro(caminhao);

            listaCaminhao.add(caminhao);

            System.out.println("Digite 'Fim' caso deseje sair:");
        } while(!Controle.leString().equals("Fim"));

        ControleCaminhao.selecionaCaminhao(listaCaminhao);
    }

    private static Caminhao menuPluviometro(Caminhao caminhao) {
        System.out.println("A seguir informe as especificações referentes aos pluviômetros deste caminhão:");

        for(int i = 0; i < caminhao.getQtdPluviometros(); i++) {
            System.out.println("Pluviômetro Nª" + (i+1) + ":");

            System.out.println("Informe o tipo do pluviômetro:");
            String tipoPluviometro = Controle.leString();

            System.out.println("Informe a capacidade do pluviômetro em mm");
            int capacidadePluviometro = Controle.leInteiro();

            Pluviometro pluviometro = new Pluviometro(tipoPluviometro, capacidadePluviometro);
            caminhao.getListaPluviometro().add(pluviometro);
        }

        return caminhao;
    }
}
