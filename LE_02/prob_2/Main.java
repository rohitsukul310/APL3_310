class Animal {
    void sound() {
       
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("Cow's voice : Moo");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog's voice : Bark");
    }
}

class Pig extends Animal {
    void sound() {
        System.out.println("Pig's voice : Oink");
    }
}

class Goat extends Animal {
    void sound() {
        System.out.println("Goat's voice :  Bleat");
    }
}

class Lion extends Animal {
    void sound() {
        System.out.println("Lion's voice :  Roar");
    }
}

class Voice {
    Animal[] animals = new Animal[5];

    void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    void hear() {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    void templateMethod() {
        prepareVoice();
        hear();
    }
}






public class Main {
    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.templateMethod();
    }
}
