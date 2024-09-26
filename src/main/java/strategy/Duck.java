package strategy;

public class Duck {

    IQuackBehaviour quackBehaviour;
    IFlyBehaviour flyBehaviour;

    public Duck(IQuackBehaviour quackBehaviour, IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    void quack() {
        this.quackBehaviour.quack();
    }

    void fly() {
        this.flyBehaviour.fly();
    }
}
