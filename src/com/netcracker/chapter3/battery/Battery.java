package com.netcracker.chapter3.battery;

public class Battery {

    private double capacity;
    private final double max_capacity;
    public void drain(double amount){
        capacity -= amount;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "capacity=" + capacity + '}';
    }

    public void charge(){
        capacity = max_capacity;
    }

    public double getRemainingCapacity(){
        return capacity;
    }

    public Battery(double capacity) {
        this.capacity = capacity;
        max_capacity = capacity;
    }
}
