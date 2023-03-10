package Transport;
import Driver.Driver;
import Exceptions.DiagnosticsNotPassed;
import Mechanic.Mechanic;

import java.util.List;

public class Car extends Transport implements Competing {

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивен");
        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }


    }
    private BodyType bodyType;
    public Car(String brand, String model, int engineVolume, List<Mechanic> mechanics, Driver driver, BodyType bodyType) {
        super(brand, model, engineVolume, mechanics ,driver);
        this.bodyType = bodyType;
    }

    @Override
    public void pitStop() {
        System.out.println(this.getBrand() + " " + this.getModel() + " pit stopped.");
    }

    public String getBodyType() {
        return bodyType.name();
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

        return this.getBrand() + " "+ this.getModel() + " " + getEngineVolume() +" " + bodyType;
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }else System.out.println(this.getBrand() + " "+ this.getModel() + " is " +getBodyType());
    }

    @Override
    public void diagnostics() throws DiagnosticsNotPassed {
        System.out.println(this.getBrand() + " "+ this.getModel() + " прошел диагностику.");
    }
}

