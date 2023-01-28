package Transport;
import Driver.Driver;
import Exceptions.DiagnosticsNotPassed;
import Mechanic.Mechanic;

import java.util.List;

public class Bus extends Transport implements Competing {

    public enum Capacity {
        EXTRA_MINI(0, 10),
        MINI(11, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);
        private int min;
        private int max;

        Capacity(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

        public Bus(String brand, String model, int engineVolume, List<Mechanic> mechanics, Driver driver, Capacity capacity) {
            super(brand, model, engineVolume, mechanics, driver);
            this.capacity = capacity;
        }

    private Capacity capacity;
    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " pit stopped.");
    }

    public double getMin() {
        return capacity.min;
    }
    //
    public double getMax() {
        return capacity.max;
    }
    @Override
    public void maxSpeed(int speed) {
        System.out.println(this.getBrand() + " " + "max speed: " + speed);
    }

    @Override
    public void bestTime(int time) {
        System.out.println(this.getBrand() + " " + "best time: " + time);
    }

    public String getCapacity() {
        return capacity.name();
    }
    @Override
    public String toString() {
        String caps = "no data";
        if (getMax() != 0 && getMin() == 0)
            caps = "Вместимость: до " + getMax() + " мест.";
        if (getMax() == 0 && getMin() != 0)
            caps = "Вместимость: от " + getMin() + " мест.";
        if (getMax() != 0 && getMin() != 0)
            caps = "Вместимость: от " + getMin() + " до " + getMax() + " мест.";
        return this.getBrand() + " "+ this.getModel() + " " + getEngineVolume() +" " + caps;
    }
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }else System.out.println(this.getBrand() + " "+ this.getModel() + " is " + getCapacity() );
    }

    @Override
    public void diagnostics() throws DiagnosticsNotPassed {
        throw new DiagnosticsNotPassed("Автобус: диагностика не требуется", this);
    }

}
