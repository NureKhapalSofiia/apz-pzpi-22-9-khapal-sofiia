package com.example.demo;

public class PickupPointDelivery implements DeliveryStrategy{
    @Override
    public double calculateCost(double distance) {
        return 2.0;
    }
}
