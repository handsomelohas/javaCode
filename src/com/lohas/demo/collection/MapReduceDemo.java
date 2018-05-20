package com.lohas.demo.collection;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * Created by Administrator on 2018/5/9.
 */
class Order{
    private String title;//商品分类
    private double price;//商品价格
    private int amount;//商品数量

    public Order(String title, double price, int amount) {
        this.title = title;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
public class MapReduceDemo {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<Order>();
        list.add(new Order("手机", 5000.5, 1));
        list.add(new Order("电脑", 8000.5, 2));
        list.add(new Order("单反", 15000.5, 3));
        list.add(new Order("Nike", 1000.5, 14));
//        double listPrice = list.stream().map((x) -> x.getPrice() * x.getAmount()).reduce((sum,m) -> sum + m).get();
//        System.out.println(listPrice);
        DoubleSummaryStatistics dss = list.stream().mapToDouble((x) -> x.getPrice() * x.getAmount()).summaryStatistics();
        System.out.println("卖出的种类个数：" + dss.getCount());
        System.out.println("平均：" + dss.getAverage());
        System.out.println("最高销售额：" + dss.getMax());
        System.out.println("最低销售额：" + dss.getMin());
        System.out.println("总销售额：" + dss.getSum());
    }
}
