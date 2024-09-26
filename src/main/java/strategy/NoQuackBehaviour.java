package strategy;

public class NoQuackBehaviour implements IQuackBehaviour {

    @Override
    public void quack() {
        System.out.println("No Quack Behaviour");
    }
}
