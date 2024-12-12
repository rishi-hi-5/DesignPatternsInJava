package Structural.adapter.with;


interface MediaPlayer {
    void play (String file);
}

class MP3Player implements MediaPlayer{
    public void play(String file) {
        System.out.println("it is playing MP3 music file"+file);
    }
}

class MP4Player {
    void playMP4(String file) {
        System.out.println("it is playing MP4 music file"+file);
    }
}

class MP4PlayerAdapter implements MediaPlayer{
    MP4Player mp4Player ;

    public MP4PlayerAdapter(MP4Player mp4Player) {
        this.mp4Player=mp4Player;
    }

    @Override
    public void play(String file) {
        mp4Player.playMP4(file);
    }
}


public class Runner {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MP3Player();
        mediaPlayer.play("song.mp3");

        mediaPlayer = new MP4PlayerAdapter(new MP4Player());

        mediaPlayer.play("video.mp4");

    }
}
