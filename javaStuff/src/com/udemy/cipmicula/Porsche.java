package com.udemy.cipmicula;

public class Porsche extends Car {

    public Porsche() {
        this("SW");
    }


    public Porsche(String direction) {
        super(direction, 180, 4, "Porsche", 2, 6);
    }


    public void launchControl(int speed, String direction) {
        System.out.println(super.getName() + " has launched");
        super.changeVelocity(speed, direction);
    }
}
