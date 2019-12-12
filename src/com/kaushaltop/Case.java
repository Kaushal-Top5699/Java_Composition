package com.kaushaltop;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;//this is composition

    public Case(String model, String manufacturer,
                String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    //This method has been called in PC class by method powerUp()
    // (For verification go and check for the method)
    public void pressPowerButton() {

        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
