package Behavioral.observer.without;


class Subscriber {
    private final String name;

    public Subscriber(String name) {
        this.name= name;
    }

    public void notify(String title){
        System.out.println(name+"Received notification for video with title"+title);
    }
}

class YoutubeChannel {
    private Subscriber sub1;
    private Subscriber sub2;

    public YoutubeChannel(Subscriber sub1,Subscriber sub2) {
        this.sub1=sub1;
        this.sub2=sub2;
    }

    public void upload(String title){
        System.out.println("Video uploading with title"+title);

        sub1.notify(title);
        sub2.notify(title);
    }
}


public class Runner {
    public static void main(String[] args) {
        Subscriber sub1 = new Subscriber("Vamike");
        Subscriber sub2 = new Subscriber("Akay");

        YoutubeChannel youtubeChannel= new YoutubeChannel(sub1,sub2);

        youtubeChannel.upload("Observer pattern");
    }
}