package com.lohas.demo.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2018/4/29.
 */
class House extends Observable{//被观察者
    private double price;//房子价格
    public House(double price){
        this.price = price;
    }

    public void setPrice(double price) {
        if (price > this.price){//房价上涨
            super.setChanged();//已经发生了改变
            super.notifyObservers(price);//通知所有的观察者发生器了改变
        }
        this.price = price;
    }
}
class HousePriceObserver implements Observer{//观察者

    private String name;//观察者的名字
    public HousePriceObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof House){
            if (arg instanceof Double){
                System.out.println("房价上涨: " + arg);
            }
        }
    }
}
public class ObserverDemo {

    public static void main(String[] args) {
        House  house = new House(3000000.0);//被观察者
        HousePriceObserver hpo1 = new HousePriceObserver("Luffy");
        HousePriceObserver hpo2 = new HousePriceObserver("Lucy");
        HousePriceObserver hpo3 = new HousePriceObserver("Lohas");
        //添加观察者
        house.addObserver(hpo1);
        house.addObserver(hpo2);
        house.addObserver(hpo3);
        //房价上涨观察者才关注
        house.setPrice(5000000.0);
        //房价下降
        System.out.println("**************");
        house.setPrice(1000000.0);
    }

}
