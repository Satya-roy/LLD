package observable;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable{
    private int iphoneCount;
    public IphoneObservable(int iphoneCount) {
        this.iphoneCount = iphoneCount;
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
        if(iphoneCount != count) {
            iphoneCount = count;
            notifyObservers();
        }
    }

    @Override
    public int getCount() {
        return iphoneCount;
    }
}
