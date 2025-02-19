
interface FlyBehavior {
    void fly();
}

interface QuackBehavior {
    void quack();
}

interface SwimBehavior {
    void swim();
}


class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}

class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly.");
    }
}

class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack!");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak!");
    }
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("...");
    }
}

class Swim implements SwimBehavior {
    public void swim() {
        System.out.println("I'm swimming!");
    }
}


abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    public Duck() {
        this.swimBehavior = new Swim(); // All ducks can swim
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    abstract void display();
}

class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a Rubber Duck!");
    }
}

class WoodenDuck extends Duck {
    public WoodenDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I'm a Wooden Duck!");
    }
}

class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a RedHead Duck!");
    }
}

class LakeDuck extends Duck {
    public LakeDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a Lake Duck!");
    }
}


public class DuckGame {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();

        System.out.println();

        woodenDuck.display();
        woodenDuck.performFly();
        woodenDuck.performQuack();
        woodenDuck.performSwim();

        System.out.println();

        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.performSwim();

        System.out.println();

        lakeDuck.display();
        lakeDuck.performFly();
        lakeDuck.performQuack();
        lakeDuck.performSwim();
    }
}
