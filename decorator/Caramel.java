package decorator;

public class Caramel extends BeverageDecorator {
    Beverage beverage;

    public Caramel(Beverage b) {
        this.beverage = b;
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 3;
    }
}
