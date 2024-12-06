package Adapter_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        OldMediaPlayer oldMediaPlayer=new OldMediaPlayer();
        MediaPlayerAdapter mediaPlayerAdapter=new MediaPlayerAdapter(oldMediaPlayer);
        mediaPlayerAdapter.oldMediaPlayer.playOldFormat();
    }
}
