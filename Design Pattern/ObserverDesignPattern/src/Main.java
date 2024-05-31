import observable.IphoneObservable;
import observable.Observable;
import observer.CallNotificationObserver;
import observer.LetterNotificationObserver;
import observer.SMSNotificationObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Observable iphoneObservable = new IphoneObservable(0);
        iphoneObservable.add(new CallNotificationObserver(iphoneObservable, "12345"));
        iphoneObservable.add(new LetterNotificationObserver());
        iphoneObservable.add(new SMSNotificationObserver());

        iphoneObservable.setCount(100);
    }
}