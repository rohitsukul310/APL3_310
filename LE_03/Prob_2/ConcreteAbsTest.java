
abstract class AbsTest implements Testable {
    
}

class ConcreteAbsTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("Display method implemented in ConcreteAbsTest class.");
    }

    public static void main(String[] args) {
        ConcreteAbsTest absTest = new ConcreteAbsTest();
        absTest.display();
    }
}
