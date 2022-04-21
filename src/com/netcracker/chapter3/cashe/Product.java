package com.netcracker.chapter3.cashe;

public class Product {
    private double cost;
    private String name;

    public boolean isRecordPurchase() {
        return recordPurchase;
    }

    private boolean recordPurchase = true;

    public Product(String name, double cost, boolean recordPurchase) {
        this.cost = cost;
        this.name = name;
        this.recordPurchase = recordPurchase;
    }

    public String getName() {
        return name;
    }



    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }



    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
}
