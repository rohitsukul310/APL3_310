
class Mother {
    int x;

    
    void show() {
        System.out.println("Value of x: " + x);
    }
}

class Child extends Mother {
   
}


class q1 {
    public static void main(String[] args) {
       
        Mother m = new Mother();
        m.x = 10; 
        m.show(); 

       
        Child ch = new Child();
        ch.x = 20; 
        ch.show(); 
    }
}
