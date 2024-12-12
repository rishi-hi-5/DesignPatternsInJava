package Behavioral.mediator.with;

import java.util.ArrayList;
import java.util.List;

interface ChatMediator {
    void sendMessage(String message, User sender);
    void addUser(User user);
}

class ChatGroup implements ChatMediator {

    List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User sender) {
        users
                .stream()
                .filter(user-> !user.equals(sender))
                .forEach(user-> System.out.println(sender.name+" to "+user.name+" "+message));
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}


class User {
    String name;

    public User(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Runner {
    public static void main(String[] args) {
        User rishi = new User("Rishi");
        User ankita = new User("Ankita");
        User riya = new User("Riya");

        ChatGroup chatGroup = new ChatGroup();

        chatGroup.addUser(rishi);
        chatGroup.addUser(ankita);
        chatGroup.addUser(riya);

        chatGroup.sendMessage("Hi!",rishi);
        chatGroup.sendMessage("Hi!",ankita);
        chatGroup.sendMessage("Hi!",riya);


    }
}
