package entity;

import strategy.eat.EatStrategy;
import strategy.quack.QuackStrategy;

public class Duck {

    String info;
    QuackStrategy quackStrategy;
    EatStrategy eatStrategy;

    public Duck(String info, QuackStrategy quackStrategy, EatStrategy eatStrategy) {
        this.info = info;
        this.quackStrategy = quackStrategy;
        this.eatStrategy = eatStrategy;
    }

    public void getInfo() {
        System.out.println(info);
    }

    public void eatSomething() {
        eatStrategy.eat();
    }

    public void quackAtPeople() {
        quackStrategy.quack();
    }

}
