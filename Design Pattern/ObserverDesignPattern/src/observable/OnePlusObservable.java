package observable;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class OnePlusObservable implements Observable {
    int onePlusCount;

    public OnePlusObservable(int count) {
        this.onePlusCount = count;
    }

    List<Observer> observerList = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        if(!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList) {
            observer.update();
        }
    }
    @Override
    public void setCount(int count) {
        if(onePlusCount!=count) {
            this.onePlusCount = count;
            notifyObservers();
        }
    }
    @Override
    public int getCount() {
        return onePlusCount;
    }
}
