package com.company;

public interface CarFactory {

    Car makeCar(CarType type) throws IllegalArgumentException;
}
