package Homework2.CarShowroom;

import Homework2.Car.Car;
import Homework2.CarColor.CarColor;
import Homework2.CarFactory.CarFactory;
import Homework2.CarModel.CarModel;
import Homework2.Service.Service;
import Homework2.WheelSize.WheelSize;
import Homework2.Year.Year;

import java.util.Arrays;


public class CarShowroom {
    private CarFactory carFactory;
    private Service service;

    public CarShowroom(CarFactory carFactory, Service service) {
        this.carFactory = carFactory;
        this.service = service;
    }

    public void orderCar(CarModel model, CarColor color, Year year, WheelSize wheelSize, float engineVolume) {
        Car car = carFactory.createCar(model, color, year, wheelSize, engineVolume);
        System.out.println("Car ordered: ");
        car.printInfo();
    }

    public void changeCarColor(Car car, CarColor color) {
        service.changeColor(car, color);
        System.out.println("Car color changed to " + color);
        car.printInfo();
    }

    public void replaceCarWheels(Car car, WheelSize wheelSize) {
        service.replaceWheels(car, wheelSize);
        System.out.println("Car wheels replaced with size " + wheelSize);
        car.printInfo();
    }

    public void addCarOption(Car car, String option) {
        service.addOption(car, option);
        System.out.println("Added option: " + option);
        car.printInfo();
    }

    public void removeCarOption(Car car, String option) {
        service.removeOption(car, option);
        System.out.println("Removed option: " + option);
        car.printInfo();
    }

    public void setCarOptions(Car car, String[] options) {
        service.setOptions(car, options);
        System.out.println("Set options: " + Arrays.toString(options));
        car.printInfo();
    }
}

