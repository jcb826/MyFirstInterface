package model;

import interfaces.Flyable;

import java.time.LocalDate;

public class Car extends Vehicle implements Flyable {
    private String model;
    private LocalDate year;
    private String motorType;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    @Override
    public void fly(int flyspeed) {

    }
}