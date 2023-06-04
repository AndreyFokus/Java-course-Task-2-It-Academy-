package Homework2.Main;

import Homework2.Car.Car;
import Homework2.CarColor.CarColor;
import Homework2.CarFactory.CarFactory;
import Homework2.CarModel.CarModel;
import Homework2.CarShowroom.CarShowroom;
import Homework2.Service.Service;
import Homework2.WheelSize.WheelSize;
import Homework2.Year.Year;

public class Main {
    public static void main(String[] args) {
        CarModel[] availableModels = {CarModel.COROLLA, CarModel.CAMRY, CarModel.RAV4, CarModel.PRIUS};
        float[] availableEngineVolumes = {1.5F, 2f, 2.5f, 3f};
        CarColor[] availableColors = {CarColor.RED, CarColor.BLUE, CarColor.GREEN, CarColor.BLACK, CarColor.WHITE};
        WheelSize[] availableWheelSizes = {WheelSize.SMALL, WheelSize.MEDIUM, WheelSize.LARGE, WheelSize.EXTRA_LARGE, WheelSize.XXL, WheelSize.XXXL};

        CarFactory carFactory = new CarFactory(availableModels, availableEngineVolumes, availableColors, availableWheelSizes);
        Service service = new Service();
        CarShowroom carShowroom = new CarShowroom(carFactory, service);

        carFactory.printAvailableOptions();

        carShowroom.orderCar(CarModel.COROLLA, CarColor.BLUE, Year.YEAR_2020,  WheelSize.MEDIUM, 2f);

        Car car = new Car(CarColor.RED, CarModel.COROLLA, Year.YEAR_2020, WheelSize.MEDIUM, 2f);
        carShowroom.changeCarColor(car, CarColor.BLACK);

        carShowroom.replaceCarWheels(car, WheelSize.LARGE);

        carShowroom.addCarOption(car, "Leather seats");

        carShowroom.removeCarOption(car, "Leather seats");

        carShowroom.setCarOptions(car, new String[]{
                "Bluetooth connectivity",
                "Sunroof",
                "Navigation system",
                "Back-up camera",
                "Blind spot monitoring",
                "Adaptive cruise control",
                "Self-parking system"});
    }
}
