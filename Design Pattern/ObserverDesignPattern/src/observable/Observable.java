package observable;

import observer.Observer;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
    void setCount(int count);
    int getCount();
}
