class mother {
    static void show(){
            System.out.println("mother");
        }
    }
    class child extends mother{
        void show(){
            System.out.println("child");
        }
}

public class part2 {
   public static void main(String[] args) {
    mother m1 = new child();
    m1.show(); //calling mother's static show()
   } 
}
