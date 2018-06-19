package patterns.strategy.duckexample.strategy.eat;

public class NoEatStrategyImpl implements EatStrategy {

    public void eat() {
        System.out.println("I do not eat!");
    }
}
