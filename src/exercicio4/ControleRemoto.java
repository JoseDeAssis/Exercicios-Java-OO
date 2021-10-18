package exercicio4;

public class ControleRemoto {
    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public void volumeUp() {
        tv.setVolume(tv.getVolume() + 1);
    }

    public void volumeDown() {
        tv.setVolume(tv.getVolume() - 1);
    }

    public void nextChannel() {
        tv.setChannel(tv.getChannel() + 1);
    }

    public void previousChannel() {
        tv.setChannel(tv.getChannel() - 1);
    }
    public void changeChannel(int channelNumber) {
        if(channelNumber > 0)
            tv.setChannel(channelNumber);
        else
            System.out.println("Canal não existe");
    }

    public void consultTv() {
        System.out.println("Canal: " + tv.getChannel()
                            + "\nVolume: " + tv.getVolume());
    }
}
