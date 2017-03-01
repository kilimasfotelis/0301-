package com.kcs.uzd.pask3.vo;

/**
 * Created by User on 2017-03-01.
 */
public class Car {
    private String model;
    private String year;
    private double carPrice;

    public Car(String model, String year, double price ){
        this.model = model;
        this.year = year;
        carPrice = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.carPrice, carPrice) != 0) return false;
        if (!model.equals(car.model)) return false;
        return year.equals(car.year);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = model.hashCode();
        result = 31 * result + year.hashCode();
        temp = Double.doubleToLongBits(carPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", carPrice=" + carPrice +
                '}';
    }
}
