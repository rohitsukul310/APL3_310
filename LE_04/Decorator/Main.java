public class Main {
    public static void main(String[] args) {
        Offering obj1 = new Coffee();
        obj1 = new Rum(obj1);
        obj1 = new Rum(obj1);
        obj1 = new Rum(obj1);
        System.out.println(obj1.getName() + obj1.getPrice());
    }
}
