package strategy;

import lombok.SneakyThrows;


public class Main {


    @SneakyThrows
    public static void main(String[] args) {
        IFlyBehaviour flyBehaviour = new NoFlyBehaviour();
        IQuackBehaviour quackBehaviour = new LoudQuackBehaviour();
        Duck duck = new Duck(quackBehaviour, flyBehaviour);
        duck.fly();
        duck.quack();
        IFlyBehaviour flyBehaviour2 = new ShortFlyBehaviour();
        IQuackBehaviour quackBehaviour2 = new NoQuackBehaviour();
        Duck duck2 = new Duck(quackBehaviour2, flyBehaviour2);
        duck2.fly();
        duck2.quack();
    }


}