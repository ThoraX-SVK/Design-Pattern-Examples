package observee;

import observer.Observer;

public interface Observee {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();
}
