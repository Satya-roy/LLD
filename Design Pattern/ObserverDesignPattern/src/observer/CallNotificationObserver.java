package observer;

import observable.Observable;

public class CallNotificationObserver implements Observer {
    Observable observable;
    String phoneNumber;

    public CallNotificationObserver(Observable observable, String phoneNumber) {
        this.observable = observable;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update() {
        sendNotification(observable.getCount());
    }

    public void sendNotification(int count) {
        System.out.println("Phone call " + this.phoneNumber + " : number of phones " + count);
    }
}
