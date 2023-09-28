package Lab0Observer.withoutJavaApi;

import java.util.ArrayList;
import java.util.List;

public class Counter implements Subject{

//    private TextFrame textframe;
//    private RectFrame rectframe;
//    private OvalFrame ovalframe;
    private List<Observer> observers;
    private int count;

    public Counter() {
        count = 0;
        this.observers = new ArrayList<>();
    }

    public void increment(){
        count++;
        notifyObservers();
//        textframe.setCount(count);
//        rectframe.setCount(count);
//        ovalframe.setCount(count);
    }

    public void decrement(){
        if (count >0){
            count--;
            notifyObservers();
//            textframe.setCount(count);
//            rectframe.setCount(count);
//            ovalframe.setCount(count);
        }
    }

    public int getStateCount() {
        return count;
    }

    @Override
    public void attach(Observer observer) {
        if(!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update();
        }

    }
}
