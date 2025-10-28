package com.pluralsight;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    // Getters and Setters
    public String getMakeModel() { return makeModel; }
    public void setMakeModel(String makeModel) { this.makeModel = makeModel; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getOdometer() { return odometer; }
    public void setOdometer(int odometer) { this.odometer = odometer; }

    @Override
    public double getValue() {
        int age = 2025 - year;
        double value = getOriginalCost();

        if (age <= 3) value *= (1 - 0.03 * age);
        else if (age <= 6) value *= (1 - 0.06 * age);
        else if (age <= 10) value *= (1 - 0.08 * age);
        else value -= 1000;

        if (odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            value *= 0.75;
        }

        return value;
    }
}
