package com.huawei.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/16 21:46
 * @description
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private int state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
