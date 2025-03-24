package com.example.demo;

public class CourierDelivery implements DeliveryStrategy{
    @Override
    public double calculateCost(double distance) {
        return 5.0 + distance * 1.2;
    }
}
