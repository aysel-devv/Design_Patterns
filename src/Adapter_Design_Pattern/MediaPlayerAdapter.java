package Adapter_Design_Pattern;

public class MediaPlayerAdapter implements MediaPlayer{
    OldMediaPlayer oldMediaPlayer;
    @Override
    public void play() {
        System.out.println("Media player adapter is played!");
    }

    public MediaPlayerAdapter(OldMediaPlayer oldMediaPlayer) {
        this.oldMediaPlayer=oldMediaPlayer;
    }
}
