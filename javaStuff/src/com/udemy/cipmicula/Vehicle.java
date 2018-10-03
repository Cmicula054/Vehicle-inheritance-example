package com.udemy.cipmicula;

public class Vehicle {

    private String direction;
    private int topSpeed;
    private int wheels;
    private String name;


    public Vehicle(String direction, int topSpeed, int wheels, String name) {
        this.direction = direction;
        this.topSpeed = topSpeed;
        this.wheels = wheels;
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int gettopSpeed() {
        return topSpeed;
    }

    public void settopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void changeVelocity(int speed, String direction) {
        System.out.println("Vehicle.changeVelocity() is moving in direction " + direction
                + " at " + speed + " mph");
    }

    static void changeDirection(int degree) {
        System.out.println("Car steered " + degree + " degrees");
    }

}
