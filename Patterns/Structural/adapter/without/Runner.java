package Structural.adapter.without;


class MP3Player {
    void playMP3(String file) {
        System.out.println("it is playing MP3 music file"+file);
    }
}

class MP4Player {
    void playMP4(String file) {
        System.out.println("it is playing MP4 music file"+file);
    }
}

public class Runner {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        MP4Player mp4Player = new MP4Player();

        mp3Player.playMP3("song.mp3");
        mp4Player.playMP4("video.mp4");
    }
}
