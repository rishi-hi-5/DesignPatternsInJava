package Behavioral.observer.with;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void notify(String title);
}

class Subscriber implements Observer{
    private final String name;

    public Subscriber(String name) {
        this.name= name;
    }

    public void notify(String title){
        System.out.println(name+"Received notification for video with title"+title);
    }
}

class YoutubeChannel {
    private List<Observer> observers =new ArrayList<>();
    public YoutubeChannel() {
    }

    public void subscribe(Observer subscriber){
        observers.add(subscriber);
    }

    public void unSubscribe (Observer subscriber) {
        observers.remove(subscriber);
    }

    public void upload(String title){
        System.out.println("Video uploading with title"+title);

        for (Observer observer : observers) {
            observer.notify(title);
        }
    }
}


public class Runner {
    public static void main(String[] args) {
        Subscriber sub1 = new Subscriber("Vamike");
        Subscriber sub2 = new Subscriber("Akay");

        YoutubeChannel youtubeChannel= new YoutubeChannel();

        youtubeChannel.subscribe(sub1);
        youtubeChannel.subscribe(sub2);

        youtubeChannel.upload("Observer pattern");

        youtubeChannel.unSubscribe(sub1);

        youtubeChannel.upload("Observer pattern Part 2");

    }
}