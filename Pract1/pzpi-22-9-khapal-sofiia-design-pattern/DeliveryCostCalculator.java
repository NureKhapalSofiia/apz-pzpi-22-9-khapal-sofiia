package com.example.demo;

public class DeliveryCostCalculator {
    private DeliveryStrategy strategy;

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double distance) {
        if (strategy == null) {
            throw new IllegalStateException("Delivery strategy not set.");
        }
        return strategy.calculateCost(distance);
    }
}
