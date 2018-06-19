package patterns.strategy.duckexample.strategy.eat;

public class OmnivoreEatStategyImpl implements EatStrategy {

    public void eat() {
        System.out.println("I eat plants and flesh!");
    }
}
