class mother{
    void show(){
        System.out.println("mother");
    }
}

class child extends mother{
    ststic void show(){
        System.out.println("child");
    }
}


public class part3 {
    public static void main(String[] args) {
        mother m1 = new child();
        m1.show(); //calling child show()
    }
}
