package Behavioral.mediator.without;

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

    public void sendMessage(String message,User toUser) {
        System.out.println(this.name+" to "+toUser.name+" "+message);
    }
}

public class Runner {
    public static void main(String[] args) {
        User rishi = new User("Rishi");
        User ankita = new User("Ankita");
        User riya = new User("Riya");

        rishi.sendMessage("Hi!",ankita);
        rishi.sendMessage("Hi!",riya);

        ankita.sendMessage("Hi!",rishi);
        ankita.sendMessage("Hi!",riya);

        riya.sendMessage("Hi!",rishi);
        riya.sendMessage("Hi!",ankita);

    }
}



