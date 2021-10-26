package menu;

import exercicio1.Pessoa;
import exercicio2.Agenda;
import exercicio3.Elevador;
import exercicio4.ControleRemoto;
import exercicio4.Televisao;

import java.time.LocalDate;
import java.util.Locale;
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
                case "5" -> System.out.println("exercício ainda não implementado");
                default -> System.out.println("opção inexistente");
            }

            System.out.println("Digite o exercício que você deseja realizar(1-5):");
            option = input.nextLine().toLowerCase();
        }
    }
}
