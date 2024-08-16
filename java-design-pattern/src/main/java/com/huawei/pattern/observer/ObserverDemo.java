package com.huawei.pattern.observer;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/16 21:50
 * @description 观察者模式
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        ObserverImpl2 observerImpl2 = new ObserverImpl2();
        ObserverImpl1 observerImpl1 = new ObserverImpl1();
        ObserverImpl3 observerImpl3 = new ObserverImpl3();

        subject.attach(observerImpl1);
        subject.attach(observerImpl2);
        subject.attach(observerImpl3);

        subject.setState(2);
    }
}
