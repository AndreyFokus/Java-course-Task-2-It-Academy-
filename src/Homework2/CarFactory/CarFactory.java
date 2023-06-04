package Homework2.CarFactory;

import Homework2.Car.Car;
import Homework2.CarColor.CarColor;
import Homework2.CarModel.CarModel;
import Homework2.WheelSize.WheelSize;
import Homework2.Year.Year;

import java.util.Arrays;


public class CarFactory {
    private final CarModel[] availableModels;
    private final float[] availableEngineVolumes;
    private final CarColor[] availableColors;
    private final WheelSize[] availableWheelSizes;
    private Car[] carStock;

    public CarFactory(CarModel[] availableModels, float[] availableEngineVolumes,
                      CarColor[] availableColors, WheelSize[] availableWheelSizes) {
        this.availableModels = availableModels;
        this.availableEngineVolumes = availableEngineVolumes;
        this.availableColors = availableColors;
        this.availableWheelSizes = availableWheelSizes;
        this.carStock = new Car[0];
    }

    public void printAvailableOptions() {
        System.out.println("Available Models: " + Arrays.toString(availableModels));
        System.out.println("Available Engine Volumes: " + Arrays.toString(availableEngineVolumes));
        System.out.println("Available Colors: " + Arrays.toString(availableColors));
        System.out.println("Available Wheel Sizes: " + Arrays.toString(availableWheelSizes));
    }

    public Car createCar(CarModel model, CarColor color, Year year, WheelSize wheelSize, float engineVolume) {
        boolean isValidYear = false;
        for (Year availableYear : Year.getAvailableYears()) {
            if (availableYear == year) {
                isValidYear = true;
                break;
            }
        }
        if (!isValidYear) {
            throw new IllegalArgumentException("Invalid year");
        }
        for (int i = 0; i < carStock.length; i++) {
            Car car = carStock[i];
            if (car.getModel() == model && car.getEngineVolume() == engineVolume) {
                Car[] newCarStock = new Car[carStock.length - 1];
                for (int j = 0; j < i; j++) {
                    newCarStock[j] = carStock[j];
                }
                for (int j = i + 1; j < carStock.length; j++) {
                    newCarStock[j - 1] = carStock[j];
                }
                carStock = newCarStock;
                return car;
            }
        }
        Car newCar = new Car(color, model, year, wheelSize, engineVolume);
        return newCar;
    }

    public void addCarToStock(Car car) {
        Car[] newCarStock = new Car[carStock.length + 1];
        for (int i = 0; i < carStock.length; i++) {
            newCarStock[i] = carStock[i];
        }
        newCarStock[carStock.length] = car;
        carStock = newCarStock;
    }
}

