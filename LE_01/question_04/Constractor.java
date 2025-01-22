
class One {
    //base class
    One(int x) {
        System.out.println("Constructor of One : " + x);
    }
}


class Two extends One { //child class
    
    Two(int x) {
        super(x); // calling x
        
                System.out.println("Constructor of Two" );
    }
}


public class Constractor {
    public static void main(String[] args) {
        
        Two obj = new Two(10);
    }
}
