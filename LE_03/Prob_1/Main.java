abstract class Bharatvanshi{
    abstract void fight();
    abstract void obey();
    abstract void kind();
}

class Pandav extends Bharatvanshi{
    @Override
    void fight() {
        System.out.println("Pandav fights bravely.");
    }

    @Override
    void obey() {
        System.out.println("Pandav obeys the rules");
    }

    @Override
    void kind() {
       
        System.out.println("Pandav shows kindness");
    }

}

class Kaurav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println("Kaurav fights fiercely.");
    }

    @Override
    void obey() {
        System.out.println("Kaurav disobeys the rules.");
    }

    @Override
    void kind() {
        System.out.println("Kaurav shows cruelty.");
    }
}

class Vikarn extends Kaurav {
    @Override
    void obey() {
        System.out.println("Vikarn obeys the rules.");
    }

    @Override
    void kind() {
        System.out.println("Vikarn shows kindness.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Pandav();
        Bharatvanshi bheem = new Pandav();
        Bharatvanshi duryodhan = new Kaurav();
        Bharatvanshi vikarn = new Vikarn();

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
