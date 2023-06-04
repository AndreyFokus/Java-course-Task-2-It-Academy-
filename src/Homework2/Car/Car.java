package Homework2.Car;

import Homework2.CarColor.CarColor;
import Homework2.CarModel.CarModel;
import Homework2.WheelSize.WheelSize;
import Homework2.Year.Year;

import java.util.Arrays;

public class Car {
    private CarColor color;
    private final CarModel model;
    private Year year;
    private WheelSize wheelSize;
    private final float engineVolume;
    public String[] options;

    public Car(CarColor color, CarModel model, Year year, WheelSize wheelSize, float engineVolume) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        this.options = new String[0];
    }

    public CarColor getColor() {
        return color;
    }

    public CarModel getModel() {
        return model;
    }


    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String[] getOptions() {
        return options;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void addOption(String option) {
        String[] newOptions = new String[options.length + 1];
        for (int i = 0; i < options.length; i++) {
            newOptions[i] = options[i];
        }
        newOptions[options.length] = option;
        options = newOptions;
    }

    public void removeOption(String option) {
        String[] newOptions = new String[options.length - 1];
        int index = 0;
        for (int i = 0; i < options.length; i++) {
            if (!options[i].equals(option)) {
                newOptions[index] = options[i];
                index++;
            }
        }
        options = newOptions;
    }

    public void printInfo() {
        System.out.println("Car Information:");
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Wheel Size: " + wheelSize);
        System.out.println("Engine Volume: " + engineVolume);
        System.out.println("Options: " + Arrays.toString(options));
    }
}


