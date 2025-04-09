public class Rum extends Decorator {
    Rum(Offering offer){
        this.offering= offer;
    }

    @Override
    int getPrice() {
        return this.offering.getPrice()+ 55;
    }

    @Override
    String getName() {
        return this.offering.getName()+"With Rum";
    }
    
}
