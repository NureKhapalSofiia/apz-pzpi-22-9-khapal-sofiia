package com.example.demo;

public class NightExpressDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double distance) {
        return 20.0 + distance * 3.0;
    }
}
