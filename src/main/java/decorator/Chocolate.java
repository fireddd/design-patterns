package decorator;

public class Chocolate extends BeverageDecorator{
    Beverage beverage;
    public Chocolate(Beverage b){
        this.beverage = b;
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 10;
    }
}
