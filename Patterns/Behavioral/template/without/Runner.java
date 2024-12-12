package Behavioral.template.without;



class RamuKiChai {
    void garamPaniDalo(){
        System.out.println("Pani garam ho raha hai");
    }

    void chaiPatiDalo() {
        System.out.println("chai pati dalo aur extra masale");
    }

    void doodhDalo(){
        System.out.println("Doodh dala ja raha hai");
    }
}


class ShamuKiChai {
    void garamPaniDalo(){
        System.out.println("Pani garam ho raha hai");
    }

    void chaiPatiDalo() {
        System.out.println("chai pati dalo aur extra adraki");
    }

    void doodhDalo(){
        System.out.println("Doodh dala ja raha hai");
    }
}

public class Runner {
    public static void main(String[] args) {
        RamuKiChai ramuKiChai = new RamuKiChai();

        System.out.println("Ramu has started making chai -- ");

        ramuKiChai.garamPaniDalo();
        ramuKiChai.chaiPatiDalo();
        ramuKiChai.doodhDalo();

        ShamuKiChai shamuKiChai = new ShamuKiChai();

        System.out.println("Shamu has started making chai -- ");

        shamuKiChai.garamPaniDalo();
        shamuKiChai.chaiPatiDalo();
        shamuKiChai.doodhDalo();


    }
}
