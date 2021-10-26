package exercicio4;

public class ControleRemoto {
    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public void volumeUp() {
        tv.setVolume(tv.getVolume() + 1);
        System.out.println("Volume up pressed");
    }

    public void volumeDown() {
        tv.setVolume(tv.getVolume() - 1);
        System.out.println("Volume down pressed");
    }

    public void nextChannel() {
        tv.setChannel(tv.getChannel() + 1);
        System.out.println("Next channel pressed");
    }

    public void previousChannel() {
        tv.setChannel(tv.getChannel() - 1);
        System.out.println("Previous channel pressed");
    }
    public void changeChannel(int channelNumber) {
        tv.setChannel(channelNumber);
        System.out.println("Showing channel " + channelNumber);
    }

    public void consultTv() {
        System.out.println("Canal: " + tv.getChannel()
                            + "\nVolume: " + tv.getVolume());
    }
}
