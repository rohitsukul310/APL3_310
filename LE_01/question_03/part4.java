class Mother {
    static void show() {
        System.out.println("Mother");
    }
}

class Child extends Mother {
    static void show() {
        System.out.println("Child");
    }
}

public class part4 {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show(); // Calls Mother's static show() method
    }
}
