package com.example.demo;

public class Main {
    public static void main(String[] args) {
        DeliveryCostCalculator calculator = new DeliveryCostCalculator();

        double distance = 10.0; // приклад відстані в км

        // Користувач вибирає кур'єрську доставку
        calculator.setStrategy(new CourierDelivery());
        System.out.println("Courier delivery cost: $" + calculator.calculate(distance));

        // Користувач вибирає самовивіз
        calculator.setStrategy(new PickupPointDelivery());
        System.out.println("Pickup point delivery cost: $" + calculator.calculate(distance));

        // Користувач вибирає дрон-доставку
        calculator.setStrategy(new DroneDelivery());
        System.out.println("Drone delivery cost: $" + calculator.calculate(distance));
    }
}
