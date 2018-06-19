package patterns.strategy.duckexample.strategy.quack;

public class SimpleQuackStrategyImpl implements QuackStrategy {

    public void quack() {
        System.out.println("Quack! Quack!");
    }
}
