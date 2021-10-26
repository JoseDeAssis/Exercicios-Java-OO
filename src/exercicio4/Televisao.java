package exercicio4;

public class Televisao {
    private int channel;
    private int volume;

    public Televisao() {
        this.channel = 50;
        this.volume = 20;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel > 0 && channel <= 100)
            this.channel = channel;
        else
            System.out.println("Canal deve estar entre 0 e 101");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume > 0 && volume <= 100)
            this.volume = volume;
        else
            System.out.println("Volume deve estar entre 0 e 101");
    }
}
