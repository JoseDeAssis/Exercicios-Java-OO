package exercicio2;

import exercicio1.Pessoa;

public class Agenda {
    private Pessoa[] agendaPesoas;

    public Agenda() {
        this.agendaPesoas = new Pessoa[10];
    }

    public void armazenaPessoa(String name, int age, float height) {
        int index = 0;
        for(;index < agendaPesoas.length; index++) {
            if(agendaPesoas[index] == null)
                break;
        }

        if(index < agendaPesoas.length) {
            Pessoa newPerson = new Pessoa(name, age, height);
            agendaPesoas[index] = newPerson;
            System.out.println(name + " salva na agenda!");
        } else {
            System.out.println("Agenda cheia!");
        }
    }

    public void removePessoa(String name) {
        int index = 0;
        for(;index < agendaPesoas.length; index++) {
            if(agendaPesoas[index].getName().equals(name))
                break;
        }

        if(index < agendaPesoas.length) {
            Pessoa[] agendaPessoasAux = new Pessoa[agendaPesoas.length - 1];

            for(int i = 0; i < agendaPessoasAux.length; i++) {
                if(i == index)
                    continue;

                agendaPessoasAux[i] = agendaPesoas[i];
            }

            agendaPesoas = agendaPessoasAux;
            System.out.println(name + " foi removida!");
        } else {
            System.out.println(name + " não está presente na agenda!");
        }
    }

    public int buscaPessoa(String name) {
        for(int i = 0;i < agendaPesoas.length; i++){
            if(agendaPesoas[i].getName().equals(name))
                return i;
        }

        return -1;
    }

    public void imprimeAgenda() {
        for (Pessoa agendaPesoa : agendaPesoas) {
            agendaPesoa.personInfo();
        }
    }

    public void imprimePessoa(int index) {
        if(index < agendaPesoas.length) {
            agendaPesoas[index].personInfo();
        } else {
            System.out.println("Index inválido!");
        }
    }
}
