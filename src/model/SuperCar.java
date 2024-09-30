package model;

import java.time.LocalDate;

public class SuperCar extends Car {

    private Integer id;
    private String tires;
    private String color;
    private Boolean isAutomaticGearBox;
    private Boolean containsCarbon;
    private Boolean isCeramicBreaks;

    public SuperCar() {
    }

    public SuperCar(String brand, String model, LocalDate year, String motorType, Integer id, String tires, String color, Boolean isAutomaticGearBox, Boolean containsCarbon, Boolean isCeramicBreaks) {
        this.id = id;
        this.tires = tires;
        this.color = color;
        this.isAutomaticGearBox = isAutomaticGearBox;
        this.containsCarbon = containsCarbon;
        this.isCeramicBreaks = isCeramicBreaks;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getAutomaticGearBox() {
        return isAutomaticGearBox;
    }

    public void setAutomaticGearBox(Boolean automaticGearBox) {
        isAutomaticGearBox = automaticGearBox;
    }

    public Boolean getContainsCarbon() {
        return containsCarbon;
    }

    public void setContainsCarbon(Boolean containsCarbon) {
        this.containsCarbon = containsCarbon;
    }

    public Boolean getCeramicBreaks() {
        return isCeramicBreaks;
    }

    public void setCeramicBreaks(Boolean ceramicBreaks) {
        isCeramicBreaks = ceramicBreaks;
    }
}
