package com.udemy.cipmicula;

public class Car extends Vehicle {

    private int doors;
    private int gears;
    private int currentGear = 1;
    private int currentSpeed;

    public Car() {
        this(4, 6);
    }

    public Car(int doors, int gears) {
        this("SW", 180, 4, "unKnown", doors, gears);
    }

    public Car(String direction, int topSpeed, int wheels, String name, int doors, int gears) {
        super(direction, topSpeed, wheels, name);
        this.doors = doors;
        this.gears = gears;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void accelerate(int currentSpeed) {
        System.out.println("Car is accelerating");
        this.currentSpeed += currentSpeed;
        changeGear();
    }

    public void deaccelerate(int currentSpeed) {
        this.currentSpeed -= currentSpeed;
        changeGear();
    }

    public void move(int speed, String direction) {
        this.currentSpeed = speed;
        super.changeVelocity(speed, direction);
    }


    public void changeGear() {
        int j;
        for (int i = 1; i <= this.currentSpeed; i += 12) {
            if (this.currentSpeed > i && this.currentGear < this.gears) {
                j = i + 12;
                if (this.currentSpeed <= j) {
                    System.out.println("Traveling at " + this.currentSpeed + " mph in gear " + this.currentGear);
                    break;
                } else {
                    this.currentGear++;
                }
            } else {
                System.out.println("Traveling at " + this.currentSpeed + " mph in gear " + this.currentGear);
                break;
            }
        }
    }

}
