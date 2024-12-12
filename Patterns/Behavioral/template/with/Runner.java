package Behavioral.template.with;


interface Chai {
    default void garamPaniDalo(){
        System.out.println("Pani garam ho raha hai");
    }

    default void chaiPatiDalo() {
        System.out.println("chai pati dalo");
    }

    default void doodhDalo(){
        System.out.println("Doodh dala ja raha hai");
    }

    default void chaiBanao(){
        garamPaniDalo();
        chaiPatiDalo();
        specialThingDalo();
        doodhDalo();
    }

    void specialThingDalo();
}

class RamuKiChai implements Chai{

    @Override
    public void specialThingDalo() {
        System.out.println("add extra masale");
    }
}


class ShamuKiChai implements Chai{

    @Override
    public void specialThingDalo() {
        System.out.println("add extra adrak");
    }
}

public class Runner {
    public static void main(String[] args) {
        RamuKiChai ramuKiChai = new RamuKiChai();

        System.out.println("Ramu has started making chai -- ");

        ramuKiChai.chaiBanao();

        ShamuKiChai shamuKiChai = new ShamuKiChai();

        System.out.println("Shamu has started making chai -- ");

        shamuKiChai.chaiBanao();

    }
}
