package observee;


import observer.Observer;

import java.util.HashSet;
import java.util.Set;

public class SimpleObserveeImpl implements Observee {

    private Set<Observer> observers = new HashSet<>();


    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
