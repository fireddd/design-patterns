package strategy;

public class LoudQuackBehaviour implements IQuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Loud Quack Behaviour");
    }
}
