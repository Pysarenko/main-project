package com.dev.mainproject.patterns;

interface Car {
    void run();
}

class Toyota implements Car {
    @Override
    public void run() {
        System.out.println("Toyota is running");
    }
}

class Audi implements Car {
    @Override
    public void run() {
        System.out.println("Audi is running");
    }
}

public class CarFactory {
    public enum CarType {
        TOYOTA, AUDI
    }

    public Car createCar(CarType type) {
        return switch (type) {
            case TOYOTA -> new Toyota();
            case AUDI -> new Audi();
        };
    }
}

//For Factory method we create ToyotaCarFactory & AudiCarFactory that implement CarFactory

class MainApplication {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        //CarFactory creates new objects for us, based on a type request.
        Car audi = carFactory.createCar(CarFactory.CarType.TOYOTA);
        audi.run();
    }

    //For Factory method:
    /*CarFactory toyotaFactory = new ToyotaFactory();
    Car toyota = toyotaFactory.createCar();*/
}

