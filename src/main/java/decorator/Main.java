package decorator;

import lombok.SneakyThrows;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        Beverage expresso = new Expresso();
        System.out.println("caramel cost " + expresso.cost());
        Beverage doubleCaramelExpresso = new Caramel(new Caramel(expresso));
        System.out.println("doubleCaramelExpresso cost " + doubleCaramelExpresso.cost());
        Beverage chocolateDoubleCaramelExpresso = new Chocolate(new Caramel(new Caramel(expresso)));
        System.out.println("chocolateDoubleCaramelExpresso cost " + chocolateDoubleCaramelExpresso.cost());

    }
}
