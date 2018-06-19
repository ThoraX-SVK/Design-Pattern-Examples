package patterns.strategy.duckexample.strategy.eat;

public class HerbivoreEatStrategyImpl implements EatStrategy {

    public void eat() {
        System.out.println("I eat plants!");
    }
}
