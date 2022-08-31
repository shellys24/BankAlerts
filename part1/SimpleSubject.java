package untitled15.src.main.part1;



import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject {
    private final List<Observer> observers;
    private String message;

    public SimpleSubject() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }


    public void removeObserver(Observer o) {
            observers.remove(o);
        }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}