package Lab0Observer.withJavaApi;

import java.util.Observable;

public class Counter extends Observable {

//    private TextFrame textframe;
//    private RectFrame rectframe;
//    private OvalFrame ovalframe;
    private int count;

    public Counter() {
        count = 0;
    }

    public void increment(){
        count++;
        setChanged();
        notifyObservers();
//        textframe.setCount(count);
//        rectframe.setCount(count);
//        ovalframe.setCount(count);
    }

    public void decrement(){
        if (count >0){
            count--;
            setChanged();
            notifyObservers();
//            textframe.setCount(count);
//            rectframe.setCount(count);
//            ovalframe.setCount(count);
        }
    }

    public int getStateCount() {
        return count;
    }
}
