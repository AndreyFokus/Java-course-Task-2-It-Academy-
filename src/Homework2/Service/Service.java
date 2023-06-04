package Homework2.Service;


import Homework2.Car.Car;
import Homework2.CarColor.CarColor;
import Homework2.WheelSize.WheelSize;

public class Service {
    public void changeColor(Car car, CarColor color) {
        car.setColor(color);
    }

    public void replaceWheels(Car car, WheelSize wheelSize) {
        car.setWheelSize(wheelSize);
    }

    public void addOption(Car car, String option) {
        car.addOption(option);
    }

    public void removeOption(Car car, String option) {
        car.removeOption(option);
    }

    public void setOptions(Car car, String[] options) {
        car.options = options;
    }
}

