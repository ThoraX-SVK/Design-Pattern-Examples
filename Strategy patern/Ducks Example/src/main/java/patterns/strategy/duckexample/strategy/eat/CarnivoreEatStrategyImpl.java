package patterns.strategy.duckexample.strategy.eat;

public class CarnivoreEatStrategyImpl implements EatStrategy {

    public void eat() {
        System.out.println("I eat flesh!");
    }
}
