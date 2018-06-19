package patterns.strategy.duckexample.strategy.quack;

public class PirateQuackStrategyImpl implements QuackStrategy {

    public void quack() {
        System.out.println("Quack, Ya scurvy dog!");
    }
}
