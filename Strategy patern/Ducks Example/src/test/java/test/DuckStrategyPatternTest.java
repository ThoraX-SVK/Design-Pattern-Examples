package test;

import org.junit.Test;
import entity.Duck;
import strategy.eat.CarnivoreEatStrategyImpl;
import strategy.eat.HerbivoreEatStrategyImpl;
import strategy.eat.NoEatStrategyImpl;
import strategy.eat.OmnivoreEatStategyImpl;
import strategy.quack.NoQuackStrategyImpl;
import strategy.quack.PirateQuackStrategyImpl;
import strategy.quack.SimpleQuackStrategyImpl;

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
