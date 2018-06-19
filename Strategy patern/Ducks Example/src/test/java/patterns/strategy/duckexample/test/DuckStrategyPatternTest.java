package patterns.strategy.duckexample.test;

import org.junit.Test;
import patterns.strategy.duckexample.entity.Duck;
import patterns.strategy.duckexample.strategy.eat.CarnivoreEatStrategyImpl;
import patterns.strategy.duckexample.strategy.eat.HerbivoreEatStrategyImpl;
import patterns.strategy.duckexample.strategy.eat.NoEatStrategyImpl;
import patterns.strategy.duckexample.strategy.eat.OmnivoreEatStategyImpl;
import patterns.strategy.duckexample.strategy.quack.NoQuackStrategyImpl;
import patterns.strategy.duckexample.strategy.quack.PirateQuackStrategyImpl;
import patterns.strategy.duckexample.strategy.quack.SimpleQuackStrategyImpl;

public class DuckStrategyPatternTest {

    @Test
    public void allDucksTest() {

        Duck basicDuck = new Duck("Basic Duck",new SimpleQuackStrategyImpl(),new CarnivoreEatStrategyImpl());
        basicDuck.getInfo();
        basicDuck.eatSomething();
        basicDuck.quackAtPeople();

        System.out.println();

        Duck vegetarianDuck = new Duck("Vegetarian Duck", new SimpleQuackStrategyImpl(), new HerbivoreEatStrategyImpl());
        vegetarianDuck.getInfo();
        vegetarianDuck.eatSomething();
        vegetarianDuck.quackAtPeople();

        System.out.println();

        Duck rubberDuck = new Duck("Rubber Ducky", new NoQuackStrategyImpl(), new NoEatStrategyImpl());
        rubberDuck.getInfo();
        rubberDuck.eatSomething();
        rubberDuck.quackAtPeople();

        System.out.println();

        Duck pirateDuck = new Duck("Pirate Duck", new PirateQuackStrategyImpl(), new OmnivoreEatStategyImpl());
        pirateDuck.getInfo();
        pirateDuck.eatSomething();
        pirateDuck.quackAtPeople();
    }


}
