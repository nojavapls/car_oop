package Transport;

import Exceptions.DiagnosticsNotPassed;

public class Truck extends Transport implements Competing{

    public enum LoadCapacity {
        Small(0, 12.0),
        Medium(3.5, 12.0),
        Large(12.0, 0);
        private double min;
        private double max;

        LoadCapacity(double min, double max) {
            this.min = min;
            this.max = max;
        }

    }
    private LoadCapacity loadCapacity;
    public Truck(String brand, String model, int engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public double getMin() {
        return loadCapacity.min;
    }
    //
    public double getMax() {
        return loadCapacity.max;
    }

    public String getLoadCapacity() {
        return loadCapacity.name();
    }


    @Override
    public void pitStop() {
        System.out.println(this.getBrand() + " " + this.getModel() + " pit stopped.");
    }


    @Override
    public void maxSpeed(int speed) {
        System.out.println(this.getBrand() + " " + "max speed: " + speed);
    }

    @Override
    public void bestTime(int time) {
        System.out.println(this.getBrand() + " " + "best time: " + time);
    }

    @Override
    public String toString() {
        String caps = "no data";
        if (getMax() != 0 && getMin() == 0)
            caps = "Грузоподъемность: до " + getMax();
        if (getMax() == 0 && getMin() != 0)
            caps = "Грузоподъемность: от " + getMin();
        if (getMax() != 0 && getMin() != 0)
            caps = "Грузоподъемность: от " + getMin() + " до " + getMax();
       return this.getBrand() + " "+ this.getModel() + " " + getEngineVolume() +" " + caps;
    }
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }else System.out.println(this.getBrand() + " "+ this.getModel() + " is " + getLoadCapacity());
    }

    public void diagnostics() throws DiagnosticsNotPassed {
        System.out.println(this.getBrand() + " "+ this.getModel() + " прошел диагностику.");
    }
}
