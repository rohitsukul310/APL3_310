public class Gin extends Decorator {
    Gin(Offering offer){
        this.offering= offer;
    }

    @Override
    int getPrice() {
        return this.offering.getPrice()+ 50;
    }

    @Override
    String getName() {
        return this.offering.getName()+"With Gin";
    }
    
}
