package com.company;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new BBBCarFactory();

        carFactory.makeCar(CarType.SEDAN);

    }


}
