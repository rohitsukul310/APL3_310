public class LazySingleton {
   
    private static volatile LazySingleton instance;

    private LazySingleton() { }

    
    public static LazySingleton getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (LazySingleton.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

  
    public void showMessage() {
        System.out.println("Hello from LazySingleton!");
    }
}
