package patterns.observer.rssexample.observee;

import patterns.observer.rssexample.observer.Observer;

public interface Observee {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();
}
