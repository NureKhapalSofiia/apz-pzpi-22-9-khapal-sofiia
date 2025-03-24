package com.example.demo;

public class DroneDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double distance) {
        return 10.0 + distance * 2.5;
    }
}