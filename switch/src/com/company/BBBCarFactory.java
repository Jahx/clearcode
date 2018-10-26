package com.company;

public class BBBCarFactory implements CarFactory {

    @Override
    public Car makeCar(CarType type) throws IllegalArgumentException {
        switch (type) {
            case VAN:
                return new MinivanCar();
            case COUPE:
                return new CoupeCar();
            case SEDAN:
                return new SedanCar();
            default:
                throw new IllegalArgumentException("Not supported car type");

        }
    }
}
