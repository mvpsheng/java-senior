package observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: Subject
 * author: gxs
 * Date: 2021/8/17  22:20
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
