package strategy.quack;

public class NoQuackStrategyImpl implements QuackStrategy {

    public void quack() {
        System.out.println("I can not quack!");
    }
}
